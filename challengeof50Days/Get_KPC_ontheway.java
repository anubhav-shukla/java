package challengeof50Days;
import java.util.*;

public class Get_KPC_ontheway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scn=new Scanner(System.in);
      String str=scn.next();
      printKPC(str,"");
	}
	static String[] codes= {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
	private static void printKPC(String ques, String ans) {
		// TODO Auto-generated method stub
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		
		char ch=ques.charAt(0);
		String roq=ques.substring(1);
		
		String codeforch=codes[ch-'0'];
		for(int i=0;i<codeforch.length();i++) {
			char cho=codeforch.charAt(i);
			printKPC(roq,ans+cho);
		}
		
	}

}
