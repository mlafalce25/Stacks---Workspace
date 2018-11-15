import java.util.*;
public class stack2 {

	public static void main(String[] args) {
		String original = "Matthew LaFalce";
		String reversed = "";
		Stack<Character> S = new Stack<>();
		
		
		for(int x = 0; x < original.length(); x++){
			S.push(original.charAt(x));
			
		}
		
		for(int x = 0; x < original.length(); x++){
			reversed += S.pop();
		}
		
		System.out.println(reversed);
	}

}
