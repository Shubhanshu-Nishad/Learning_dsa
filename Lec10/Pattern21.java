package Lec10;


public class Pattern21 {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		int n = 5;
		int star = 1;
		int space = 2*n-1-2;
		int row = 1;
		while (row<=n) {
			// star code
			int j=1;
			while (j<=star) {
				System.out.print("*"+" ");
				j++;
			}
			// space code
			int k=1;
			while (k<=space) {
				System.out.print("  ");
				k++;
			}
			// star code
			int i=1;
			while (i<=star) {
				if(row==n && i==n) {
					i++;
					continue;
				}
				System.out.print("*"+" ");
				i++;
			}
			// next row preparation
			System.out.println();
			row++;
			star++;
			space-=2;
		}

	}

}
