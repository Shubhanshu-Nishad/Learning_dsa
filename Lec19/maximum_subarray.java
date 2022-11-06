package Lec19;

public class maximum_subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-12,-12,3,4,-9,7,4,-3};
		int max = subarray(arr);
		System.out.println(max);

	}

	public static int subarray(int[] arr) {
		// TODO Auto-generated method stub
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int prev_Sum = 0;
			for(int j = i ; j<arr.length;j++) {
				prev_Sum = prev_Sum + arr[j];
				ans = Math.max(ans, prev_Sum);
			}
			
		}
		return ans;
	}

}
