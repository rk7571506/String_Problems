/*
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase.
	Input:
		SILENT
		LISTEN
	Output:
		Anagram String
	
	Input:
		BRAINY
		BINARY
	Output:
		Anagram String

	Input:
		Hello
		lloeY
	Output:
		Not An Anagram String
	
*/
import java.util.*;
class AnagramString_withoutSpaces 
{
	public static void main(String[] args) 
	{
		String x = "SILENT";
		char a[] = x.toCharArray();
		String y = "LISTEN";
		char b[] = y.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);

		boolean t = Arrays.equals(a,b);

		if(t==true)
		{
			System.out.println("Anagram String");
		}else
		{
			System.out.println("Not An Anagram String");
		}





	}
}
