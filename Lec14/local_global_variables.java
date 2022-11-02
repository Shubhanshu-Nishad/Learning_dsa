package Lec14;

public class local_global_variables {

	
	
	static int val = 100; // gloabl 
	
	
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
		val = val +100;
		return a-b;
	}
	
	
}
