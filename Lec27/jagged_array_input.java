package Lec27;

import java.util.Scanner;

public class jagged_array_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][];
		
		for (int i = 0; i < arr.length; i++) { // row 
			int m = sc.nextInt();
			int[] arr1 = new int[m];
			for(int j=0;j<m;j++) {
				arr1[j] = sc.nextInt();
			}
			arr[i] = arr1;
		}
		
		
		for (int i = 0; i < arr.length; i++) { // row 
			int m = sc.nextInt();
			arr[i]  = new int[m];
			for(int j=0;j<m;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < arr.length; i++) { // row 
			for (int j = 0; j < arr[i].length; j++) { // col
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
