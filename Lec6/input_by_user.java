package Lec6;

import java.util.Scanner;

public class input_by_user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int n ;
		while(true){
		n = sc.nextInt(); 
		sum +=n;
		if(sum>=0){
			System.out.println(n);
		}
		else
			return;
		}

	}

}
