package program;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i-1;j++) {
				System.out.print("      ");
			}
			for(int j=0;j<n-i;j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		
	}

}
