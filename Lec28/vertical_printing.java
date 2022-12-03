package Lec28;

public class vertical_printing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
					{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12},
					{13,14,15,16},
					};
		verticalPrinting(arr);
		
	}

	public static void verticalPrinting(int[][] arr) {
		// TODO Auto-generated method stub
		for (int col = 0; col < arr[0].length; col++) {
			if(col % 2 == 0) {
				// 0 to n-1  upward
				for (int row = 0; row < arr.length; row++) {
					System.out.print(arr[row][col]+" ");
				}
			}else {
				// n-1 to 0 downward
				for (int row = arr.length-1; row >= 0; row--) {
					System.out.print(arr[row][col]+" ");
				}
			}
		}
	}

}
