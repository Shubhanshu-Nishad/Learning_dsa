package Lec7;

import java.util.Scanner;

import Lec6;

public class fac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int fac = 1;
		while(a>1) {
			fac*=a;
			a--;
		}
		System.out.println(fac);
	}

}
