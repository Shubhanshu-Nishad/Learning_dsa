package Lec11;

import java.util.Scanner;

public class Pascal_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 0;
		int star = 1;
		while (row<n) {
			//  star code
			int j=0;
			int ncr = 1;
			while(j<star) {
				System.out.print(ncr+"\t");
				ncr = (ncr*((row-j))/(j+1));
				j++;
			}
			// next row
			System.out.println();
			row++;
			star++;
		}
	}

}
