package questions;

public class Find_Number_Even_Digits_LC_1295 {

	public static void main(String[] args) {
		
		int a[] = {12,345,4,6,7896};
        int ans = check(a);
        System.out.println(ans);
	}

	private static int check(int[] a) {
		int ans =0;
		
		// traverse a for loop here 
		for(int i=0; i<a.length;i++) {
			
			// we will convert the digit in the String 
			String checker = a[i]+"";
			
			// if length is even then ans++ we will done 
			if(checker.length() % 2 == 0) {
				ans ++ ;
			}
			
		}
		
		return ans;
	}

}
