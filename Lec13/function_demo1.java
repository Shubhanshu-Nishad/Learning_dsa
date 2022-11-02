package Lec13;

public class function_demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hey");
		int a = 12;
		int b = 13;
		int c = a+b;
		//System.out.println(c);
		System.out.println(add(a, b));
		int d = add(a, b);
		System.out.println(d);

	}
	public static int add(int a,int b) {
		int c = a+b;
		//System.out.println(c);
		return c;
		
	}

}
