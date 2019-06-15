/*
String Conversion LowerCaseToUpperCase  
	Input:
		raviranjan
	Output:
	    RAVIRANJAN

	Logic:
		a-> A
		'A' = 'a'-32
		A->a
		'a' = 'A'+32

*/
class LowerCaseToUpperCase_Program1 
{
	public static void main(String[] args) 
	{
		String s = "raviranjan";
		char y[] = s.toCharArray();
		int i=0;
		int size = y.length;

		while(i!=size)
		{
			y[i] = (char)(y[i]-32);
			i++;
		}
		System.out.println(s);
		System.out.println(y);
	}
}
