/*
	Copying One String into another String.
*/
class CopyingString 
{
	public static void main(String[] args) 
	{
		String s = "Ravi Ranjan";
		char a[] = s.toCharArray();
		int size = a.length;
		char b[] = new char[size];
		int i=0;

		while(i!=size)
		{
			b[i] = a[i];
			i++;
		}
		System.out.println(a);
		System.out.println(b);
	}
}
