package week3.day2;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Using Arrays
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		System.out.println(data[data.length-2]);
		
		//Using Collections
		Integer[] data1 = {3,2,11,4,6,7};
		List<Integer> lst = Arrays.asList(data1);
		Collections.sort(lst);
		System.out.println(lst.get(lst.size()-2));
		
	}

}
