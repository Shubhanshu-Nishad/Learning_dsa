package Lec18;

public class reverse_range {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1,2,3,4,5,6}; // arr = {6,5,4,3,2,1}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		reverse_range(arr,1,arr.length-2);
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
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
