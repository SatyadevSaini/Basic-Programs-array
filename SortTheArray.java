import java.util.Scanner;

public class SortTheArray {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Size of Array ");
		int n = sc.nextInt();
		
		int a[] = new int [n];
		
		System.out.println("Elements in array ");
		
		for (int x =0; x<a.length;x++) {
			
		   a[x] =sc.nextInt();
		}
		System.out.println("array is :");
		for(int x=0; x<n; x++) {
			
			System.out.print(a[x] + " ");	
		}
		System.out.println();
		
		System.out.println("sorted array  is:");
		
		int min , temp=0;
		
		for(int x=0;x<a.length;x++) {
			
			min =x;
			
			for(int y =x+1; y<a.length;y++) {
				
				if(a[y] < a[min]) {
					
					min = y;	
				}	
			}
			
		temp =a[x];
		a[x]=a[min];
	    a[min]=temp;
	    
		}
	
		for(int x =0;x<a.length;x++) {
			System.out.print(a[x] + " ");
		}
	
	}

}
