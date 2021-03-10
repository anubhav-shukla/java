package challengeof50Days;
import java.util.*;
public class Get_Maze_path_SOl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scn=new Scanner(System.in);
       int n=scn.nextInt();
       int m=scn.nextInt();
       printmazepath(0,0,n,m,"");}

	private static void printmazepath(int sr, int sc, int dr, int dc, String psf) {
		// TODO Auto-generated method stub
		if(sr>dr||sc>dc) {
			return;
		}
		if(sr==dr&&sc==dc) {
			System.out.println(psf);
			return;
		}
		
		printmazepath(sr,sc+1,dr,dc,psf+"h");
		printmazepath(sr+1,sc,dr,dc,psf+"v");
		
		
		
	}
	
		 
		
		
	}


