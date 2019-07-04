import java.util.*;
class RemoveDuplicate
{
	public static void main(String ...args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int i = 0;
		char a[] = s.toCharArray();
		int size = a.length;
		Map<Character,Integer>lmap = new LinkedHashMap<>();
		String result = "";
		while(i!=size)
		{
			if(lmap.containsKey(a[i])==false)
			{
				lmap.put(a[i],1);
			}else
			{
				int oldval = lmap.get(a[i]);
				int newval = oldval+1;
				lmap.put(a[i],newval);
			}
			++i;
		}
		Set<Map.Entry<Character,Integer>>hmap = lmap.entrySet();
		for(Map.Entry<Character,Integer>data : hmap)
		{
			result+=data.getKey();
		}
		System.out.println(result);
	}
}