package questions;

public class Maximmum_Element_2D {

	public static void main(String[] args) {
		int a[][] = { 
				{1,3,2,45},
				{2,3,4,31,56,7,73,42},
				{45,5,6,32,34,34,13,56},
				{34,7,99,77,54,23}
		};
		
		int ans = max(a);
         System.out.println(ans);
	}

	private static int max(int[][] a) {
		int max =Integer.MIN_VALUE;
		
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[i].length;j++) {
				if(a[i][j]> max) {
					max= a[i][j];
				}
			}
		}
		return max;
	}
}
