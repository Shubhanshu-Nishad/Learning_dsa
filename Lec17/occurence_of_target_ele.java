package Lec17;

public class occurence_of_target_ele {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,9,5,89,9,34,23,78,91}; 
		int target = 9;
		System.out.println(Occurence_of_element(arr,target));
		
	}

	public static int Occurence_of_element(int[] arr, int target) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==target)
				count++;
		}
		return count;
	}
}
