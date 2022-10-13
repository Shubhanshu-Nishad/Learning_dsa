package lec3;
import java.util.*;
public class discount_prize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	 	int q = sc.nextInt();
	 	int cost = q*100;
	 	if(1000<cost){
	 	    // yes block
	 	    int dc = (10 * cost)/100;
	 	    int total_cost = cost -dc;
	 	    System.out.print(total_cost);
	 	}else{
	 	    // no block 
	 	    System.out.println(cost);
	 	}
	}

}
