package week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		

		//	Convert array to list
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(set.add(arr[i]) == false)
			{
				System.out.println("The duplicated " +arr[i]);
			}

			
		}
		


	}

}
