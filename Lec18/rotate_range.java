package Lec18;

public class rotate_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7};
		int k = 11;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		rotate_range(arr,k);
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
	public static void rotate_range(int[] arr, int k) {
		// TODO Auto-generated method stub
		int n = arr.length;
		k= k% n;
		reverse_range(arr,0,n-1);
		reverse_range(arr,0,k-1);
		reverse_range(arr,k,n-1);
	}


	public static void reverse_range(int[] arr,int si,int ei) {
		// TODO Auto-generated method stub
		while(si<=ei) {
			swap(arr, si, ei);
			si++;
			ei--;
		}
		
	}
	
	public static void swap(int[ ] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
