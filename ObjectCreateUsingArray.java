
public class ObjectCreateUsingArray {
	
	void m1() {
		System.out.println("it is a method ");
		System.out.println("object creation using the Array");
	
	}

	public static void main(String[] args) {
		
		//we known how we create the object in normal way but here we learn object creation using Array...
		
		 ObjectCreateUsingArray a[] = new ObjectCreateUsingArray[5]; // here we have spcace of 5 array yet 
		  // not object create here we have 5 place for object creation in the array...
		 
		 a[0] =new ObjectCreateUsingArray();
		 a[1] =new ObjectCreateUsingArray();  //object create using array it is 1 way 
		 a[2] =new ObjectCreateUsingArray();
		 a[3] =new ObjectCreateUsingArray();
		 a[4] =new ObjectCreateUsingArray();
		 
		 
		 //second way of object creation Using ARRAY....
		 
		 ObjectCreateUsingArray  b[]  =   { new ObjectCreateUsingArray(), new ObjectCreateUsingArray(), 
		 new ObjectCreateUsingArray(),new ObjectCreateUsingArray() };  //object creation using array 

		 //3 way object creation using Array..
		 
		 ObjectCreateUsingArray d[] = new ObjectCreateUsingArray [5]; //space for array 
		 
		 for(int x=0;x<d.length;x++) {
			 
			d[x] = new ObjectCreateUsingArray();
			
		 }
		 d[0].m1(); 
		 d[4].m1(); //working properly object is creating.....& working
		 b[3].m1(); //also working 
		 
	}

}
