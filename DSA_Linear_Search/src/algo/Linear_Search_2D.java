package algo;

import java.util.Arrays;

public class Linear_Search_2D {

	public static void main(String[] args) {
		int a[][] = { 
				{1,3,2,45},
				{2,3,4,31,56,7,73,42},
				{45,5,6,32,34,34,13,56},
				{34,7,99,77,543,23}
		};
		int target = 13;
		int ans [] = search(a , target);
		
        System.out.println(Arrays.toString(ans));
	}

	private static int[] search(int[][] a, int target) {
		
		for(int i=0; i<a.length;i++) {
			for (int j = 0; j < a[i].length; j++) {
				
				if(a[i][j] == target) {
					return new int [] {i,j};
				}	
			}
		}
		return new int [] {-1,-1};
	}

}
