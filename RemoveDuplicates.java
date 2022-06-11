package week3.day2;



public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";

		//Split the String into array and iterate over it		
		String[] splitWords = text.split(" ");
		for (int i = 0; i < splitWords.length; i++) {

		//Initialize another loop to check whether the word is there in the array
			for (int j = i+1; j < splitWords.length; j++) {
				
		//if it is available then replace the word as "" 
				if(splitWords[i].equals(splitWords[j])) {
					
					splitWords[j]=" ";

				}
			}
		}
		//Displaying the String without duplicate words
		for (int i = 0; i < splitWords.length; i++) {
			System.out.print(splitWords[i]);
			System.out.print(" ");

		}
	}
}






//		
//		
//		
////		
//		for (int i = 0; i < splitWords.length; i++) {
//			
//		
//	
//				System.out.print(splitWords[]);
//			}
//			
//		}
//		
//}



