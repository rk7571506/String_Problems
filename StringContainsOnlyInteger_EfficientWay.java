/* Efficient Way:-
	Input:
		012345
	Output:
		 Integer String
	Input:
		 56A56
	Output:
		Not An Integer String
		
*/
class StringContainsOnlyInteger_EfficientWay 
{
	public static void main(String[] args) 
	{
		String s = "56A56";
		int size = s.length();
		int i=0;
		while(i!=size)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
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
