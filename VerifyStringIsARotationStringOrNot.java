import java.lang.*;
class VerifyStringIsARotationStringOrNot
{
	public static void main(String []args)
	{
		String originalstring = "ARADHYA";
		String keystring = "RADHYAA";
		
		String newstring = originalstring.concat(originalstring);
		
		if(newstring.contains(keystring))
		{
			System.out.println("Rotational String");
		}else
		{
			System.out.println("Not A Rotational String");
		}
	}
}