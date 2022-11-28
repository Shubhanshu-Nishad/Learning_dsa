package Lec26;

public class painter_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int painter = 2;
		int[] board= {1,10};
		Painter(board,painter);
	}
	public static int Painter(int[] board,int p) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = 0;
		for(int i =0 ;i<board.length;i++) {
			end +=board[i];
		}
		int ans = 0;
		while (start<=end) {
			int mid = (start +end)/2;
			if(isItPossible(board,p,mid)) {
				end = mid -1;
				ans = mid;
			}else {
				start = mid+1;
			}
		}
		return ans;
	}
	public static boolean isItPossible(int[] board, int p, int mid) {
		// TODO Auto-generated method stub
		int painter = 1;
		int painter_paint = board[0];
		int i =1;
		while(i<board.length) {
			if(painter_paint + board[i]<= mid) {
				painter_paint += board[i];
			}else {
				painter++;
				painter_paint  = board[i];
			}
			i++;
			if(painter >= p)
				return false;
		}
		
		return true;
	}
}
