package Lec34;


public class Minimum_Window_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cabwefgewcwaefgcf";
		String t = "cae";
		System.out.println(minWindow(s, t));
	}
	
	
	public static String minWindow(String s, String t) {
		 int[] freq_t = new int[256];
		 int[] freq_s = new int[256];
		 for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			freq_t[ch]++;
		}
		
		 int count = 0;
		 
		 int si = 0; 
		 int ei = 0; // for preparing window
		 int start_index =-1;
		 int min_len = Integer.MAX_VALUE; // 2^31 -1 //  - 2^32
		 
		 while(ei<s.length()) {
			 
			 char ch = s.charAt(ei);
				freq_s[ch]++;
				if (freq_t[ch] >= freq_s[ch]) {
					count++;
				}
				
			 
			 // window shrink
			 if(count==t.length()){
				 while(freq_s[s.charAt(si)]> freq_t[s.charAt(si)] || freq_t[s.charAt(si)]==0) {
					freq_s[s.charAt(si)]--;
					si++;
				 }
				 
				 
				 // ans update 
//				 min_len = Math.max(min_len, ei-si+1);
//				 start_index = si;
				 
				 
				 if (min_len > ei - si + 1) {
						min_len = ei - si + 1;
						start_index = si;
					}
		
			 }
			 
			 ei++;
		 }
		 if(start_index ==-1)
			 return "";
		 
		return s.substring(start_index,start_index+min_len);
		
		
        
    }

}
