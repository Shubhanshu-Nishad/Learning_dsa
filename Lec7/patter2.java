package Lec7;

import java.util.Scanner;

public class patter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// 1st step 
		int row = 1;
		int star = 1;
		while(row<=n) {
			// star 
			int j = 1;
			while(j<=star) {
				System.out.print("*" + " ");
				j++;
			}
			// next row pre
			System.out.println();
			row++;
			star++;
		}
		
	}

}
