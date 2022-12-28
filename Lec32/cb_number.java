package Lec32;

public class cb_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	
	public static boolean isCBnumber(Long n) {
		if(n==0 || n==1)
			return false;
		int[] cb = {2,3,5,7,11,13,17,19,23,29};
		for(int i=0;i<cb.length;i++) {
			if(n==cb[i])
				return true;
		}
		
		for(int i=0;i<cb.length;i++) {
			if(n%cb[i]==0)
				return false;
		}
		
		return true;
		
	}
}
