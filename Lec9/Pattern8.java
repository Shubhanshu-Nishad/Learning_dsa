package Lec9;

import javax.swing.RowFilter;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		int star = 1;
		int space1=n-2;
		int space2 = 0;
		int row = 1;
		while(row<=n) {
			// space 2
			int j = 1;
			while (j<=space2) {
				System.out.print("  ");
				j++;
			}
			//  star code 
			System.out.print("*" + " ");
			// space 1 code
			int i = 1;
			while (i<=space1) {
				System.out.print("  ");
				i++;
			}
			//  star code 
			if(row!=(n/2)+1)
				System.out.print("*" + " ");
				
			// next row
			row++;
			System.out.println();
			if(row<=(n/2)+1) {
				space1-=2;
				space2++;
			}else {
				space1+=2;
				space2--;
			}
			
		}
	}

}
