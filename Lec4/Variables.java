package Lec4;


public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Integer data types 1. byte 2. short 3. int .4 long
		
		byte a = -128;
		System.out.println(a);
		short b = 32767 ;
//		short b = 32767l; its long variable so its does not have capacity to save it.
		System.out.println(b);
		b = 234;
		System.out.println(b);
		int c = 32768;
		System.out.println(c);
		long d1 = 2323;
		System.out.println(d1);
		long d2 = 2323;
		System.out.println(d2);
		long d3 = 2323l;
		System.out.println(d3);
		
		// Real type value 1. float 2. double 
		
		float e = 23;
		System.out.println(e);
//		float e1 = 23.34; // by default its is double
//		System.out.println(e);
		float e2 = 23.34f;
		System.out.println(e);
		double f =  234.23;
		System.out.println(f);
		double f1 =  234;
		System.out.println(f1);
		double f2 =  234D;
		System.out.println(f2);
		
		//  type -3 boolean
		boolean g = true;
		System.out.println(g);
		
		// type 4 character type
		char ch = 'a'; // always use single inverted comma 
		System.out.println(ch);
		
	}

}
