package challengeof50Days;
import java.util.*;
public class Power_Logarthemic_Recursion {

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
		int xpn2=power(x,n/2);
		int xn=xpn2*xpn2;
		if(n%2==1) {
			xn=xn*x;
		}
		return xn;
	}
	

}
