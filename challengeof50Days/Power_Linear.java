package challengeof50Days;
import java.util.*;
public class Power_Linear {

	public static void main(String[] args) {
     Scanner scn=new Scanner(System.in);
     int x=scn.nextInt();
     int n=scn.nextInt();
     int xn=power(x,n);
     System.out.println(xn);
		
		
	}

	private static int power(int x, int n) {
		if(n==0) {
			return 1;
		}
		int fxn1=power(x,n-1);
		int fx=x*fxn1;
		return fx;
	}

}
