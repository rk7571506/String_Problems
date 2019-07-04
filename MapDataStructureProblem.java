import java.util.*;
class MapDataStructureProblem 
{
	public static void main(String[] args) 
	{ 
		char a[] = {'A','R','A','D','H','Y','A'};
		Map<Character,Integer>map = new HashMap<>();
		int i=0;
		int size = a.length;
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
	//	System.out.println(map);
		Set<Map.Entry<Character,Integer>> dg = map.entrySet();
		for(Map.Entry<Character,Integer>data:dg)
			{
				System.out.print(data.getKey()+":");
				System.out.println(data.getValue());
				
			}
	}
}
