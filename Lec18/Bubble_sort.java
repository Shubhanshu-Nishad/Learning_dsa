package Lec18;

public class Bubble_sort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,6,5,4,3,2,1};
		int k = 11;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		bubble_sort(arr);
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void bubble_sort(int[] arr) {
		// TODO Auto-generated method stub
		for (int turn= 0; turn <arr.length; turn++) {
			for (int i = 1; i < arr.length-turn; i++) {
				if(arr[i-1]>arr[i]) {
					swap(arr, i-1, i);
				}
				
			}
			System.out.println();
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	
	public static void swap(int[ ] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
