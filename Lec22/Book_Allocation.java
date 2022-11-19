package Lec22;

public class Book_Allocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pages = {10,20,30,40};
		int nos = 2;
		int page = BookAllocation(pages,nos);
		System.out.print(page);
		
	}
	
	public static int BookAllocation(int[] pages,int nos) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = 0;
		for(int i =0 ;i<pages.length;i++) {
			end +=pages[i];
		}
		int ans = 0;
		while (start<=end) {
			int mid = (start +end)/2;
			if(isItPossible(pages,nos,mid)) {
				end = mid -1;
				ans = mid;
			}else {
				start = mid+1;
			}
		}
		return ans;
	}

	public static boolean isItPossible(int[] pages, int nos, int mid) {
		// TODO Auto-generated method stub
		int stu = 1;
		int pages_read = pages[0];
		int i =1;
		while(i<pages.length) {
			if(pages_read + pages[i]<= mid) {
				pages_read += pages[i];
				
			}else {
				stu++;
				pages_read = pages[i];
			}
			i++;
			if(stu > nos)
				return false;
		}
		
		return true;
	}

}
