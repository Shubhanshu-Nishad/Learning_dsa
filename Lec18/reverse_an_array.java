package Lec18;

public class reverse_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1,2,3,4,5,6}; // arr = {6,5,4,3,2,1}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		reverse(arr);
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void reverse(int[] arr) {
		// TODO Auto-generated method stub
		int[] other = new int[arr.length];
		for (int i = 0; i < other.length; i++) {
			other[i] = arr[arr.length-1-i];
		}
		for (int i = 0; i < other.length; i++) {
			System.out.print(other[i]+" ");
		}
		for (int i = 0; i < other.length; i++) {
			arr[i] = other[i];
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
