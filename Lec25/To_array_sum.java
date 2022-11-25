package Lec25;

import java.util.Scanner;

public class To_array_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int arr[] = new int[n];
			int brr[] = new int[m];
			for (int i = 0; i < n; i++)
				arr[i]= sc.nextInt();
			for (int i = 0; i < m; i++) 
				brr[i]= sc.nextInt();
			int sum = towArraySum(arr,brr);
			System.out.println(sum);
		}
	}

	private static int towArraySum(int[] arr, int[] brr) {
		// TODO Auto-generated method stub
		int i =0; //arr
		int j =0; // brr
		int p = 0; //  arr start
		int q = 0; // brr start
		int ans = 0;
		while(i<arr.length && j <brr.length) {
			if(arr[i]>brr[i]) {
				j++;
			}else if(arr[i]<brr[i]) {
				i++;
			} else {
				int sum1 = 0; // arr
				int sum2 = 0; // brr
				for (int k = p; k <=i; k++) {
					sum1 +=arr[k];
				}
				for (int k = q; k <=j; k++) {
					sum2 += brr[k];
				}
				ans = ans+  Math.max(sum1, sum2);
			}
			i++;
			j++;
			p= i;
			q=i;
		}
		
		if( i == arr.length) {
			for (int k = q; k < brr.length; k++) {
				ans += brr[k];
			}
		}
		if( j == brr.length) {
			for (int k = p; k < arr.length; k++) {
				ans += arr[k];
			}
		}
		return ans;
	}

}
