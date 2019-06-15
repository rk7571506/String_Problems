/*Reverse String.*/
class ReverseString 
{
	public static void main(String[] args) 
	{
		String s = "Hello";
		char a[] = s.toCharArray();
		int size = a.length;
		char b[] = new char[size];
		int i=0;

		while(i!=size)
		{
			b[size-i-1] = a[i];
			i++;
		}
		System.out.println(a);
		System.out.println(b);
	}
}
