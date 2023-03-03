import java.util.Scanner;

public class SearchElementInArray {

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
		
		System.out.println();
		System.out.println("search element in the array ");
        
		int search =5;
		
		for(int x=0;x<a.length;x++) {
			
			if(a[x]==search) {
				
				System.out.println("element is found at index position " +x);
				
			}
		}
		
	}

}
