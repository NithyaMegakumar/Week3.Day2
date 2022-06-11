package week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingNumberUsingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = {4,6,5,2,3,1,9,10,8,8,6,2};
		int count = 1;
		
//		Convert Array to list
		List<Integer> list = Arrays.asList(a);
		
		
//      Sorting the array
		Collections.sort(list);

		System.out.println("The Sorted list of given array " +list);
		
//      Using set method to remove the duplicate value
		Set<Integer> list1 = new HashSet<Integer>(list);
		System.out.println("The list after removing the duplicates of given array: " +list1);
		System.out.println("The Size after removing the duplicates :" +list1.size());
		
// 		creating object array to convert set to array
		Integer[] newArray = new Integer[list1.size()];
		
//		convert set to array 
		list1.toArray(newArray);
		
//		Iterate from the starting number and verify the next number is +1
		for (int i = 0; i < newArray.length; i++) {
			if((newArray[i])!=(i+count))
			{
				System.out.println("The missing number in the given array " +(i+count));
				count++;
				break;
			}

		}
	}
}










