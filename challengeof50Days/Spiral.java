package challengeof50Days;
import java.io.*;
import java.util.*;

public class Spiral {

	public static void main(String[] args) {
		        // write your code herei
		        Scanner scn=new Scanner(System.in);
		        int n=scn.nextInt();
		        int m=scn.nextInt();
		        int[][] arr=new int[n][m];
		        
		        for(int i=0;i<arr.length;i++){
		            for(int j=0;j < arr[0].length;j++){
		                arr[i][j]=scn.nextInt();
		            }
		        }
		        int minr=0;
		        int minc=0;
		        int maxr=arr.length-1;
		        int maxc=arr[0].length-1;
		        int tne=n*m;
		        int cunt=0;
		        while(cunt < tne){
		            for(int i = minr; i <= maxr && cunt < tne; i++){
		               System.out.println(arr[i][minc]);
		               cunt++;
		            }
		            minc++;

		            for(int j = minc; j <= maxc && cunt < tne; j++){
		               System.out.println(arr[maxr][j]);
		               cunt++;
		            }
		            maxr--;

		            for(int i = maxr; i >= minr && cunt < tne; i--){
		               System.out.println(arr[i][maxc]);
		               cunt++;
		            }
		            maxc--;

		            for(int j = maxc; j >= minc && cunt < tne; j--){
		               System.out.println(arr[minr][j]);
		               cunt++;
		            }
		            minr++;

		         }
		      }

		   }