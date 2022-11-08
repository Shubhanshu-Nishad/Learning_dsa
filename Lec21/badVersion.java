package Lec21;

public class badVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int pos = Bad_version(n);
		System.out.println(pos);

	}

	public static int Bad_version(int n) {
		// TODO Auto-generated method stub
		int start = 1;
		int end = n;
		int ans = 0;
		while (start<=end) {
			int mid = (start +end)/2;
			if(isBadVersion(mid)) {
				end = mid -1;
				ans = mid;
			}else {
				start = mid+1;
			}
		}
		return ans;
	}

	public static boolean isBadVersion(int mid) {
		// TODO Auto-generated method stub
		return false;
	}

}
