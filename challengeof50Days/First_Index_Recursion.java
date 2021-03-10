package challengeof50Days;
import java.util.*;
public class First_Index_Recursion {
	public static void main(String[] ar) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		int x=scn.nextInt();
		int xr=FirstIndex(arr,0,x);
		System.out.println(xr);
	}

	private static int FirstIndex(int[] arr, int idx, int x) {
     if(idx==arr.length) {
    	 return -1;
     }
     if(arr[idx]==x) {
    	 return idx;
     }else {
    	 int aisa=FirstIndex(arr,idx+1,x);
    	 return aisa;
     }
		

	}

}
