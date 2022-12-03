package Lec28;

public class spiral_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{1,2,3,4},
				{5,6,7,8},
				{13,14,15,16},
				};
		spiral_pattern(arr);
	}

	public static void spiral_pattern(int[][] arr) {
		// TODO Auto-generated method stub
		int minr = 0;
		int maxr = arr.length-1;
		int minc = 0;
		int maxc = arr[0].length-1;
		int count = 0;
		int total = arr.length*arr[0].length;
		while(total>count) {
			for (int i = minc; i <= maxc  && total>count; i++) {
				System.out.print(arr[minr][i]+" ");
				count++;
			}
			minr++;
			for (int i = minr; i <= maxr  && total>count ; i++) {
				System.out.print(arr[i][maxc]+" ");
				count++;
			}
			maxc--;
			for (int i = maxc; i >=minc  && total>count; i--) {
				System.out.print(arr[maxr][i]+" ");
				count++;
			}
			maxr--;
			for (int i = maxr; i>=minr  && total>count; i--) {
				System.out.print(arr[i][minc]+" ");
				count++;
			}
			minc++;
		}
		
		
	}

}
