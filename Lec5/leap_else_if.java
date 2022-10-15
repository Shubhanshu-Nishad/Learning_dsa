package Lec5;

public class leap_else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y = 2017; 
		if(y %400 ==0 ) {
			// yes block
			System.out.println("LY");
		}else if(y % 100 == 0) {
			System.out.println("NLY");
		}else if(y%4==0) {
			System.out.println("LY");
		}
		else {
			// no block
			System.out.println("NLY");
		}
		
		
		
//		if(y>90) {
//			System.out.println("A grade");
//			}
//			else if(y>80) {
//				System.out.println("B grade");
//			}
//			else if(y>50) {
//				System.out.println("C grades");
//		}else {
//			// no block execute when all conditions all false
//			System.out.println("Fail");
//		}
	}

}
