package program;
import java.util.Scanner;
public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
	     int nspaces = n / 2;
	        int nstars = 1;
	        int val=1;
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= nspaces; j++) {
	                System.out.print("\t");
	            }
              int cval=1;
	            for (int j = 1; j <= nstars; j++) {
	                System.out.print(cval+"\t");
	                if(j<=nstars/2) {
	                	cval++;
	                }else {
	                	cval--;
	                }
	               	                
	            }

	            if (i <= n / 2) {
	                nspaces--;
	                nstars += 2;
	                val++;
	            } else {
	                nspaces++;
	                nstars -= 2;
	                val--;
	            }

	            System.out.println();
	        }

	}
	}

