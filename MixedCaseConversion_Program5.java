/*
	Input:
		my name is ravi ranjan
	Output:
		My Name Is Ravi Ranjan
*/
class MixedCaseConversion_Program5
{
	public static void main(String[] args) 
	{
		String s = "my name is ravi ranjan";
		char y[] = s.toCharArray();
		y[0] = (char)(y[0]-32);
		int i=1;
		int size=y.length;
		
		while(i!=size)
		{
			if(y[i]==' ')
			{
				y[i+1] = (char)(y[i+1]-32);
			}
			++i;
		}
			System.out.println(s);
			System.out.println(y);
	}
}
