package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
//using list
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		List<String> lst = new ArrayList<String>();
		String[] textarry = text.split(" ");
		String finalWord = "";
		for (String str : textarry) {
			if(!lst.contains(str)) {
				lst.add(str);
				finalWord = finalWord + " " + str;
			}
		}
		System.out.println("finalWord:"+finalWord);
	}*/
	//Using Set
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		//int count = 0;
		List<String> lst = new ArrayList<String>();
		Set<String> set = new LinkedHashSet<String>();
		String[] textarry = text.split(" ");
		for (String str : textarry) {
			lst.add(str);
			set.add(str);
		}
		System.out.println("lst:"+lst);
		System.out.println("set:"+set);
		
		String correctSentece = "";
		for (String string : set) 
		{
			correctSentece += " " + string;
		}
		System.out.println("correctSentece:"+correctSentece);
	}

}
