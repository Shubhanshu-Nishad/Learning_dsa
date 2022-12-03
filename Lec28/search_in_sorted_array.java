package Lec28;

public class search_in_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{1,3,5,7},
				{10,11,16,20},
				{23,30,34,60},
				};
		int x = 0 ;
		System.out.println(search2darray(arr,x));
	}

	private static  boolean search2darray(int[][] arr, int x) {
		// TODO Auto-generated method stub
		int row = arr.length-1;
		int col = 0;
		while(row>=0 && col<arr[0].length) {
			if(arr[row][col]==x)
				return true;
			else if(arr[row][col]<x)
				col++;
			else 
				row--;
		}
		
		return false;
	}

}
