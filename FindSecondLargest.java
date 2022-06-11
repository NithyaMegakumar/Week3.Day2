package week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		Integer[] data = {3,2,11,4,6,7};

		//		convert array to list
		List<Integer> list = Arrays.asList(data);
		//		Sort the array
		Collections.sort(list);
		//		Get the sorted array		
		for (int i = 0; i < data.length; i++) {

			System.out.println(list.get(i));

		}

		//		Getting second Largest Number			
		Integer secondLargestNum = list.get(data.length-2);
		//		Printing the second largest Number
		System.out.println("The second largest number is "+secondLargestNum);

	}

}
