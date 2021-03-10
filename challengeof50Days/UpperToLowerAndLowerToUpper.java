package challengeof50Days;
import java.util.Scanner;
public class UpperToLowerAndLowerToUpper {
     public static String ToogleCase(String str) {
    	 StringBuilder sb=new StringBuilder(str);
    	 for(int i=0;i<sb.length();i++) {
    		 char ch =sb.charAt(i);
    		 
    		 if(ch>='a'&&ch<='z') {
    			 char uch=(char)('A'+ch-'a');
    			 sb.setCharAt(i, uch);
    		 }else if(ch>='A'&&ch<='Z') {
    			 char Lch=(char)('a'+ch-'A');
    			 sb.setCharAt(i, Lch); 
    		 }
    	 }
    	 return sb.toString();
     }
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
         String str=scn.next();
         System.out.println(ToogleCase(str));
	}

}
