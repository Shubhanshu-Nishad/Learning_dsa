package Lec3;

import java.util.Scanner;
public class Largest_no_between_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int teapot = sc.nextInt();
		sc.close();
		System.out.println(teapot);
		int a = 23;
		int b =12;
		int c = 25;
		if(a>b) {
			//yes 
			if(a>c) {
				// yes
				System.out.println("A is Largest");
			}else {
				// no 
				System.out.println("C is largest");
			}
		}else {
			// no
			if(b>c) {
				// yes
				System.out.println("B is largest");
			}
			else {
				//no 
				System.out.println("C is largest");
			}
		}

	}

}
