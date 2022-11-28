package Lec26;

import java.util.Scanner;

public class Alexa_goes_shoping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] price = new int[n];
		for (int i = 0; i < price.length; i++) {
			price[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		while (q-->0) {
			int A = sc.nextInt();
			int k = sc.nextInt();
			if(isItpossible(price,A,k)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}

	public static boolean isItpossible(int[] price, int A, int k) {
		// TODO Auto-generated method stub
		int count=0;
		// count cal
		for (int i = 0; i < price.length; i++) {
			if(A%price[i]==0)
				count++;
		}
		if(count>=k) {
			return true;
		}else
			return false;
	}

}
