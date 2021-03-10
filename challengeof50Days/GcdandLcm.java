package challengeof50Days;

import java.util.Scanner;

public class GcdandLcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
	    	    Scanner scn = new Scanner(System.in);
	    	    int num1 = scn.nextInt();
       int num2 = scn.nextInt();
       
       int tnum1 = num1;
       int tnum2 = num2;

       while(tnum1 % tnum2 != 0){               
           int rem = tnum1 % tnum2;
           tnum1 = tnum2;
           tnum2 = rem;
       }
       
       int gcd = tnum2;
       int lcm = (num1 * num2)/gcd;

       System.out.println(gcd);
       System.out.println(lcm);
	    }

		
	}

