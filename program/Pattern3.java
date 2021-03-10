package program;

import java.util.Scanner;

public class Pattern3 {
 public static void main(String ar[]) {
	 Scanner scn=new Scanner(System.in);
       

        int rows = scn.nextInt();        
        for (int i= 1; i<= rows ; i++)
        {
            for (int j=i; j <rows ;j++)            
        {
                System.out.print(" ");
            }
            for (int k=1; k<=i;k++) { System.out.print("*"); } System.out.println(""); } for (int i=rows; i>=1; i--)
        {
            for(int j=i; j<=rows;j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<i ;k++) 
            {
                System.out.print("*");
            }
            System.out.println("");
 
        }
        scn.close();
    }
}