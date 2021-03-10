package program;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scn = new Scanner(System.in);
	        int n= scn.nextInt();
//	        // write ur code here
//	        for (int  i=1;i<=n;i++){
//	            for(int j=1;j<=n-i;j++){
//	                System.out.print("        ");
//	            }
//	            for(int j=1;j<=i;j++){
//	                System.out.print("*\t");
//	            }
//	            System.out.println();
//	        }
	        int nspaces = n - 1;
	        int nstars = 1;

	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= nspaces; j++) {
	                System.out.print("\t");
	            }

	            for (int j = 1; j <= nstars; j++) {
	                System.out.print("*\t");
	            }

	            nspaces--;
	            nstars++;
	            System.out.println();
	        }

	}

}
