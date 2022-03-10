package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintDuplicatesInArray {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] data1 = {14,12,13,11,15,14,18,16,17,19,18,17,20,14};
		List<Integer> lst = Arrays.asList(data1);
		Collections.sort(lst);
		int datalstlnt = lst.size();
		System.out.println("The length of the list is :" +datalstlnt);
		int count;
		for(int i = 0; i<=datalstlnt-1;i++) {
			count = 0;
			for(int j = i+1;j<datalstlnt;j++) {
				if(lst.get(i) == lst.get(j)) {
					count=count+1;
				}
			}
			if(count > 0) {
				System.out.println(lst.get(i));
			}
			
		}

	}*/
	
	public static void main(String[] args) {
		Integer[] data1 = {14,12,13,11,15,14,18,16,17,19,18,17,20,14};
		List<Integer> lst = Arrays.asList(data1);
		Collections.sort(lst);
		int datalstlnt = lst.size();
		List<Integer> dupList = new ArrayList<Integer>();
		System.out.println("The length of the list is :" +datalstlnt);
		int count;
		for(int i = 0; i<=datalstlnt-1;i++) {
			count = 0;
			for(int j = i+1;j<datalstlnt;j++) {
				if(lst.get(i) == lst.get(j) && !dupList.contains(lst.get(j))) {
					count=count+1;
					dupList.add(lst.get(i));
				}
			}
			if(count > 0) {
				System.out.println(lst.get(i));
			}
			
		}

	}

}
