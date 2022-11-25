package Lec25;

import java.util.Scanner;

public class Next_permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++)
				arr[i]= sc.nextInt();
			int[] ans = Next_permutations(arr);
			for (int i = 0; i < ans.length; i++) {
				System.out.print(ans[i]+" ");
			}
			System.out.println();
		}
	}

	public static int[] Next_permutations(int[] arr) {
		// TODO Auto-generated method stub
		int  n = arr.length;
		int pos =0;
		for(int i=n-2;i>=0;i--) {
			if(arr[i]<arr[i+1]) {
				pos =i;
				break;
			}
		}
		int pos2 = 0;
		for (int i=n-1;i>pos;i--) {
			if(arr[i]>arr[pos]) {
				pos2 = i;
				break;
			}
		}
		// swap 
//		int temp = arr[pos];
//		arr[pos] = arr[pos2];
//		arr[pos2] = temp;
		if(pos==0 && pos2==0) {
			reverse_range(arr, 0, n-1);
			return arr;
		}
		swap(arr, pos, pos2);
		reverse_range(arr, pos+1, n-1);
	
		return arr;
	}
	public static void reverse_range(int[] arr,int si,int ei) {
		// TODO Auto-generated method stub
		while(si<=ei) {
			swap(arr, si, ei);
			si++;
			ei--;
		}
		
	}
	
	public static void swap(int[ ] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
