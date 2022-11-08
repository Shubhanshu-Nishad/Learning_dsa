package Lec21;

public class gasStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] gas = {1,2,3,4,5};
		int[] cost = {3,4,5,1,2};
		int pos = gasStation(gas,cost);
		System.out.println(pos);

	}

	public static int gasStation(int[] gas, int[] cost) {
		// TODO Auto-generated method stub
		int pos = 0;
		int total = 0;
		int curr = 0;
		for (int i = 0; i < cost.length; i++) {
			int diff = gas[i] -cost[i];
			curr +=diff;
			total +=diff;
			if(curr<0) {
				pos = i+1;
				curr = 0;
			}
		}
		if(total>=0 )
			return pos;
		else
			return -1;
	}

}
