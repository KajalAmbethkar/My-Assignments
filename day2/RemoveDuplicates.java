package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.jsoup.select.Evaluator.ContainsOwnText;
import org.testng.annotations.BeforeClass;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		
		// Array of String
		String[] split = text.split(" ");
		for (int i = 0; i < split.length; i++)
			System.out.println(split[i] + "");

		if (text.contains("java")) {
			System.out.println(text.contains("java"));
			count++;
		{

		//if (count > 1) {
			 String replaceString=text.replaceAll("java", "");
			System.out.println(replaceString);
			
		
		}
		//Not Using Hash set because it would not display in proper order so using Linked HAshset.
		Set<String> unique = new LinkedHashSet<String>();
		//Iterate to the list
		for (int i = 0; i < split.length; i++) {
			//adding each word
			unique.add(split[i]);

		}
		for (String s : unique) {
			System.out.print(" "   +s);
		}

	}
}}
