package Lec29;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aaabbccdssssg";
		StringCompression(str);
	}

	public static void StringCompression(String str) {
		// TODO Auto-generated method stub
		char prev = str.charAt(0);
		int count = 1;
		String ans = "";
		for (int i = 1; i < str.length(); i++) {
			char curr = str.charAt(i);
			if(prev == curr)
				count++;
			else {
				ans = ans + prev + count;
				count=1;
				prev = curr;
			}
			
		}
		ans = ans + str.charAt(str.length()-1) + count;
		System.out.println(ans);
	}

}
