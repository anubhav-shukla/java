package challengeof50Days;
import java.util.Scanner;
public class InputStringInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scn=new Scanner(System.in);
     int n=Integer.parseInt(scn.nextLine());
     String name=scn.nextLine();
     System.out.println("Dear "+name+" Here is your counting");
     for(int i=1;i<=n;i++) {
    	 System.out.println(i);
     }
	}

}
