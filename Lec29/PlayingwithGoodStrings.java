package Lec29;

public class PlayingwithGoodStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "cbaeicdeeeeee";
		int len = PlayingwithGoodStrings(str);
		System.out.println(len);
	}

	public static int PlayingwithGoodStrings(String str) {
		// TODO Auto-generated method stub
		int ans = 0;
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(vowel(ch))
				count++;
			else {
				ans = Math.max(ans, count);
				count=0;
			}
		}
		ans = Math.max(ans, count);
		
		return ans;
	}

	public static boolean vowel(char ch) {
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
			return true;
		return false;
	}
}
