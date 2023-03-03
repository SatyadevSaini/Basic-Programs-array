import java.util.Scanner;

public class Multiplicationin1dArrayAllElements {

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
		
		int multi =1;
		for(int x=0;x<a.length;x++) {
			
			multi = multi*a[x];
		}
		
		System.out.println("Multiplication is "  +multi);

	}
}
