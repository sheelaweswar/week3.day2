package week3.day2;

import java.util.HashMap;
import java.util.HashSet;
public class FindTypes {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		FindTypes objfndtype = new FindTypes();
		objfndtype.fndTypes(test);
	}

	private void fndTypes(String test) {
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		char[] textchar = test.toCharArray();
		for (int i = 0;i<textchar.length;i++) {
			if(Character.isLetter( textchar[i])) {
				letter++;
			}
			else if(Character.isDigit(textchar[i])) {
				num++;
			}
			else if(Character.isSpace(textchar[i])) {
				space++;
			}
			else {
				specialChar++;
			}

		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

	}




}

