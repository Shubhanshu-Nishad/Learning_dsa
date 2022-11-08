package Lec20;

import java.lang.Thread.State;

public class binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int target = 8;
		int pos = binary_search(arr,target);
		System.out.println(pos);

	}

	public static int binary_search(int[] arr, int target) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = arr.length-1;
		while(start<=end) {
			int mid =  (start + end )/2;
			if(arr[mid]==target)
				return mid;
			else if(arr[mid]>target)
				end = mid -1;
			else
				start = mid+1;
		}
	
		return -1;
	}

}
