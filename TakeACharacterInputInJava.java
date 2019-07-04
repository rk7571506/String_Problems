import java.lang.*;
import java.util.*;
class TakeACharacterInputInJava
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		char a = sc.next().charAt(0); //abc 
		System.out.println(a); //a
		
		String b = sc.next(); //abc
		System.out.println(b); //abc
		
	//	char d = sc.next(); // incompatible types : String cannot be converted to char
	
		
	//String c = sc.next().charAt(0); //incompatible types: char cannot be converted to String
	}
}