package Lec11;

public class demo_type_conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(byte i=1;i<=127; i++) {
//			System.out.println(i);
//		}
//		
//		int a = 1234;
//		long b = 123456789;
//		System.out.println(a);
//		
		char ch = 'A';
		char ch1 = 'A';
//		int ch1 = ch;
		ch1++;  //  internal type ch = (char)(ch +1)
		ch =(char) (ch + 1); 
		System.out.println(ch);
		System.out.println(ch1);
		
		char c = 'A' + 1;
		System.out.println(c);
		
		
		int n1 = 12;
		int n2 =13;
		int n3 = n1+n2;
		System.out.println(n3);
		byte m1 = 12;
		byte m2 = 13;
		byte m3 = (byte) (m1 +m2);
		System.out.println(m3);

	}

}
