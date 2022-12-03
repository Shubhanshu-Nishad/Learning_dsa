package Lec28;

public class transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16},
				};
		for (int i = 0; i < arr.length; i++) { // row 
			for (int j = 0; j < arr[i].length; j++) { // col
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		transpose(arr);
		for (int i = 0; i < arr.length; i++) { // row 
			for (int j = 0; j < arr[i].length; j++) { // col
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void transpose(int[][] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) { // row 
			for (int j = i+1; j < arr[i].length; j++) { // col
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
	}

}
