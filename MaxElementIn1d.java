import java.util.Scanner;

public class MaxElementIn1d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of  Elements in the Array");
		
		int n = sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter the elememts of Array");
		
		for(int x=0;x<a.length;x++) {
			
			a[x]= sc.nextInt();
		}
		System.out.println("array elements are : ");
		
		for(int x =0; x<a.length;x++) {
			System.out.println(a[x]);
			
		}
		
		int max=a[0]; //assume 1 element is maximum....
		
		for(int x=1;x<a.length;x++) {  // loop from 1 to length of the array...
			
			if(a[x]>max) {
				
				max=a[x];
				
			}	
		}
		System.out.println("Maximum Element is " +max);
	}
}



















