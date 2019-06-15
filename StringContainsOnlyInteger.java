/* Simple Way:-
	Input:
		012345
	Output:
		 Integer String
	Input:
		 56A56
	Output:
		Not An Integer String
		
*/
class StringContainsOnlyInteger 
{
	public static void main(String[] args) 
	{
		String s = "012345";
		char y[] = s.toCharArray();
		int i=0;
		int size = y.length;

		while(i!=size)
		{
			if(y[i]>='0' && y[i]<='9')
			{
				++i;
			}else
			{
				System.out.println("Not An Integer String.");
				System.exit(0);
			}
		}
		System.out.println("Integer String.");
	}
}
