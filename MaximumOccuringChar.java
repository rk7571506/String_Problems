import java.util.*;
class MaximumOccuringChar
{
	public static void main(String ...args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char a[] = s.toCharArray();
		int i = 0;
		int size = a.length;
		Map<Character,Integer>lmap = new LinkedHashMap<>();
		
		char maxkey = ' ';
		int maxval = 0;
		
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
			if(data.getValue()>maxval){
				maxval = data.getValue();
				maxkey = data.getKey();
			}
		}
		System.out.println(maxkey+" "+maxval);
	}
}