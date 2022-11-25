package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesPay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "PayPal India";
		char charArray[] = s.toLowerCase().toCharArray();
		Set<Character> charSet = new HashSet<Character>();
		Set<Character> dupCharSet = new HashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			boolean add = charSet.add(charArray[i]);

			if (!add) {
				boolean add1 = dupCharSet.add(charArray[i]);
				System.out.println(dupCharSet);
			}
		}
		charSet.removeAll(dupCharSet);

		System.out.println("After removing the duplicates characters" +charSet.toString().replace(",", "").replace(" ", ""));

	}

}
