package Lec5;
import java.util.*;
public class Leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		if(y%4 ==0 ){
			//1st  yes
			if(y%100==0) {
				/// 2Nd yes block 
				if(y%400==0) {
					//  3rd yes 
					System.out.println("LY");
				}else {
					// 3 rd no block
					System.out.println("NLY");
				}
			}else {
				// 2nd block
				System.out.println("LY");
			}
		}
		else {
		//1st  no block
		System.out.println("NLY");
		}
	}
}

