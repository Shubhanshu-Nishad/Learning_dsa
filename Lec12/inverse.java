package Lec12;

public class inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 32145;
		int ans = 0;
		int index = 1;
		while(n>0) {
			int rem = n%10;
			ans = (int)( ans + index*(Math.pow(10, rem-1)));
			index++;
			n/=10;
		}
		System.out.println(ans);
			
	}

}
