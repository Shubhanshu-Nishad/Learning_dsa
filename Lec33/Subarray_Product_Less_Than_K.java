package Lec33;

public class Subarray_Product_Less_Than_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4};
		int k = 10;
		System.out.println(CountSubarray(arr,k));
	}

	public static int CountSubarray(int[] arr, int k) {
		// TODO Auto-generated method stub
		int si=0;
		int ei=0;
		int ans =0;
		int p=1;
		while(ei<arr.length) {
			// window grow 
			p *=arr[ei];
			// window shrink
			while (p>=k && si<=ei) {
				p /=arr[si];
				si++;
			}
			//ans update 
			ans = ans + ei -si +1;
			ei++;
		}
		return ans;
	}

}
