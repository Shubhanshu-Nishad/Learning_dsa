package lec3;
import java.util.*;
public class check_it_is_square {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int length = sc.nextInt();
		 int width = sc.nextInt();
		 if(length == width){
			 System.out.print("Square");
		 }else{
		 	 System.out.print("Reactangle");
		 	}
	}

}
