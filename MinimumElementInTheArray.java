import java.util.Scanner;

public class MinimumElementInTheArray {

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
			
			int min=a[0];
			for(int x=1;x<a.length;x++) {
				
				if(a[x]<min) {
					
					min =a[x];
				}
			}
			System.out.println("Minimum Element is :"  +min);

	}
}
