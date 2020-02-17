package code.war.kata;

import java.util.ArrayList;
import java.util.HashMap;
/*
 * link: https://www.codewars.com/kata/52f831fa9d332c6591000511/train/java
 */
public class ParseMolecule {
//K4[ON(SO3)2]2

	public static String getElement(String input, int startIndex, int endIndex) {
		HashMap<String, String> openingBrackets = new HashMap<>();
		openingBrackets.put("[", "]");
		openingBrackets.put("(", ")");
		openingBrackets.put("{", "}");
		HashMap<String, String> closingBrackets = new HashMap<>();
		closingBrackets.put("]", "]");
		closingBrackets.put(")", ")");
		closingBrackets.put("}", "}");
		String element = "";
		String tempChar;
		ArrayList<String> elementsList = new ArrayList<>();
		int i = 0;
		endIndex = input.length();
		int indexChar;
		while (i < endIndex) {
			tempChar = input.charAt(i) + "";
			element = "";
			while (!openingBrackets.containsKey(tempChar) && !closingBrackets.containsKey(tempChar) && i < endIndex) {
				element += tempChar;
				i++;
				if (i < endIndex) {
					tempChar = input.charAt(i) + "";
				}
			}
			System.out.println(element);
			if (openingBrackets.containsKey(tempChar)) {
				indexChar = input.indexOf(openingBrackets.get(tempChar)) + 1;
				if (indexChar < endIndex) {
					element = input.charAt(indexChar) + "";
					endIndex = indexChar - 1;
					System.out.println(element);
				}
			}
			i++;
		}

		return "";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 'a';
		int z = 'z';
		System.out.println(a);
		System.out.println(z);
		String input = "K4[ON(SO3)2]2";
		getElement(input, 0, input.length());
	}

}
