package Lec17;

public class swaping_of_element_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,5,2,5,8};
		System.out.println(arr[0]+" "+arr[1]); // 2 3
		swaping(arr[0],arr[1]);
		System.out.println(arr[0]+" "+arr[1]); // 3 2
	}
	public static void swaping(int a,int b) {
		// TODO Auto-generated method stub
		int temp = a;
		a= b;
		b = temp;
	}
}
