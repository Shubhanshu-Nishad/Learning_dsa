package Lec20;

public class kedens_algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4};
		int max = kedens_algo(arr);
		System.out.println(max);

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
