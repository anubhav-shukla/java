package challengeof50Days;
import java.util.*;
public class Get_Subssequences__ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scn=new Scanner(System.in);
    String str=scn.next();
    ArrayList<String> res=gss(str);
    
		System.out.println(res);
		
	}

	private static ArrayList<String> gss(String str) {
		if(str.length()==0) {
			ArrayList<String> bres= new ArrayList<>();
			bres.add("");
			return bres;
		}
		char ch= str.charAt(0);
		String ros=str.substring(1);
		ArrayList<String> rress=gss(ros);
		ArrayList<String> mres=new ArrayList<>();
		for(String rstr:rress) {
			mres.add(""+rstr);
		}	for(String rstr:rress) {
			mres.add(ch+rstr);
		}
	
		return mres;
	}

}
