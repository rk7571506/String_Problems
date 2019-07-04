import java.util.*;
class FirstNonRepChar
{
	public static void main(String ...args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char a[] = s.toCharArray();
		int size = a.length;
		int i=0;
		
		Map<Character,Integer> lmap = new LinkedHashMap<>();
		
		while(i!=size)
		{
			if(lmap.containsKey(a[i])==false){
				lmap.put(a[i],1);
			}else
			{
				int oldval = lmap.get(a[i]);
				int newval = oldval+1;
				lmap.put(a[i],newval);
			}
			++i;
		}
		
		Set<Map.Entry<Character,Integer>> hmap = lmap.entrySet();
		for(Map.Entry<Character,Integer>data : hmap)
		{
			if(data.getValue()==1)
			{
				System.out.println(data.getKey());
				System.exit(0);
			}
		}
	}
}