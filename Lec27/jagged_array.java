package Lec27;

public class jagged_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{1,2,3,4,6,7,5,4,3,1},
				{5,6},
				{9,10,11,12},
				{9,11,122},
				{9,10,23,45,11,12},
				{9,10,11,12},
				};
		for (int i = 0; i < arr.length; i++) { // row 
			for (int j = 0; j < arr[i].length; j++) { // 11
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
