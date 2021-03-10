package challengeof50Days;

import java.util.Scanner;
public class Max_OF_Array {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		int mx= MaxOfArray(arr,0);
		System.out.println(mx);
	}

	private static int MaxOfArray(int[] arr, int idx) {
		if(idx==arr.length-1) {
		return arr[idx];
		}
		int misa=MaxOfArray(arr,idx+1);
		if(misa>arr[idx]) {
			
		return misa;
	}else {
		return arr[idx];
	}
	
	}

}
