package Lec23;

import java.util.Arrays;
import java.util.Scanner;

public class Murthal_paratha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nop = sc.nextInt();
		int n = sc.nextInt();
		int[] rank = new int[n];
		for (int i = 0; i < rank.length; i++) {
			rank[i]=sc.nextInt();
		}
		Arrays.sort(rank);
		int time = Murthal_paratha(rank,nop);
		System.out.println(time);
	}

	public static int  Murthal_paratha(int[] rank, int nop) {
		// TODO Auto-generated method stub
		int n = rank.length;
		int start = 0;
		int end = ((rank[rank.length-1])*(nop*(nop+1)))/2;
		int ans = 0;
		while (start<=end) {
			int mid = (start +end)/2;
			//System.out.println(mid);
			if(isItPossible(rank,nop,mid)) {
				ans = mid;
				end = mid -1;
			}else {
				start = mid+1;
				
			}
		}
		return ans;
	}

	public static boolean isItPossible(int[] rank, int nop, int mid) {
		// TODO Auto-generated method stub
		int parantha = 0; // total parantha cooked by all chef
		int time =0;
		int i =0;
		int pn = 1; // parantha cooked by particular chef
		while(i<rank.length) {
			if(time+(pn*rank[i])<=mid) {
				time+=pn*rank[i];
				parantha++;
				pn++;
			}else {
				i++;
				time=0;
				pn=1;
			}
			if(parantha>=nop) 
				return true;
		}
		return false;
	}

}
