/*Check If String has all unique character.*/
import java.util.*;
import java.lang.*;
class  FindUniqueChar
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s = sc.nextLine();
		char a[] = s.toCharArray();
		Map<Character,Integer> map = new HashMap<>();
		int i=0, size=a.length;
		while(i!=size){
			if(map.containsKey(a[i])==false){
				map.put(a[i],1);
			}else
			{
				int oldval = map.get(a[i]);
				int newval = oldval+1;
				map.put(a[i],newval);
			}
			++i;
		}
			
		Set<Map.Entry<Character,Integer>> st = map.entrySet(); 
		
		for(Map.Entry<Character,Integer>data:st){
			if(data.getValue()>1){
				System.out.println("String is Contains Duplicate Character.");
				System.exit(0);
			}
		}
		System.out.println("String is not contains Duplicate Character.");
	}
}
