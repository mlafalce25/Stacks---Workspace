/**
 * @author Matthew LaFalce
 *
 */
import java.util.Stack;


public class stack1 {

	public static void main(String[] args) {
		int x = 12345;
		int y = 0;
		Stack S = new Stack();
		int m =1;
		int z=0;
		
		while(x>0){
			int d = x % 10;
			S.push(d);
			x = x / 10;
			
		}
				
		while(!S.empty()){
			z = (int) S.pop();
			y+= z*m;
			m=m*10;
		}
		System.out.println(y);
	}
	

}
