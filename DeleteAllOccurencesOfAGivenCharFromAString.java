class DeleteAllOccurencesOfAGivenCharFromAString
{
	public static void main(String []args)
	{
		String s = "SPIDERSLIES";
		char y[] = s.toCharArray();
		int size = y.length;
		char key = 'S';
		String res = "";
		int i=0;
		
		while(i!=size)
		{
			if(y[i]!=key)
			{
				res = res + y[i];
			}
			++i;
		}
		System.out.println(res);
	}
}