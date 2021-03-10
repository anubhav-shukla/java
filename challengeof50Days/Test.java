package challengeof50Days;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int nod = 0;
        int temp = n;
        while(temp != 0){
            temp /= 10;
            nod++;
        }    k = k % nod;
        if(k < 0)
            k += nod;

        int div = 1;
        int mult = 1;
        for(int i = 1; i <= nod; i++){
            if(i <= k)
                div *= 10;
            else 
                mult *= 10;
        }
        int quo = n / div;
        int rem = n % div;
		   
        int r = rem * mult + quo;
        System.out.println(r);

System.out.println(k);
System.out.println(nod);
System.out.println(div);
System.out.println(mult);
System.out.println(rem);
System.out.println(quo);



	}

}
