package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*4. MUST solve
4.1 Create empty arrylist to store strings
4.2. Add some strings : "one","two","three","four" ....."ten","three","five"
Confirm if dups are allowed or not 
Is it a ordered collection ?
Is it a sorted collection ?

Display list contents , using for-each*/

public class TestStringList {

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

		/*
		 * 4.3 Accept a string from user(using scanner) If it exists in the list ,
		 * display the index of it's 1st occurrence. Otherwise print a mesg : doesn't
		 * exist
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to search in the arraylist :");
		String reqstr = sc.next();

		if (strList2.contains(reqstr)) {
			System.out.println("Index of entered String in ArrayList is :" + strList2.indexOf(reqstr));
		} else {
			System.out.println("Entered string doesn't exist in Arraylist");
		}

//4.4 Upper case all the strings from the array list , which starts with char 't' Display the list contents again

		for (int i = 0; i < strList2.size(); i++) {

			if (strList2.get(i) != null) {
				String str3 = strList2.get(i);
				if (str3.startsWith("t")) {
					strList2.set(i, str3.toUpperCase());
					System.out.println(strList2.get(i).toUpperCase());
				} else
					System.out.println(strList2.get(i));
			}
		}

// 4.5 Accept index from user Remove the string at a specified index.

		System.out.println("Enter a index to remove that element from arrayList");
		int i = sc.nextInt();
		System.out.println(strList2.remove(i) + " is removed from the arraylist ");
		System.out.println("New ArrayList" + strList2);

//4.6 Create another arraylist , having the same contents of the earlier list Display it's contents.

		ArrayList<String> strList3 = new ArrayList<>();
		strList3.addAll(strList);
		System.out.println(strList3); 

//4.7 Sort 1st arraylist.Display contents of both of the Arraylist		

		Collections.sort(strList);
		System.out.println("Sorted ArrayList 1:" + strList);
		System.out.println("ArrayList 2:" + strList3);

//4.8 Remove all the strings from the 2nd list , containing a char 'e'. Display it 

		System.out.println(strList3.size());
		for (int j = 0; j < strList3.size(); j++) {
			if (strList3.get(j).contains("e")) {
				 System.out.println(strList3.get(j));
				System.out.println(strList3.remove(j) + " is removed ");
			}
		}

//		for (String string : strList3) {
//			int c=0;
//			if(string.contains("e")) {
//				System.out.println(strList3.remove(c));
//			
//			}
//			c++;
//		}
		System.out.println("After removing string which are containing 'e' " + strList3);
	}

}
