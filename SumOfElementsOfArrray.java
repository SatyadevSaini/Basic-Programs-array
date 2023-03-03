import java.util.Scanner;

public class SumOfElementsOfArrray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	     
		System.out.println("Enter the number of Elements in Array");
		
		int n =sc.nextInt(); //no of elements
		int a[]= new int [n];  //n size array
		
		System.out.println("Enter the Elements in the Array");
		
		for(int x=0;x<a.length;x++) {
			
			a[x]=sc.nextInt();
		}
	    
		System.out.println("All Elements of Array is :");
		
		for(int x=0;x<a.length;x++) {
			
			System.out.println(a[x]);
			
		}
		
		System.out.println("Sum Of Elements of Array");
	
	    int sum=0;
	  
		for(int x=0;x<a.length;x++) {
			
			sum = sum+a[x];	
		}
		 
		System.out.println("Sum is :"  +sum);
		
	}

}
