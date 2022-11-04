package Lec17;

public class index_of_target_element {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,5,89,34,23,78,91}; 
		int target = 891;
		System.out.println(Linear_search_index(arr,target));
		
	}

	public static int Linear_search_index(int[] arr, int target) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==target)
				return i;
		}
		return -1;
	}
}
