package Lec18;

public class insertion_sort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,6,5,4,3,2,1};
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
		// TODO Auto-generated method stub
		for (int Counter = 1; Counter < arr.length; Counter++) {
			int temp = arr[Counter];
			int j = Counter-1;
			while(j>=0 && arr[j]>temp) {
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
