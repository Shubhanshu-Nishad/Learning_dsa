package Lec18;

public class rotate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7};
		int k = 10;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		rotate_array(arr,k);
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	public static void rotate_array(int[] arr, int k) {
		// TODO Auto-generated method stub
		k= k % arr.length;
		// rotate array first times / / 7 1 2 3 4 5 6 // 6 7 1 2 3 4 5 // 5 6 7 1 2 3 4
		int j=0;
		while (j<k) {
			int temp = arr[arr.length-1];
			for (int i = arr.length- 2; i >=0 ; i--) {
				arr[i+1] = arr[i];
			}
			arr[0] = temp;
			j++;
		}		
	}

}
