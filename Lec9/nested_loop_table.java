package Lec9;

public class nested_loop_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 20;
		// loop for 2 to 20 number 
		for(int i = a;i<=20;i++) {
			// loop for table
			for(int j= 1; j<=10;j++) {
				System.out.print(i*j+"\t");
			}
			System.out.println();
		}
		

	}

}
