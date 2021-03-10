package program;
import java.util.Scanner;
public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
	        int n = scn.nextInt();

	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                if (j == i) {
	                    System.out.print("*\t");
	                } else {
	                    System.out.print("\t");
	                }
	            }

	            System.out.println();
	        }

	}

}
