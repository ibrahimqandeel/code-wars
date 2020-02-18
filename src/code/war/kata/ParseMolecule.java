package code.war.kata;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * link: https://www.codewars.com/kata/52f831fa9d332c6591000511/train/java
 */
public class ParseMolecule {
//K4[ON(SO3)2]2

	public static ArrayList<String> getElement(String input) {
		// K4[ON(SO3)2]2
		ArrayList<String> atomsList = new ArrayList<>();
		HashMap<String, String> openBrackets = new HashMap<>();
		openBrackets.put("[", "]");
		openBrackets.put("{", "}");
		openBrackets.put("(", ")");
		HashMap<String, String> closeBrackets = new HashMap<>();
		closeBrackets.put("]", "]");
		closeBrackets.put("}", "}");
		closeBrackets.put(")", ")");

		String element = "";
		int size = input.length(); // 13
		int startIndex = 0;
		char tempChar;
		while (startIndex < size) { // 2<13
			tempChar = input.charAt(startIndex); // K, 4, [
			if (!openBrackets.containsKey(tempChar + "") && !closeBrackets.containsKey(tempChar + "")) {
				element = readUntilBracket(input.substring(startIndex));
				if (element != null && !element.isEmpty()) {
					atomsList.add(element);
					startIndex += element.length();// 1,2,3
				} else {
					startIndex++;
				}
			} else if (openBrackets.containsKey(tempChar + "")) {
				element = readAfterBracket(input.substring(startIndex), tempChar);// [ON(SO3)2]2, [ ---> 2,
				if (element != null && !element.isEmpty()) {
					atomsList.add(element);
				}
				startIndex++;
			} else {
				startIndex++;
			}
		}
		return atomsList;
	}

	public static String readUntilBracket(String input) {
		HashMap<String, String> openBrackets = new HashMap<>();
		openBrackets.put("[", "]");
		openBrackets.put("{", "}");
		openBrackets.put("(", ")");
		HashMap<String, String> closeBrackets = new HashMap<>();
		closeBrackets.put("]", "]");
		closeBrackets.put("}", "}");
		closeBrackets.put(")", ")");

		String element = "";
		int startIndex = 0;
		char tempChar;
		while (startIndex < input.length()) {
			tempChar = input.charAt(startIndex); // K, 4, [
			if (!openBrackets.containsKey(tempChar + "") && !closeBrackets.containsKey(tempChar + "")) {
				if (!isNumber(tempChar)) {
					element += tempChar;// K+4
//					System.out.println(element);
				} else if ((startIndex - 1) >= 0 && !closeBrackets.containsKey(input.charAt(startIndex - 1) + "")) {
					element += tempChar;// K+4
//					System.out.println(element);
				}
			} else {
				break;
			}
			startIndex++;
		}
		return element;
	}

	public static String readAfterBracket(String input, char openBracket) {
		HashMap<String, String> openBrackets = new HashMap<>();
		openBrackets.put("[", "]");
		openBrackets.put("{", "}");
		openBrackets.put("(", ")");
		String value = "";
		int startIndex = input.indexOf(openBrackets.get(openBracket + "")) + 1;// 10
		char bracketValue;
		while (startIndex < input.length()) {// 10 < 11
			bracketValue = input.charAt(startIndex);// 2
			if (isNumber(bracketValue)) {
				value += bracketValue; // 2
			} else {
				break;
			}
			startIndex++;
		}

		return value;
	}

	private static boolean isNumber(char numValue) {
		if (numValue >= 49 && numValue <= 57) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = '1';
		int z = '9';
		System.out.println(a);
		System.out.println(z);
		String input = "MgH2O";
		ArrayList<String> result = getElement(input);
		for (String var : result) {
			System.out.println(var);
		}
	}

}
