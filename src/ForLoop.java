
public class ForLoop {

	public static void main(String[] args) {
		
		int length =5;
		int sum = forLoopMethod(length);
         System.out.println(sum);
	}

	public static int forLoopMethod(int length){
		int sum = 0;
		for(int i=0; i<length || i==length; i++) { //same as (i=0; i<=length;i++)
		  sum+=i;		
		} 
		return sum;
	}
}
