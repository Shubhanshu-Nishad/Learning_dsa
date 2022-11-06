package Lec19;

import java.util.Iterator;

public class product_array_except_itself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,2,3,4};
		int [] other = productArray(arr);
		for (int i = 0; i < other.length; i++) {
			System.out.print(other[i]+" ");
		}

	}

	public static int[] productArray(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int[] left = new int[n];
		int[] right = new int[n];
		// left product
		left[0]= 1;
		for (int i = 1; i < n; i++) {
			left[i] = left[i-1]*arr[i-1];
			
		}
//		for (int i = 0; i < left.length; i++) {
//			System.out.print(left[i]+ " ");
//			
//		}
//		System.out.println();
		right[n-1] = 1;
		for (int i = n-2; i >= 0; i--) {
			right[i] = right[i+1]*arr[i+1];
			
		}
		
//		for (int i = 0; i < right.length; i++) {
//			System.out.print(right[i]+ " ");	
//		}
//		
		
		for (int i = 0; i < n; i++) {
			arr[i] = left[i]*right[i];
			
		}
		return arr;
	}

}
