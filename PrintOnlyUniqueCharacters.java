package week3.day2;


import java.util.LinkedHashSet;
import java.util.Set;

public class PrintOnlyUniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "baabu";
		
		char[] char1 = str.toCharArray();
		
		Set<Character> uniq = new LinkedHashSet<Character>();
		
		
		System.out.println(char1);
		System.out.println("    ");
		
    
		
		for (int i = 0; i < char1.length; i++) {
			if (!uniq.add(char1[i])){
				uniq.remove(char1[i]);
			}
		}
				System.out.println(uniq);
			}
			
				
				
			}
			
				
		
	


