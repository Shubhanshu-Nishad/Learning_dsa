package Lec9;

import java.util.Scanner;


public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = n/2;
		int row = 1;
		int space = 1;
		while(row<=n) {
			//  star
			int j = star;
			while (j>0) {
				System.out.print("*"+" ");
				j--;
			}
			// space
			int i=1;
			while (i<=space) {
				System.out.print("  ");
				i++;
			}
			// star
			int k = star;
			while (k>0) {
				System.out.print("*"+" ");
				k--;
			}
			// next row prep
			System.out.println();
			row++;
			if(row<=n/2+1) {
				star--;
				space+=2;
			}else {
			star++;
			space-=2;
			}
		}
		
	}

}
