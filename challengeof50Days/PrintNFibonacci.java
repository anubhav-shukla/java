package challengeof50Days;
import java.util.Scanner;
public class PrintNFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scn=new Scanner(System.in);
    		int n=scn.nextInt();
    		for(int i=0;i<=n;i++) {
    			for(int j=1;j<=i;j++) {
    				System.out.println(i+j);
    			}
    	
    		}
    		
	}

}
