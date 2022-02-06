package morse;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.Cursor;
import javax.swing.JTextArea;

public class MorseGui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MorseGui frame = new MorseGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MorseGui() {
		setForeground(Color.BLACK);
		setFont(new Font("Dialog", Font.PLAIN, 11));
		setTitle("Morse code converter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1105, 728);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(230, 230, 250));
		panel.setBounds(10, 10, 1071, 671);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel titleLabel = new JLabel("Your text:");
		titleLabel.setBounds(10, 41, 82, 28);
		titleLabel.setFont(new Font("Arial Black", Font.BOLD, 14));
		panel.add(titleLabel);
		
		JTextArea resultLabel = new JTextArea();
		resultLabel.setFont(new Font("Arial Black", Font.PLAIN, 13));
		resultLabel.setEditable(false);
		resultLabel.setBackground(new Color(230, 230, 250));
		resultLabel.setForeground(new Color(0, 0, 0));
		resultLabel.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		resultLabel.setBounds(84, 365, 904, 273);
		panel.add(resultLabel);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(102, 31, 828, 121);
		textPane.setToolTipText("Text goes here");
		textPane.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		panel.add(textPane);
		
		
		JButton morseBtn = new JButton("Convert to Morse");
		morseBtn.setToolTipText("Morse conversion");
		morseBtn.setBounds(142, 174, 178, 89);
		morseBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textPane.getText();
				String newText = "";
				for(int i = 0; i < text.length(); i++)
				{
					English tempChar = new English();
					String newChar = tempChar.convertToMorse(text.toUpperCase().charAt(i));
					newText = newText + newChar;
				}
				resultLabel.setText(newText);
			}
		});
		morseBtn.setBackground(new Color(123, 104, 238));
		morseBtn.setHorizontalAlignment(SwingConstants.LEFT);
		morseBtn.setFont(new Font("Arial Black", Font.PLAIN, 13));
		panel.add(morseBtn);
		
		JButton engBtn = new JButton("Convert to English");
		engBtn.setToolTipText("English conversion");
		engBtn.setBounds(632, 174, 178, 89);
		engBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textPane.getText();
				String newText = "";
				Morse tempChar = new Morse();
				String[] tokens = text.split("   ");
				for(int i = 0; i < tokens.length; i++)
				{
					String newChar = tempChar.convertToEnglish(tokens[i].trim());
					newText = newText + " " + newChar ;
				}
				resultLabel.setText(newText);
			}
		});
		engBtn.setBackground(new Color(123, 104, 238));
		engBtn.setHorizontalAlignment(SwingConstants.LEFT);
		engBtn.setFont(new Font("Arial Black", Font.PLAIN, 13));
		panel.add(engBtn);
		
		
		
		
		
	}
}
