package Lec6;
import java.util.*;
public class table_input_by_user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter table : ");
		int n = sc.nextInt(); // i
		int i=1;
		// c 
		while (i<11) {
			System.out.println(i*n);
			// operation
			i++;
		}
	}

}
