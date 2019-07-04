class SwapStringUsingThirdVariable
{
	public static void main(String args[])
	{
		String x = "ABC";
		String y = "TECH";
		
		System.out.println("Before Swaping x is:"+x);
		System.out.println("Before Swaping y is:"+y);
		
		String temp = "";
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("After Swaping x is:"+x);
		System.out.println("After Swaping y is:"+y);

	}
}