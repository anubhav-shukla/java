package challengeof50Days;
import java.util.*;
public class Get_subsequences_recursion_on_the_way {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scn=new Scanner(System.in);
    String str=scn.nextLine();
    printSS(str,"");
	}

	private static void printSS(String ques, String ans) {
		// TODO Auto-generated method stub
		if(ques.length()==0) { 
			System.out.println(ans);
			return;
		}
		char ch=ques.charAt(0);
		String roq=ques.substring(1);
		printSS(roq,ans+ch);
		printSS(roq,ans+"");
		
	}

}
