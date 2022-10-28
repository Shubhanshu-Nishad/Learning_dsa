package Lec12;

public class binary_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1100; // sb = 2
		int ans = 0;
		int mul = 1;
		while (n>0) {
			int rem = n% 10 ; // 10 is db
			ans = ans + rem*mul;
			mul*=2; // 2 is sb
			n/=10; // 10 is db
		}
		System.out.println(ans);
	}

}
