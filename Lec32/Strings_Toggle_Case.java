package Lec32;

public class Strings_Toggle_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abC";
		toggle(str);

	}

	public static void toggle(String str) {
		// TODO Auto-generated method stub
		String ans = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >='A' && ch<='Z') {
				ans = ans + (char) (ch+32);
			}else {
				ans = ans + (char) (ch-32);
			}
			
		}
		System.out.println(ans);
	}

}
