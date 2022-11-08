package Lec22;

import java.util.Scanner;

public class Maximum_circular_subarray_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int [] arr = new int[n];
			for(int i =0;i<n;i++)
				arr[i] = sc.nextInt();
			
			int sum = Circular_Sum(arr);
			System.out.println(sum);
			
		}

	}

	public static int Circular_Sum(int[] arr) {
		// TODO Auto-generated method stub
		int linear_sum = kedens_algo(arr);
		
		int sum = 0;
		for(int i =0;i<arr.length;i++){
			sum +=arr[i];
			arr[i] = -1 *arr[i];
		}
		int Inverted_sum = kedens_algo(arr);
		int circular_sum = Inverted_sum + sum;
		
		System.out.println(linear_sum+ " "+Inverted_sum+" "+sum + " "+ circular_sum);
		
		if(circular_sum==0)
			return linear_sum;
		
		return Math.max(linear_sum, circular_sum);
	}
	
	public static int kedens_algo(int[] arr) {
		// TODO Auto-generated method stub
		int ans = Integer.MIN_VALUE;
		int prev_sum = 0;
		for (int i = 0; i < arr.length; i++) {
			prev_sum += arr[i];
			ans = Math.max(ans, prev_sum);
			if(prev_sum <0 )
				prev_sum = 0;
		}
		return ans;
	}

}
