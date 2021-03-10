package challengeof50Days;
import java.util.*;
public class DecimaltoAnyBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int  b=scn.nextInt();
    int d=DecimalCfromBase( n, b);
    System.out.println(d);
    
	}

	private static int DecimalCfromBase(int n, int b) {
		// TODO Auto-generated method stub
		int rv=0;
		int p=1;
		while(n>0) {
			int dig=n%b;
			n=n/b;
			rv +=dig*p;
			p=p*10;
			
		}
		return rv;
	}
	

}
