package Lec24;

import java.util.*;

public class All_Duplicates_in_an_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		int[] nums = {4,3,2,7,8,2,3,1};
		list = find(nums);
	}

	public static List<Integer> find(int[] nums) {
		// TODO Auto-generated method stub
		List<Integer> ls = new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++) {
			int n = Math.abs(nums[i]);
			if(nums[n-1]>0) {
				nums[n-1] *=-1;
			}else {
				ls.add(n);
			}
		}
		return null;
	}

}
