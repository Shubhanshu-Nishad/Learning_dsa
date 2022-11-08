package Lec21;

import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_cow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int nos =sc.nextInt();
			int noc = sc.nextInt();
			int[] stalls = new int[nos];
			for (int i = 0; i < stalls.length; i++) 
				stalls[i]=sc.nextInt();
			Arrays.sort(stalls);
			int number = Aggressive_cow(stalls,noc);
			System.out.println(number);
		}
 
	}

	public static int Aggressive_cow(int[] stalls, int noc) {
		// TODO Auto-generated method stub
		int start = stalls[0];
		int end = stalls[stalls.length-1] - stalls[0];
		int ans = 0;
		while (start<=end) {
			
			int mid = (start + end)/2;
			if(isItPossible(stalls,noc,mid)) {
				ans = mid;
				start = mid+1;
				
			}else {
				end = mid -1;
			}
			
		}
		return ans;
	}

	public static boolean isItPossible(int[] stalls, int noc, int mid) {
		// TODO Auto-generated method stub
		int cow = 1;
		int position = stalls[0];
		int i = 1;
		while(i<stalls.length) {
			if(stalls[i]-position >=  mid ) {
				cow++;
				position = stalls[i];
			}
			i++;
			if(cow>=noc)
				return true;
		}
		return false;
	}

}
