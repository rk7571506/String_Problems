/*
	A Pangram is a sentence using every letter of a given alphabet at least once.
	Input:
		THE QUICK BROWN FOX JUMPS OVER A LAZY DOG
	Output:
		Pangram String.
*/
class PangramString 
{
	public static void main(String[] args) 
	{
		String x = "THE QUICK BROWN FOX JUMPS OVER A LAZY DOG";
		x = x.replace(" ","");
		char y[] = x.toCharArray();
		int i=0;
		int size = y.length;
		int a[] = new int[26];
		for(int j=0;j<a.length;j++)
		{
			a[j]=0;
		}

	
		while(i!=size)
		{
			int index = y[i]-65;
			a[index] = 1;
			++i;
		}
		i=0;
		while(i!=26)
		{
			if(a[i]==1)
			{
				++i;
			}else
			{
				System.out.println("Not A Pangram String.");
				System.exit(0);
			}
			++i;
		}
		System.out.println("Pangram String.");
	}
}
