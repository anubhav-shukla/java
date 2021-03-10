package challengeof50Days;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Get_Maze_Paths {

	       public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList < String > paths = get_Maze_Paths(0, 0, n - 1, m - 1);
        System.out.println(paths);
    }

    public static ArrayList < String > get_Maze_Paths(int sr, int sc, int dr, int dc) {
        if (sr > dr || sc > dc) {
            return new ArrayList < > ();
        }

        if (sr == dr && sc == dc) {
            ArrayList < String > bres = new ArrayList < > ();
            bres.add("");
            return bres;
        }

        ArrayList < String > hpaths = get_Maze_Paths(sr, sc + 1, dr, dc);
        ArrayList < String > vpaths = get_Maze_Paths(sr + 1, sc, dr, dc);
        ArrayList < String > paths = new ArrayList < > ();

        for (String hpath: hpaths) {
            paths.add('h' + hpath);
        }

        for (String vpath: vpaths) {
            paths.add('v' + vpath);
        }

        return paths;
    }
}