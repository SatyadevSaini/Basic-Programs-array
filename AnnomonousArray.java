
public class AnnomonousArray {

	public static void main(String[] args) {
		
		m1(new int [] {34,567,3,6,954,3467} );  //it is annomonous array which is uses here 
		

	}
	
	static void m1(int a[]) {   //name of array is here but uses in the main method it is known as anomous array 
		
		for(int x=0;x<a.length;x++) {
			System.out.println(a[x]);
		}
	}
}



