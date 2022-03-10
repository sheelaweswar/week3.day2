package week3.day2;

import java.util.Arrays;

public class AnagramAssm {

	public static void main(String[] args) {
		AnagramAssm anagram = new AnagramAssm();
		boolean isEqual = anagram.isAnagramEqual("stops", "posts");
		System.out.println("isEqual:"+isEqual);
	}
	
	private boolean isAnagramEqual(String text1, String text2) {
		int txt1lnth = text1.length();
		int txt2lnth = text2.length();
		if(txt1lnth != txt2lnth) {
			return false;
		}
		char[] txtarry1 = text1.toCharArray();
		char[] txtarry2 = text2.toCharArray();
		Arrays.sort(txtarry1);
		Arrays.sort(txtarry2);
		boolean isEqual = Arrays.equals(txtarry1, txtarry2);
		return isEqual;
	}

}
