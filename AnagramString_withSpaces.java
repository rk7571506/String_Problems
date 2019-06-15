/*
	Input:
			He Is aRAdHYA
			Is He HRADAYa
	output:
		Anagram String
*/
import java.util.*;
class AnagramString_withSpaces  
{
	public static void main(String[] args) 
	{	
		String x = "He Is aRAdHYA";
		String y = "Is He HRADAYa";
		x = x.replace(" ","");
		y = y.replace(" ","");
		x = x.toUpperCase();
		y = y.toUpperCase();

		char a[] = x.toCharArray();
		char b[] = y.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);

		boolean t = Arrays.equals(a,b);
		
		if(t==true)
		{
			System.out.println("An Anagram String.");
		}else
		{
			System.out.println("Not An Anagram String.");
		}
	}
}
