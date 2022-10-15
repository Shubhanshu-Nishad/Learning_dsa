package Lec4;

public class Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = true;
		boolean b = true;
		if(a && b) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		System.out.println("For or block");
		if(a || b) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		System.out.println(" for logical not");
		if(a!=b) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
	}

}
