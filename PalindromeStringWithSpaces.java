/*
	Input: pass(Test Case)
		Case-1:
		    too hot to hoot
		case-2:
		    too Hot to HOOT
*/
class	PalindromeStringWithSpaces
{
	public static void main(String[] args) 
	{
		String x = "too Hot to HOOT";
		/*Convert Full String */
		x = x.toLowerCase(); // x= x.toUpperCase();
		x = x.replace(" ",""); //replace " " to ""
		char y[] = x.toCharArray();

		int size = y.length;
		int i=0;
		char z[] = new char[size];

		while(i!=size)
		{
			z[size-i-1] = y[i];
			++i;
		}
		i=0;
		while(i!=size)
		{
			if(z[i]!=y[i])
			{
				System.out.println("Not Palindrome String");
				System.exit(0);
			}else
			{
				i++;
				continue;
			}
		}
		System.out.println("Palindrome String");
	
	}
}
