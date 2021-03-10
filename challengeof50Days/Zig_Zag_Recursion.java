package challengeof50Days;
import java.util.*;
public class Zig_Zag_Recursion {

	public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    pzz(n);
	}

	private static void pzz(int n) {
	    if(n==0) {
	    	return;
	    	
	    }
		System.out.print(n+ " ");
	    pzz(n-1);
		System.out.print(n+ " ");
		pzz(n-1);
		System.out.print(n+ " ");
	}

}
