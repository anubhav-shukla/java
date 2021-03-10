package program;
import java.io.*; 

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				if(n-i==0) {
					for(int k=0;i<n;i++) {
					System.out.print("  ");
					}
				}
				System.out.print("* ");

			}
			System.out.println();
			
						}
	}}