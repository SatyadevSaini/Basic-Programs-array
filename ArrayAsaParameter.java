public class ArrayAsaParameter {

	public static void main(String[] args) {
	
	int b[]= {45,78,47,345,78};  //array
	
	System.out.println(b[3]); //array  //345
	
	for(int x:b) {
		System.out.println(x);  //here b[] array all elements printed here ..
	}
	
	System.out.println("calling that array which was passing as argument");
	
	m3(b); //calling of array which is passes as arguments..
	
	for(int x=0; x<b.length;x++) {
		
		System.out.println(b[x]);
	}
}
  
	static void m3(int z[]) {   //main method array as argument passes here ....b[] array passes here 
		System.out.println("array with argument passing");
		
		System.out.println( "second element of arrray "  +z[2]);
		
		for(int x=0;x<z.length;x++) { 
			
			System.out.println(z[x]);	 //it  executes here ...
		}
		
		z[1]=10000;   z[2]=20000;   // value changed of the array ...
		
	}
}
