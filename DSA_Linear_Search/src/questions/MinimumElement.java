package questions;

public class MinimumElement {

	public static void main(String[] args) {
		int a[] = {32,4,5,6,3,2,4,3,2,42,-12,2,-23,4,2,23};
          System.out.println(min(a));
	}

	public  static int min(int[] a) {
		int min = a[0];
		
		for(int i=0; i<a.length; i++) {
			if(a[i] < min) {
				min = a[i];
			}
		}

		return min;
	}

}
