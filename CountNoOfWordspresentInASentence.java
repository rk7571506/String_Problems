class CountNoOfWordspresentInASentence
{
	public static void main(String []args)
	{
		String x = "We Are Proude Indians.";
		String y[] = x.split(" ");
		
		System.out.println("No of Words In String:"+y.length);
		
		System.out.println("The Words Are:");
		for(int i=0;i<y.length;i++)
		{
			System.out.println(y[i]);
		}
	}
}