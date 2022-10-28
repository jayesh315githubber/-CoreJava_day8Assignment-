package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class TestStringList2 {

	public static void main(String[] args) {

//	4.1 Create empty arraylist to store strings
		ArrayList<String> strList = new ArrayList<>();
//		Add some strings
		strList.add("one");
		strList.add("two");
		strList.add("three");
		strList.add("four");
		strList.add("five");
		strList.add("four");
		strList.add("ten");
		strList.add("eigth");
		strList.add("nine");
		// strList.add(null);
		strList.add("six");

		System.out.println(strList);

//	Display list contents , using for-each 	
		for (String string : strList) {
			System.out.println(string);
		}

		String str[] = { "one", "two", "three", "four", "five", "four", "six", "eight", "nine", "eight" };
		ArrayList<String> strList2 = new ArrayList<>(Arrays.asList(str));
		System.out.println(strList2);

	
	}

}
