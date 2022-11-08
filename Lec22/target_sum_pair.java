package Lec22;

import java.util.Arrays;
import java.util.Scanner;

public class target_sum_pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i =0;i<n;i++)
			arr[i] = sc.nextInt();
		int target = sc.nextInt();
		//target_pair(arr,target);
		Arrays.sort(arr);
		target_pair_one_loop(arr,target);
	}

	public static void target_pair_one_loop(int[] arr, int target) {
		// TODO Auto-generated method stub
		
	}

	public static void target_pair(int[] arr, int target) {
		// TODO Auto-generated method stub
		for(int i = 0;i<arr.length;i++) {
			for(int j = i+1; j<arr.length;j++) {
				if(arr[i]+arr[j]==target)
					System.out.println(arr[i]+" "+ arr[j]);
			}
		}
		
	}

}
