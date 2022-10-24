package Lec8;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max=1;
		if(a<b)
			max=b;
		else 
			max = b;
		// loop 
		int i = max;
		while (i<=a*b) {
			if(i%a==0 && i%b==0) {
				break;
			}
			i++;
		}
		System.out.println("LCM :"+ i);
	}

}
