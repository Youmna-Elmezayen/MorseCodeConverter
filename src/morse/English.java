package morse;


public class English 
{
	private char english[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 
			'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z','.',',','?', ' '};
	
	public English()
	{
		
	}
	
	public char getEnglish(int position)
	{
		return english[position];
	}
	
	String convertToMorse(char x)
	{
	    for(int i = 0; i < 30; i++)
	    {
	        if(x == english[i])
	        {
	        	Morse newChar = new Morse();
	            return newChar.getMorse(i);
	        }
	    }
	    return "";

	}
}
