/*
	Input:
		ravi ranjan is best
	Output:
	    RAVI RANJAN IS BEST
*/
class LowerToUpper_WithSpaces_Problem3 
{
	public static void main(String[] args) 
	{
		String s = "ravi ranjan is best";
		char y[] = s.toCharArray();
		int i=0;
		int size=y.length;

		while(i!=size)
		{
			if(y[i]!=' ')
			{
				y[i] = (char)(y[i]-32);

			}
			++i;
		}
		System.out.println(s);
		System.out.println(y);

	}
}
