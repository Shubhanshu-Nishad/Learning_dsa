package Lec29;

public class Pali_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "naman";
		int count = Pali_substring(str);
		System.out.println(count);

	}

	public static int Pali_substring(String str) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j < str.length()+1; j++) {
				String s =  str.substring(i,j);
				if(pallindrome(s))
					count++;
			}
			
		}
		return count;
	}
	
	public static boolean pallindrome(String str) {
		// TODO Auto-generated method stub
		int i=0;
		int j = str.length()-1;
		
		while(i<j) {
			if(str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		
		return true;
	}
}
