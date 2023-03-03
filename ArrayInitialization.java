
public class ArrayInitialization {

	public static void main(String[] args) {
		
		int a[];        //array declaration
		
		a= new int [4]; //array creation (create the array).
		
		a[0] = 10;     //array initailization
		a[1] = 40;    
		a[2] = 45;
		a[3] = 23;
		
	System.out.println(a[0]);  //output way...
	System.out.println(a[1]);
	System.out.println(a[2]);
	System.out.println(a[3]);
	
	for(int i=0; i<a.length; i++) {
		
		System.out.println(a[i]); //output statement...
	
	}
	
	//for enhance loop using in java for output the array...
	
	for(int x:a)
	{
		System.out.println(x);  //output using for enhace loop
	
	}
	
	}

}
