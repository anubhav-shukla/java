package MiniProject;
import java.util.*;
public class Gussing_number {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int mynumber = (int)(Math.random()*100);
    	int usernumber= 0;
    	do {
    		System.out.println("Guess Number: ");
    		usernumber = sc.nextInt();
    		if(usernumber==mynumber) {
    			System.out.println("WOOO CORRECT GUESS!!!!");
    			break;
    		}
    		else if(usernumber > mynumber){
    			System.out.println("Your NUmber is  too large");
    		}
    		else {
    			System.out.println("Your number is too low");
    		}
    		
    	}while(usernumber >= 0);
    	System.out.println("My number was : ");
    	System.out.println(mynumber);
    }
}
