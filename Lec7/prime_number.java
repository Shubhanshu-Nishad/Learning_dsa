package Lec7;

import java.util.Scanner;

public class prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 2;
		while (i<n-1) {
			if(n%i==0) {
				System.out.println("Non prime number");
				return;
			}
			i++;
		}
		System.out.println("Prime number");
	}

}
