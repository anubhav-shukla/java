package bootCamp;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scn=new Scanner(System.in);
   int[] nums= {2,2,3,4,4,78};
    int elt=2;
//   int ind=linearsearch(nums,elt);
//    int ind=binarysearch(nums,elt);

System.out.println(maxElement(nums));
	}
	//Binarysearch Algorithm
	
	private static int binarysearch(int[] nums, int elt) {
		// TODO Auto-generated method stub
		int start=0,end=nums.length-1;
		while(start<=end) {
			int mid=start+end/2;
			if(nums[mid]==elt){
			return mid;	
			}else if(nums[mid]<elt) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		return -1;
	}
	
	public static int linearsearch(int[] nums, int elt) {
		// TODO Auto-generated method stub
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==elt) {
				return i;

			}
		}
		return -1;
	}
	public static int maxElement(int[] nums) {
		int maxInd=0;
		for(int i=1;i<nums.length;i++) {
			if(nums[maxInd]<nums[i]) {
				maxInd=i;
			}
			
		}
		return maxInd;
	}
}