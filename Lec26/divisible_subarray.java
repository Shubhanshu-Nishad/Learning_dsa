package Lec26;

import java.util.Scanner;

public class divisible_subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++)
				arr[i] = sc.nextInt();
			int k = sc.nextInt();
			int count = subarraysDivByK(arr,k);
			System.out.println(count);
		}
		
	}

	public static int subarraysDivByK(int[] arr, int k) {
		// TODO Auto-generated method stub
		int[] freq = new int[k];
		int sum=0;
			for (int i = 0; i < arr.length; i++) {
				sum +=arr[i];
				sum = sum%k;
				if(sum<0)
					sum +=k;
				freq[sum] += 1; 
			}
		int ans =0;
		for (int i = 0; i < freq.length; i++) {
			if( freq[i]>= 2 ) {
				ans += (freq[i]*(freq[i]-1))/2;
			}
		}
		return ans;
	}
	

}
