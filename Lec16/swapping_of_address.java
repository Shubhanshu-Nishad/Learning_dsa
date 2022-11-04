package Lec16;

public class swapping_of_address {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,5,2,5,8}; // 3k
		int[] other = {4,7,8,5,2,4,5}; // 7k 
		System.out.println(arr+" "+other);
		swapping_of_address(arr,other);
		System.out.println(arr+" "+other);
	}
	public static void swapping_of_address(int[] arr, int[] other) {
		// TODO Auto-generated method stub
		int[] temp = arr;
		arr = other;
		other = temp;
	}

}
