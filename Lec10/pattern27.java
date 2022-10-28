package Lec10;

public class pattern27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int star = 1;
		int row = 1;
		int space = n-1;
		while (row<=n) {
			// space code
			int i =1;
			while (i<=space) {
				System.out.print("  ");
				i++;
			}
			// star code
			int j=1;
			int val=1;
			while (j<=star) {
				System.out.print(val+" ");
				val++;
				j++;
			}
			// next row
			System.out.println();
			row++;
			space--;
			star+=2;
			
		}
	}

}
