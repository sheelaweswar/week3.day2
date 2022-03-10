package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lst1 = new ArrayList<Integer>();
		List<Integer> lst2 = new ArrayList<Integer>();
		Integer[] arr1 = {3,2,11,4,6,7};
		Integer[] arr2 = {1,2,8,4,9,7};
		Collections.addAll(lst1, arr1);
		Collections.addAll(lst2, arr2);
		String resultint = "";
		for(int i = 0;i<lst1.size();i++) {
			for(int j = 0;j<lst2.size();j++) {
				if(lst1.get(i) == lst2.get(j) ) {
					if(resultint.isEmpty()) {
						resultint += lst1.get(i).toString();
					} else {
						resultint += ","+ lst1.get(i).toString();
					}
					
				}
				
			}
			
		}
		System.out.println("Print Intersection value :" +resultint);
		
		
	}

}
