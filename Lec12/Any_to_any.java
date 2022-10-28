package Lec12;

import java.util.Scanner;

public class Any_to_any {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
 		int sb = sc.nextInt();
 		int db = sc.nextInt();
 		int n = sc.nextInt();
 		// sb convert into 10 base 
 		int ans = 0;
		int mul = 1;
		while (n>0) {
			int rem = n% 10 ; // 10 is db
			ans = ans + rem*mul;
			mul*=sb; // diviide by  sb
			n/=10; // 10 is db
		}
		System.out.println(ans);
		// ans is in base 10  
		// Now your sb is 10 db is db
		n = ans;
		ans = 0; 
		mul = 1;
		while (n>0) {
			int rem = n% db ; // db is always db
			ans = ans + rem*mul;
			mul*=10; // diviide by  sb
			n/=db; // 10 is db
		}
		
		System.out.println(ans);
		
	}

}
