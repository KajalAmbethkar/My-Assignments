package week3.day2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {
	public static void main(String[] args) {
		String text = "we learn java basics as part of java sessions in java week1";
		char[] charArray = text.toCharArray();

		// Array of String
		String[] s = text.split("\\s");
		for (String s2 : s) {
			System.out.println(s2);

		}

		Set<String> myEmptySet = Collections.<String>emptySet();
		System.out.println("Empty set: " + myEmptySet);

		Set<String> newSet = new LinkedHashSet<String>();
		for (int i = 0; i < s.length; i++) {
			newSet.add(s[i]);

		}
		// Iterate to the list
		for (String st : newSet) {

			System.out.print(st);

		}
	}
}
