class ConvertStringToInteger
{
	public static void main(String []args)
	{
		String s = "65";
		int i = Integer.parseInt(s);
		
		System.out.println(s); //65, but it is string data/object.
		System.out.println(i); //65 , and it is integer data.
	}
}