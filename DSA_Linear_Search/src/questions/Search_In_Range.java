package questions;

public class Search_In_Range {

	public static void main(String[] args) {
		int target = 2;
		int a[] = {3,7,5,3,3,1,1,2,2,34,5,67};
		int start= 5;
		int end =10;
		
	 boolean ans=	search(a, target ,start,end);
	 System.out.println(ans);

	}

	public static boolean search(int[] a, int target, int start, int end) {
		
		
		for(int i=start; i<=end;i++) {
			if(a[i] == target) {
				return true;
			}
		}
		
		return false;
	}

}
