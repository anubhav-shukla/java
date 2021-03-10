package challengeof50Days;
import java.util.Scanner;
public class DigitOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int count=0;
    int temp=n;
    while(temp!=0) {
    	temp/=10;
    	count++;
    }
    int divide= (int) Math.pow(10, count);
    while(divide!=0) {
    	
    	int q=(n/divide);
    	System.out.println(q);
    	n=n%divide;
    	divide=divide/10;
    }
	}

}
