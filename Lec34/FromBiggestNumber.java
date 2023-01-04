package Lec34;

import java.util.Scanner;

public class FromBiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i <n; i++) {
			arr[i] = sc.nextInt();
			}
			biggestNumber(arr);
			System.out.println();
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
			}
			
		}

	}

	public static void biggestNumber(int[] arr) {
		// TODO Auto-generated method stub
		for (int turn= 0; turn <arr.length; turn++) {
			for (int i = 1; i < arr.length-turn; i++) {
				if(compare(arr,i-1,i)) {
					swap(arr, i-1, i);
				}
				
			}

		}
	}
	
	public static boolean compare(int[] arr, int n1, int n2) {
		// TODO Auto-generated method stub
		String s1 = ""+arr[n1]+arr[n2];
		String s2 =  ""+arr[n2]+arr[n1];
//		System.out.println(s1);
//		System.out.println(s2);
		if(Long.parseLong(s2) > Long.parseLong(s1)) {
			return true;
		}
		return false;
	}

	public static void swap(int[ ] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
