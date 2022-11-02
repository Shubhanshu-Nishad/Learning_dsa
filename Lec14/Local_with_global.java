package Lec14;

public class Local_with_global {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(val);
		int a = 12;
		int b = 23;
//		int c = add(a,b);
//		System.out.println(c);
		int d = sub(a, b);
		System.out.println(d);
		System.out.println(val);

	}
	
	public static int add(int a,int b) {
		
		System.out.println(a+b);
		System.out.println(val);
		return a+b;
	}
	
	public static int sub(int a,int b) {
		System.out.println(a-b);
		System.out.println(val);
		int val = 106;
		System.out.println(val);
		return a-b;
	}
	static int val = 100; // global 

}
