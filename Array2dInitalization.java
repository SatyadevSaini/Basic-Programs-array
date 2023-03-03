
public class Array2dInitalization {

	public static void main(String[] args) {
	     
		int a[][]  = { { 23,34,56} , { 24,67,89 } , {23,56,78}  }; //allowed initilzation
        
		//int []b[] = new int[][] { {34,56} ,{78,67} ,{78,67,67} };  //allowed
		//int b [][]=  new int [][]  { {}{}}; //allowed
		
		for(int x=0;x<a.length;x++) {
			
			for(int y=0;y<a[x].length;y++) {
				
				System.out.print(a[x][y] + " ");
				
			}
			System.out.println();
		}
	}

}
