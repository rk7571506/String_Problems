class ForEachLoop 
{
	public static void main(String[] args) 
	{
		int a[] = {10,20,30,40,50};
		int sum=0;
		for(int data : a){
			sum+= data;
		}
		System.out.println(sum);
	}
}
