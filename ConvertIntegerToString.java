class ConvertIntegerToString
{
	public static void main(String []args)
	{
		int i = 65;
		String s = Integer.toString(i);
		
		System.out.println(s); //65, but it is string data/object.
		System.out.println(i); //65 , and it is integer data.
	}
}