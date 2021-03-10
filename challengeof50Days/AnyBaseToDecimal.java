package challengeof50Days;
  import java.util.Scanner;
public class AnyBaseToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scn=new Scanner(System.in);
     int n=scn.nextInt();
     int b=scn.nextInt();
     int d= BaseToDecimal(n,b);
     System.out.println(d);
	}

	private static int BaseToDecimal(int n, int b) {
		// TODO Auto-generated method stub
		int rv=0;
		int p=1;
		while(n>0) {
			int dig =n%10;
			n=n/10;
			rv +=dig*p;
			p=p*b;
		}
		
		return rv;
	}

}
