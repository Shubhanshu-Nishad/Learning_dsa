package Lec33;


public class MaxSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1000,2,3,11,8,4,5,2,1,7,9,10};
		int k = 3;
		System.out.println(MaxSum(arr,k));
	}

	public static int MaxSum(int[] arr, int k) {
		// TODO Auto-generated method stub
		int sum =0;
		//  prepare 1st window
		for(int i=0;i<k;i++)
			sum +=arr[i];
		int ans = sum;
		for (int i = k; i < arr.length; i++) {
			// window grow 
			sum +=arr[i];
			//window shrink
			sum -=arr[i-k];
			// ans update
			ans = Math.max(ans, sum);
		}
		return ans;
	}

}
