/*
	String Program Conversion UpperCaseToLowerCase.
		Input:
			RAVIRANJAN
			raviranjan
*/
class UpperCaseToLowerCase_Program2 
{
	public static void main(String[] args) 
	{
		String s = "RAVIRANJAN";
		char y[] = s.toCharArray();
		int i=0;
		int size = y.length;
		
		while(i!=size)
		{
			y[i] = (char)(y[i]+32);
			i++;
		}
		System.out.println(s);
		System.out.println(y);
	}
}
