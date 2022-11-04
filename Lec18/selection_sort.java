package Lec18;

public class selection_sort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,6,5,4,3,2,1};
		int k = 11;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		selection_sort(arr);
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void selection_sort(int[] arr) {
		// TODO Auto-generated method stub
		for (int counter = 0; counter < arr.length; counter++) {
			int min = counter;
			for (int i = counter+1; i < arr.length; i++) {
				if(arr[i]<arr[min]) {
					min = i;
				}
			}
			swap(arr, min, counter);
			
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
