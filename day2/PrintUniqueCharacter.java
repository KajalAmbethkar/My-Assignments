package week3.day2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String name="kajal";
		
		char charArray[]=name.toCharArray();
		Set<Character> unique=new LinkedHashSet<Character>();
		Set<Character> duplicate=new LinkedHashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			boolean add = unique.add(charArray[i]);
		
			if (!add) {
				boolean add1 = duplicate.add(charArray[i]);
				System.out.println(duplicate);
			}
		}
		unique.removeAll(duplicate);

		System.out.println(unique);
		}
		}
		
		
		