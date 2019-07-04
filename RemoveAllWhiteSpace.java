import java.util.*;
class RemoveAllWhiteSpace
{
	public static void main(String ...args)
	{
		String x = "JOIN ABC GET SKILLED	GET PLACED	OR TAKE COMPLETE REFUND.";
		
		x = x.replaceAll("\\s",""); //replace all kind of white spaces.
		
		System.out.println(x);
	}
}