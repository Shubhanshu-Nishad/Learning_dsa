package Lec6;

public class two_to_20_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int starting = 2;
		int ending = 20;
		while (starting<=ending) {
			
			int i = 1;
			while (i<11) {
				System.out.print(i*starting+"\t");
				// operation
				i++;
			}
			System.out.println();
			//operation
			starting++; // this is for increment
		}

	}

}
