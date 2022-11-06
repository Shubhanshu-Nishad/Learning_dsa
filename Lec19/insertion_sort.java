package Lec19;

public class insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6,5,9,1,2,8};
		int k = 11;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		InsertionSort(arr);
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void InsertionSort(int[] arr) {
		for (int counter = 1; counter < arr.length; counter++) {
			
			int temp = arr[counter];
			int j =  counter-1;
			while( j>=0 && arr[j]>temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
			System.out.println();
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	

}
