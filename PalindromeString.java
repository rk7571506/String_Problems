/*
	Palindrome String.

	Input: Pass
			LEVEL -> Palindrome.
			RADAR -> Palindrome.
			REFER -> Palindrome.

			INDIA -> Not Palindrome

	Input: This is Wrong Case.
			case-1:
				too not to hoot.
			case-2:
				too Hot to HOOT

*/
class PalindromeString 
{
	public static void main(String[] args) 
	{
		//String x = "LEVEL";
		String x = "INDIA";
		char a[] = x.toCharArray();
		int size = a.length;
		char b[] = new char[size];
		int i=0;

		while(i!=size)
		{
			b[size-i-1] = a[i];
			++i;
		}

		i=0;

		while(i!=size)
		{
			if(a[i]!=b[i])
			{
				System.out.println("Not Palindrome");
				System.exit(0);
			}else
			{
				i++;
				continue;
			}
		}
		System.out.println("Palindrome");
	}
}
