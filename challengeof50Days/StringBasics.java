package challengeof50Days;
import java.util .*;
public class StringBasics {

	public static void main(String[] args) {
//INPUT
		Scanner scn=new Scanner(System.in);
		String gh=scn.next();
		System.out.println(gh);
		//Differnce between using next and nextLine
		String sh=scn.nextLine();
		   
		   System.out.println(sh);

	   String s="GOlu";
	   //Add two String
	   String g = "hello "+s;
	   //Length of String
		System.out.println(s.length());
		
		//For character read
		System.out.println(s.charAt(0));
		
		// for which point to which read character
		System.out.println(s.substring(0,3));
		System.out.println(g);
		
		// For Split String by comma And Space 
String m="sjks dskjdsjdk jsdisjd sd niods isd ";
   String[] parts=m.split(" ");
   for(int i=0;i<parts.length;i++) {
   System.out.println(parts[i]);
   }	
   //Print a group of String
   for(int i=0;i<s.length();i++) {
	   for(int j=i+1;j<s.length();j++) {
		   System.out.println(s.substring(i,j));
	   }
   }
	
	
	}

}
