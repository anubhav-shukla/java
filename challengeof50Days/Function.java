package challengeof50Days;
import java.util.Scanner;
public class Function {
	public static void display(int n,int r,int npr) {
		System.out.println(n+"P"+r+" = "+npr);
	}
     public static int fact( int x) {
    	 int rv=1;
    	 for(int i=1;i<=x;i++) {
    		 rv=rv*i;
    	 }
    	 return rv;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int r=scn.nextInt();
		
		int factz=fact(n);
		int nfactz=fact(n-r);
		int npr= factz/nfactz;
	    display(n,r,npr);
		
	}

}
