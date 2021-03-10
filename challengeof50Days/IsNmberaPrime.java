package challengeof50Days;
import java.util.Scanner;
public class IsNmberaPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
	      int t = scn.nextInt();
	      
	      for(int i = 0; i < t; i++){
	          int n = scn.nextInt();
	          
	          int div = 2;
	          while(div * div <= n){
	              if(n % div == 0){
	                  break;
	              }
	              div++;
	          }
	          
	          if(div * div > n){
	              System.out.println("prime");
	          } else {
	              System.out.println("not prime");
	          }
	      }
	  
	}
}
