package week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		//Using array
		int[] arry = {1,2,3,4,7,6,8};
		Arrays.sort(arry);
		for(int i = 1;i<arry.length;i++) {
			if(i != arry[i-1]) {
				System.out.println(i);
				break;
			}
		}
		
		//Using Collection
		Integer[] data1 = {1,2,3,4,7,6,8};
		List<Integer> lst = Arrays.asList(data1);
		Collections.sort(lst);
		for(int i = 1;i<lst.size();i++) {
			if(i != lst.get(i-1)) {
				System.out.println(i);
				break;
			}
		}
	}

}
