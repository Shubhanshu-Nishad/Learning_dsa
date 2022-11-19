package Lec23;

import java.util.Scanner;

public class Calculate_The_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int t = sc.nextInt();
		while (t-->0) {
			int x = sc.nextInt();
			int[] brr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				int index = i -x;
				if(index<0) {
					index += arr.length;
				}
				brr[i] = arr[i] + arr[index];
			}
			arr = brr;
		}
		int sum =0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		int ans = sum % 1000000007;
		System.out.println(ans);
	}

}
