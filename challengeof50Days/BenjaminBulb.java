package challengeof50Days;

import java.util.Scanner;

public class BenjaminBulb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();
          
          for(int i = 1; i * i <= n; i++){
              System.out.println(i * i);
          }

	}

}
