package questions;

public class Richest_Customer_Wealth_1672 {

	public static void main(String[] args) {
		int accounts[][] = {{1,5},{7,3},{3,5}};
		
		int ans = maximumWealth(accounts);
		System.out.println(ans);
		

	}
	 public static int maximumWealth(int[][] accounts) {
		 
		 int maxWealth=0;
		  
		 for(int i=0; i<accounts.length; i++) {
			 int current=0;
			 for(int j =0; j<accounts[i].length;j++) {
				 
				 current += accounts[i][j];
				 
				 if(current> maxWealth) {          //  res = Math.max(maxWealth,current);   //2 approach 
					 maxWealth = current;
				 }
			 }
		 }
		return maxWealth;
	 }
}
