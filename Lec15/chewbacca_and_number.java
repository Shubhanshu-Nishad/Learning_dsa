package Lec15;

import java.util.Scanner;

public class chewbacca_and_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			long n = sc.nextLong();
			// reverse
			long rev=0;
			while (n>0) {
				long rem = n%10;
				n/=10;
				if(rem == 9 && n==0) {
					rev = rev *10 +rem;
				}else {
					long x = 9 - rem;
					if(rem<x)
						rev = rev *10 +rem;
					else 
						rev = rev *10 +x;
				}
					
				
			}
			System.out.println(rev);
			// 
			n = rev;
			rev =0;
			while (n>0) {
				long rem = n%10;
				rev = rev *10 +rem;
				n/=10;
			}
			System.out.println(rev);
		
	}

}
