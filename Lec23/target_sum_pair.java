package Lec23;

import java.util.Arrays;
import java.util.Scanner;

public class target_sum_pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int target = sc.nextInt();
		target_sum_pair_one_loop(arr,target);
	}

	public static void target_sum_pair_one_loop(int[] arr, int target) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = arr.length-1;
		while(start<end) {
			if(arr[start]+arr[end]==target) {
				System.out.println(arr[start]+ " and "+arr[end]);
				start++;
				end--;
			}else if(arr[start]+arr[end]>target) {
				end--;
			}else {
				start++;
			}
		}
		
	}

	public static void target_sum_pair(int[] arr, int target) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]+arr[j]==target)
					System.out.println(arr[i]+ " and "+arr[j]);
			}
		}
	}

}
