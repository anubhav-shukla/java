package challengeof50Days;
import java.util.*;
public class LAst_Index_Recursion {

	public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=scn.nextInt();
	}
		int x=scn.nextInt();
		int res=LastIndex(arr,0,x);
		System.out.println(res);
		
	}

	private static int LastIndex(int[] arr, int idx, int x) {
		   if(idx==arr.length) {
			   return -1;
		   }
		   int lisa=LastIndex(arr,idx+1,x);
		   if(lisa==-1) {
			   if(arr[idx]==x) {
				   return idx;
			   }else {
				   return -1;
			   }
		   }else {
			   return lisa;
		   }
		
		   
	}

}
