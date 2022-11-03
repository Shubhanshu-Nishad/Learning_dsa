package Lec17;

public class swap_element_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,5,2,5,8};
		System.out.println(arr[0]+" "+arr[1]); // 2 3
		swaping(arr , 0,1);
		System.out.println(arr[0]+" "+arr[1]); // 3 2
		

	}

	public static void swaping(int[] arr , int i, int j) {
		// TODO Auto-generated method stub
		int a = arr[0];
		arr[0] = arr[1];
		arr[1] = a;
	}

}
