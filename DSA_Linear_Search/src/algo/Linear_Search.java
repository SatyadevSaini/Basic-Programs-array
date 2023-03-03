package algo;

public class Linear_Search {

	public static void main(String[] args) {
		int target =23;
		
		int arr[] = {1,3,4,53,6,67,32,23,34,5,3,53};
       
		int ans = linearSearch(arr, target);
		System.out.println( "Index :  "+ans);
	}
        
	public static int linearSearch(int[] arr, int target) {
		if(arr.length ==0) {
			return -1;
		}
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]== target) {
				return i;
			}
		}
		return -1;
	}
}
              

