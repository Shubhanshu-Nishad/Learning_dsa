package Lec27;

public class array_2d_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ar = null;
		//int[][] arr = new int[3][4];
		int[][] arr = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
					};
		System.out.println(arr.length); // row 
		System.out.println(arr[0].length); // col
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
	}
}
