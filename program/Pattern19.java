package program;
import java.util.Scanner;
public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scn = new Scanner(System.in);
	        int n=scn.nextInt();
	        // write ur code here
	       int sp=n/2;
	       int st=1;
	       for(int i=1;i<=n;i++){
	           for(int j=1;j<=sp;j++){
	        	   if(i==n/2+1) {
	        		   System.out.print("*\t");
	        	   }else
	               System.out.print("\t");
	           }for(int j=1;j<=st;j++){
	               System.out.print("*\t");
	           }if(i<=n/2) {
	        	   st++;
	           }else {
	        	   st--;
	           }
	           System.out.println();
	       }
	}

}
