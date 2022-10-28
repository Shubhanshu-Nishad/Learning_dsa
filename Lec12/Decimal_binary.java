package Lec12;

public class Decimal_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12; // sb = 10
		int ans = 0;
		int mul = 1;
		while (n>0) {
			int rem = n% 2 ; // 2 is db
			ans = ans + rem*mul;
			mul*=10; // 10 is sb
			n/=2; // 2 is db
		}
		System.out.println(ans);

	}

}
