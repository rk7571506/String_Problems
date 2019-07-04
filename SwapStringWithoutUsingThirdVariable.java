import java.lang.*;
class SwapStringWithoutUsingThirdVariable
{
	public static void main(String []args)
	{
		String x = "ABC";
		String y = "TECH";
		
		System.out.println("Before Swaping x is:"+x);
		System.out.println("Before Swaping y is:"+y);
		
		x = x+y;
		y = x.substring(0,x.length()-y.length());
		x = x.substring(x.length()-y.length()-1,x.length());
		
		System.out.println("Before Swaping x is:"+x);
		System.out.println("Before Swaping y is:"+y);
	}
}