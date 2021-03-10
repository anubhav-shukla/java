package challengeof50Days;
import java.util.*;
public class Get_Maze_PAth_jump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int m=scn.nextInt();
    ArrayList<String> paths=Get_Maze_PAth_jump(1,1,n,m);
    System.out.println(paths);
	}

	private static ArrayList<String> Get_Maze_PAth_jump(int sr, int sc, int dr, int dc) {
		// TODO Auto-generated method stub
		if(sr==dr&&sc==dc) {
			ArrayList<String> bres=new ArrayList<>();
			bres.add("");
			return bres;
		}
		ArrayList<String> paths=new ArrayList<>();
		
		//Horizontal Moves
		for(int ms=1;ms<=dc-sc;ms++) {
			ArrayList<String> hpaths=Get_Maze_PAth_jump(sr,sc+ms,dr,dc);
			for(String hpath:hpaths) {
				paths.add("h"+ms+hpath);
			}
		}
		
		//vertical moves
		for(int ms =1;ms<=dr-sr;ms++) {
			ArrayList<String> vpaths=Get_Maze_PAth_jump(sr+ms,sc,dr,dc);
			for(String vpath:vpaths) {
				paths.add("v"+ms+vpath);
			}
		}
		//diagonal path
		for(int ms=1;ms<=dc-sc&&ms<=dr-sr;ms++) {
			ArrayList<String> dpaths=Get_Maze_PAth_jump(sr+ms,sc+ms,dr,dc);
			for(String dpath:dpaths) {
				paths.add("d"+ms+dpath);
			}
		}
		return paths;
	}

}
