package week3.day2;

import java.util.Map;
import java.util.TreeMap;

public class FindNumbersOccurance {

	public static void main(String[] args) {
		int[] num= {2,3,5,6,3,2,1,4,2,1,6,-1};
		Map<Integer,Integer> map=new TreeMap<Integer,Integer>();
		for (int i = 0; i < num.length; i++) {
			if(map.containsKey(num[i]))
			{
				Integer value = map.get(num[i]);
				map.put(num[i], value+1);
			}
			else
			{
				map.put(num[i], 1);
			}
		}
		
System.out.println(map);
	}

}
