package week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = {1,2,3,4,7,6,8};
		int count = 1;

		//	Convert array to list
		List<Integer> list = Arrays.asList(a);

		//	Sort the array
		Collections.sort(list);
		//	
		for (int i = 0; i < list.size(); i++)
			//	Check if the iterator variable is not equal to the array values respectively			
		{
			if((list.get(i))!=(i+count))
			{
				System.out.println("The missing number in the given array " +(i+count));
				count++;
				break;
			}


		}
	}

}

