package questions;

public class Mountain_Array_941 {

	public static void main(String[] args) {
	
		int []	arr = {0,3,2,1};
     boolean ans =  validMountainArray(arr);
     System.out.println(ans);
	}
	 public static boolean validMountainArray(int[] arr) {
	     
		 if(arr.length <=2) {
			 return false;
		 }
		 
		 // get maximum Element in the Array 
		  int index = maximum(arr);
		  
		  // strictly increasing 
		  for(int i=0; i<index; i++) {
			  
			if(arr[i] < arr[i+1]) { 
				
			  }else {
				  return false;
			  }
		  }
		  
		  
		  //strictly  decreasing 
		  for(int i=index; i<arr.length-1; i++) {
		  
			  if(arr[i] > arr[i+1]) {  
			  }else {
				  return false;
			  }
		  }
		  
		return true;
	    }
	 
	private static int maximum(int[] arr) {
		
		int max = Integer.MIN_VALUE;
		int index = -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				index = i;
			}
		}
		return index;
	}
}

   // brute Force Solution 51 test Cases passed out of 53 
   // O(N*N)  O(2) space 
