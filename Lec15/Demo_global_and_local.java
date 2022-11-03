package Lec15;

import java.util.Scanner;

public class Demo_global_and_local {

	static int val; // global 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		val = sc.nextInt();
		System.out.println(val);
		int val = 230;
		int a = 12;
		int b = 23;
		int d = sub(a, b);
		System.out.println(d);
		System.out.println(val);

	}
	
	public static int sub(int a,int b) {
		System.out.println(a-b);
		System.out.println(val);
		val = val +100;
		return a-b;
	}

}
