package challengeof50Days;
import java.util.*;
public class Stair_path_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scn =new Scanner(System.in);
    int n=scn.nextInt();
    printStairpath(n,"");
	}

	private static void printStairpath(int n, String path) {
		// TODO Auto-generated method stub
		if(n<0) {
			return;
		}
		if(n==0) {
			System.out.println(path);
			return;
		}
		printStairpath(n-1,path+"1");
		printStairpath(n-2,path+"2");
		printStairpath(n-3,path+"3");
		
		
	}

}
