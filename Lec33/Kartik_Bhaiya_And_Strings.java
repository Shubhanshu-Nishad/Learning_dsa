package Lec33;

public class Kartik_Bhaiya_And_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abbababaaaa";
		int k = 3;
		int count_a = MaxSize(str,k,'a');
		int count_b = MaxSize(str,k,'b');
		System.out.println(count_a);
		System.out.println(count_b);
		System.out.println(Math.max(count_a, count_b));

	}

	public static int MaxSize(String str, int k, char ch) {
		// TODO Auto-generated method stub
		int si=0;
		int ei=0;
		int ans =0;
		int flip =0;
		while(ei<str.length()) {
			// window grow
			if(str.charAt(ei)== ch) {
				flip++;
			}
			// window shrink
			while(flip > k && si<=ei ) {
				if(str.charAt(si) == ch)
					flip--;
				si++;
			}
			// ans cal
			ans = Math.max(ans, ei-si+1);
			ei++;
		}
		return ans;
	}

}
