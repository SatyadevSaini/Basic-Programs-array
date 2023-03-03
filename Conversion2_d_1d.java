import java.util.ArrayList;
import java.util.Arrays;

public class Conversion2_d_1d {
      
	public static void main(String[] args) {
		
		int a[][] = {{1,2,3},{4,5,6},{7,8,9},{11,12,13} , {14,15,16}};
		
		int temp =0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int r =0; r<=a.length-1;r++) { 
			
			for(int c =0 ; c<=a[r].length-1; c++ ) {
				
				temp = a[r][c] ;
				list.add(temp);
				
			}
		}
		// list created here ....
		System.out.println("ArrayList Printed here :");
		System.out.println(list);
		 
		// convert list into Array 
		
		int arr[] = new int [list.size()];  // create the array of list sized ....
		for(int i=0; i<list.size(); i++) {  // insert the elements in the array 
		 arr [i] =  list.get(i);	        // get the elements .. 
		 
		} 
		System.out.println("Array Printed here :");
		System.out.println(Arrays.toString(arr));
		
		// here seaarch for elements 
	    int target = 14;
		int result = BinarySearch(arr, target);
		
		System.out.println("One_D index :"+ result);
		
		if(result !=-1) {
			
		int row = result /2;
		int col = result%2;
		
		System.out.println("Row : " +row + "   Column :"+col);
		}
	}
	
	
	static int BinarySearch(int arr[] , int target) {
		
		int start = 0;
		int end = arr.length-1;
		
		while(end>=start) {
			
			int mid = (end+start)/2;
			
			if(arr[mid]==target) {
				return mid;
			}
			if(arr[mid]>target) {
				end= mid -1;
			}
			if(arr[mid]<target) {
				start= mid+1;			
		    } 
	}
	
		return -1;
	
}
}
