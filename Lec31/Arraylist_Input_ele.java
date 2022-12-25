package Lec31;

import java.util.*;

public class Arraylist_Input_ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ls = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>0) {
			int val = sc.nextInt();
			ls.add(val);
			n--;
		}
		System.out.println(ls);
		for (int i = 0; i < ls.size(); i++) {
			System.out.print(ls.get(i)+" ");
			
		}
	}

}
