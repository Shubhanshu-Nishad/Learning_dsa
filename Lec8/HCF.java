package Lec8;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int min=1;
		if(a<b)
			min=a;
		else 
			min = b;
		// loop 
		int i = min;
		while (i>0) {
			if(a%i==0 && b%i==0) {
				break;
			}
			i--;
		}
		System.out.println("HCF :"+ i);
	}

}
