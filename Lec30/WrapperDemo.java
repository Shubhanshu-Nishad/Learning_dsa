package Lec30;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 10; // 
		Integer a1=20;
//		System.out.println(a);
//		System.out.println(a1);
//		byte b =10;
//		Byte b1 =20;
//		System.out.println(b);
//		System.out.println(b1);
		
		int c=190;
		int c1 = 190;
		System.out.println(c==c1);
		byte d =10;
		Byte d1=10;
		System.out.println(d==d1);
		
		Integer e=10;
		Integer e1=10;
		System.out.println(e==e1); // e and e1 address are same 
		Integer f=190;
		Integer f1=190;
		System.out.println(f==f1); // address f and f1 address are different 
		
		Long g1=10l;
		Long g2=10l;
		System.out.println(g1==g2); 
		Long h1=190l;
		Long h2=190l;
		System.out.println(h1==h2);
		
		Double j1=100d;
		Double j2=100d;
		System.out.println(j1==j2);
		
		
	}

}
