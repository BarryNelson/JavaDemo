import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <pre>
 * Exerciser for class ManipulatorDemo.
 * Purpose is to demonstrate array and String manipulation
 * 
 * @author Barry Nelson
 *
 */
public class Main {

	public static void main(String[] args) {
		
		ManipulatorDemo manipulator = new ManipulatorDemo();
		
		/*
		 *  1. Write a function that sorts an array of numbers where odds appear first.
		 */
		Integer[] numbers = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		List<Integer> intList = new ArrayList<Integer>(Arrays.asList(numbers));
		ArrayList<Integer> os = manipulator.oddSort(intList);
		StringBuilder answer = new StringBuilder();
		for ( Integer number : os) {
			if (answer.length() > 0){
				answer.append(", ");
				answer.append(number);
			}
		}
		System.out.println(answer.toString());
		
		/* 
		 * 2. Write a function that reverses every word in a string, e.g.
		 * Input: "My name is Max"
		 * Output: "Max is name My"
		 */
		System.out.println(manipulator.reverseWordOrder("My name       is Max"));
		
		/*
		 * 3. Write a function to reverse a string, e.g.
		 * Input: "Hello world!"
		 * Output: "!dlrow olleH"
		 */
		System.out.println(manipulator.reverseString("Hello world!"));
		
		/*
		 * 3.B Write a function to reverse a string, e.g. recursively
		 * Input: "Hello world!"
		 * Output: "!dlrow olleH"
		 */
		System.out.println(manipulator.reverseStringRecursive("Hello world!"));

		/*
		 * 4. Find the first non-repeated character in a string (appears once only). 
		 */
		System.out.println(manipulator.findFirstUniqChar("aaaba"));
		System.out.println(manipulator.findFirstUniqChar("THIS HAS A UNIQUE CHARACTER OR TWO, SO, NOW WHAT IS IT?"));
		
		
		/*
		 * 5. Given an input string, and a string of word delimiters,
		 * return the index of the nth word in the string.?
		 */
		System.out.println(manipulator.findWordByCount("scan this,string_bigdelimiter_scan-something"," |,|_bigdelimiter_|-",3));

		/*
		 * 6. Given an array of Integers, remove duplicates without sorting
		 */
		Integer[] cleanArray = manipulator.removeDuplicates(new Integer[]{1,2,9,3,4,4,4,5,2,9});
		for (Integer val : cleanArray) {
			System.out.print(val);
		}

		
	}
}
