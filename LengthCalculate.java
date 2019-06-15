/** computing string length */ 

class LengthCalculate 
{
	public static void main(String[] args) 
	{
		String s = "My Name Is Ravi Ranjan.";
		s = s.concat("\0");
		char []a = s.toCharArray();
		int i=0;
		int count=0;

		while(a[i]!='\0')
		{
			++count;
			++i;
		}
		System.out.printf("%d\n",count);

		String x = "Ravi Ranjan";
		System.out.println(x.length());
	}
}
