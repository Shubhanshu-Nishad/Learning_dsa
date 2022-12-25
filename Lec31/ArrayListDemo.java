package Lec31;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ls = new ArrayList<Integer>();
		ArrayList<Byte> list = new ArrayList<Byte>();
		System.out.println(list);
		
		// add an element
		ls.add(10);
		ls.add(11);
		ls.add(12);
		ls.add(13);
		ls.add(-14);
		System.out.println(ls);
		
		
		// add an element at index
		// range 0 to size
//		ls.add(5,15); // (index,add)
//		
//		
//		// remove at index
//		// range 0 to size -1
//		System.out.println(ls.size());
//		ls.remove(5);
	//	ls.remove(0);
		//ls.remove(2);
		
		
//		System.out.println(ls.size());
		
		// get 
		System.out.println(ls.get(4));
		
		
		// set 
		ls.set(0, 100);
		System.out.println(ls);
		
		
		// traversal 
		
		for (int i = 0; i < ls.size(); i++) {
			System.out.print(ls.get(i)+" ");
		}
		System.out.println();
		for (int i = ls.size()-1; i >=0 ; i--) {
			System.out.print(ls.get(i)+" ");
		}
		System.out.println();
		
		for(int val : ls) {
			System.out.print(val + " ");
		}
		System.out.println();
		Collections.sort(ls);
		for(int val : ls) {
			System.out.print(val + " ");
		}
		
//		int[] arr = {12,1,14,123,145};
//		for(int sneha : arr) {
//			System.out.print(sneha + " ");
//		}
//		
//		Arrays.sort(arr); // nlogn
//		
//		System.out.println();
//		for(int sneha : arr) {
//			System.out.print(sneha + " ");
//		}
		
		System.out.println();
		int[][] ar = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		for(int[] a1 : ar) {
			System.out.println(ar);
//			for(int sneha : a1) {
//				System.out.print(sneha + " ");
//			}
		}
		
	}

}