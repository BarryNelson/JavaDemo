import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.text.Keymap;

public class ManipulatorDemo {

	/**
	 * <pre>
	 * Sorts an array of numbers where odds appear first.
	 * This does not sort in numerical order.
	 * </pre>
	 * 
	 * @return sorted array
	 */
	public ArrayList<Integer> oddSort(List<Integer> intList) {
		ArrayList<Integer> oddSortedArray = new ArrayList<Integer>();
		ArrayList<Integer> evenArray = new ArrayList<Integer>();

		for (Integer number : intList) {
			int x = number;
			System.out.println(x>>1);
			if (Integer.lowestOneBit(number) == 1) {
				oddSortedArray.add(number);
			} else {
				evenArray.add(number);
			}
		}

		oddSortedArray.addAll(evenArray);

		return oddSortedArray;
	}

	/**
	 * Reverses the word order in a String. Words must be separated by spaces. Excess whitespace before and after is
	 * removed.
	 * 
	 * <pre>
	 * Ex "  one        two three   " returns "three two one"
	 * </pre>
	 * 
	 * @param input
	 *            the String to be word reversed
	 * @return the word reversed String
	 */
	public String reverseWordOrder(String input) {
		if (input == null || input.length() < 3) {
			return input;
		}

		// split on spaces
		String[] sArray = input.trim().split("\\s+");
		StringBuilder sBuilder = new StringBuilder(sArray[sArray.length - 1]);
		// reassemble in reverse
		for (int i = sArray.length - 2; i >= 0; i--) {
			sBuilder.append(" ");
			sBuilder.append(sArray[i]);
		}

		return sBuilder.toString();
	}

	/**
	 * Reverse a String
	 * 
	 * @param input
	 *            the input String
	 * 
	 * @return a reverse order String
	 */
	public String reverseString(String input) {

		if (input == null || input.length() < 2) {
			return input;
		}
		StringBuffer sBuff = new StringBuffer(input);
		return sBuff.reverse().toString();
	}

	/**
	 * Reverse a String in a recursive manner.
	 * 
	 * @param input
	 *            the input String
	 * 
	 * @return a reverse order String
	 */
	public String reverseStringRecursive(String input) {
		int index = input.length() - 1;
		String reverse = "";
		if (index > -1) {
			reverse = input.charAt(index) + reverseStringRecursive(input.substring(0, index));
		}
		return reverse;
	}

	/**
	 * Find the first non-repeated character in a string (appears once only).
	 * 
	 * @param input
	 * @return
	 */
	public char findFirstUniqChar(String input) {
		ArrayList<Character> uniqList = new ArrayList<Character>();
		HashMap<Character, Integer> stringHashMap = new HashMap<Character, Integer>(input.length());
		for (char chr : input.toCharArray()) {
			Integer val = 0;
			if (stringHashMap.containsKey(chr)) {
				val = stringHashMap.get(chr);
				int index = uniqList.indexOf(chr);
				if (index > -1) {
					uniqList.remove(index);
				}
			} else {
				uniqList.add(chr);
			}
			stringHashMap.put(chr, val + 1);
		}

		Character uniqChar = uniqList.get(0);

		return uniqChar;
	}

	/**
	 * 5. Given an input string, and a string of word delimiters, return the index of the nth word in the string.?
	 * 
	 * @param input
	 * @param delimiters
	 * @param count
	 * @return
	 */
	public int findWordByCount(String input, String delimiters, int count) {
		String[] words = input.split(delimiters);
		int index = input.indexOf(words[count]);
		for (int i=0; i<count-1; i++){
			if (words[i].equals(words[count])){
				index = input.indexOf(words[count], ++index);
			}
		}
		
		return index;
	}

	/**
	 * 6. Given an array of Integers, remove duplicates without sorting
	 * 
	 * @param integers
	 * @return Integer[] - array of unique Integers in the order of first occurrence
	 */
	public Integer[] removeDuplicates(Integer[] integers) {
		HashMap<Integer, Boolean> valMap = new HashMap<Integer, Boolean>();
		ArrayList<Integer> cleanList = new ArrayList<Integer>();
		Boolean existsFlag = null;
		for (Integer x : integers) {
			existsFlag = valMap.get(x);
			if (existsFlag == null) {
				cleanList.add(x);
			}
			valMap.put(x, true);

		}
		Integer[] cleanArray = new Integer[cleanList.size()];
		cleanList.toArray(cleanArray);
		return cleanArray;
	}

}
