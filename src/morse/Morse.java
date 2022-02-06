package morse;

public class Morse 
{
	private String morse [] = {". _   ", "_ . . .   ", "_ . _ .   ", "_ . .   ", ".   ", ". . _ .   ", "_ _ .   ", ". . . .   ", ". .   ", ". _ _ _   ", "_ . _   ", ". _ . .   ",
			"_ _   ", "_ .   ", "_ _ _   ", ". _ _ .   ", "_ _ . _   ", ". _ .   ", ". . .   ", "_   ", ". . _   ", ". . . _   ", ". _ _   ", "_ . . _   ", "_ . _ _   ", "_ _ . .   ",
			". _ . _ . _   ", "_ _ . . _ _   ", ". . _ _ . .   ", "    "};
	
	public Morse()
	{
		
	}
	
	public String getMorse(int position)
	{
		return morse[position];
	}
	
	String convertToEnglish(String x)
	{
	    x = x + "   ";
	    for (int i = 0; i < 30; i++)
	    {
	        if(x.compareTo(morse[i]) == 0)
	        {
	        	English newChar = new English();
	            return Character.toString(newChar.getEnglish(i));
	        }
	    }
	    return "";
	}
	
}
