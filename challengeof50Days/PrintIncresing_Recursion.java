package challengeof50Days;
import java.util.*;
public class PrintIncresing_Recursion {

	public static void main(String[] args) throws Exception {
     Scanner Scn=new Scanner(System.in);
     int n=Scn.nextInt();
     PrintIncreasing(n);
	}
	public static void PrintIncreasing(int n) {
		if(n==0) {
			return;
		}
		PrintIncreasing(n-1);
		System.out.println(n);
		
	}

}
