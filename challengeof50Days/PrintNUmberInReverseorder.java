package challengeof50Days;

import java.util.Scanner;

public class PrintNUmberInReverseorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn=new Scanner(System.in);
		    int n=scn.nextInt();

	           while(n != 0){
	               int digit = n % 10;
	               n = n / 10;
		           System.out.println(digit);

	   	}
	}
}
