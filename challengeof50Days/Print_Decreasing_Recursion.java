package challengeof50Days;
import java.util.Scanner;
public class Print_Decreasing_Recursion {

	public static void main(String[] args) throws Exception {
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      PrintDecreasing(n);
	}
	public static void PrintDecreasing(int n) {
		if(n==0) {
			return;
		}
	System.out.println(n);
	PrintDecreasing(n-1);
	
	}
}
