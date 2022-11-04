package Lec17;

public class Linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,5,89,34,23,78,91}; 
		int target = 89;
		System.out.println(Linear_search(arr,target));
		
	}

	public static boolean Linear_search(int[] arr, int target) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==target)
				return true;
		}
		return false;
	}
}
