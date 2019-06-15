/*
	Input:
		RAVI RANJAN IS BEST
	Output:
	    ravi ranjan is best
*/
class UpperToLower_WithSpaces_Program4 
{
	public static void main(String[] args) 
	{
		String s = "RAVI RANJAN IS BEST";
		char y[] = s.toCharArray();
		int i=0;
		int size=y.length;

		while(i!=size)
		{
			if(y[i]!=' ')
			{
				y[i] = (char)(y[i]+32); 
				//y[i] = (char)(y[i]-32);
			}
			++i;
		}
		System.out.println(s);
		System.out.println(y);
	}
}
