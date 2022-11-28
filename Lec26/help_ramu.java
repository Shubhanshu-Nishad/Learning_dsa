package Lec26;

import java.util.Scanner;

public class help_ramu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			int c3 = sc.nextInt();
			int c4 = sc.nextInt();
			int n = sc.nextInt();// Rickshaw
			int m = sc.nextInt();// Cab
			int[] rickshaw = new int[n];
			int[] cab = new int[m];
			for (int i = 0; i < rickshaw.length; i++) {
				rickshaw[i] = sc.nextInt();
			}
			for (int i = 0; i < cab.length; i++) {
				cab[i] = sc.nextInt();
			}
			int rickshaw_ride =0;
			int cab_ride =0;
			for (int i = 0; i < rickshaw.length; i++) {
				rickshaw_ride += Math.min(c1*rickshaw[i],c2);
			}
			for (int i = 0; i < cab.length; i++) {
				cab_ride += Math.min(c1*cab[i],c2);
			}
			rickshaw_ride = Math.min(rickshaw_ride,c3);
			cab_ride = Math.min(cab_ride,c3);
			int ans = rickshaw_ride + cab_ride;
			ans = Math.min(ans, c4);
			System.out.println(ans);
		}

	}

}
