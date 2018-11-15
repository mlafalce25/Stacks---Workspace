import java.util.*;

public class PalidromeCheckerStack {

	public static void main(String[] args) {
		String original;
		String reversed = "";
		Stack<Character> S = new Stack<>();
		Scanner s = new Scanner(System.in);
		
		//reads word from command line.
		System.out.print("Please enter a word to be checked: ");
		original = s.nextLine();
		
		
		//reverses word 
		for(int x = 0; x < original.length(); x++){
			S.push(original.charAt(x));
			
		}
		
		for(int x = 0; x < original.length(); x++){
			reversed += S.pop();
		}
		
		//Output original and reversed
		System.out.println();
		System.out.println();
		System.out.println("Original String: "+original);
		System.out.println("Reversed String: "+reversed);
		System.out.println();
		
		//Check for Palindrome
		if(original.equalsIgnoreCase(reversed)){
			System.out.println("Yes! "+original+" is a palindome!");
		}
		else{ 
			System.out.println("No! "+original+" is not a palindome!");
		}
		
	}

}
