package Lec23;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Target_Sum_Triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		Arrays.sort(arr);
		Arrays_Target_Sum_Triplets(arr,target);
	}

	public static void Arrays_Target_Sum_Triplets(int[] arr, int target) {
		// TODO Auto-generated method stub
		int n = arr.length;
		for (int i = 0; i <n-2; i++) {
			int sum = target - arr[i];
			int start = i+1;
			int end = arr.length-1;
			while(start<end) {
				if(arr[start]+arr[end]==sum) {
					System.out.println(arr[i]+","+arr[start]+ " and "+arr[end]);
					start++;
					end--;
				}else if(arr[start]+arr[end]>sum) {
					end--;
				}else {
					start++;
				}
			}
			
		}
		
	}

}
