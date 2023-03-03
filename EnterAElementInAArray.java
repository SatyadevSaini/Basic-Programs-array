import java.util.Scanner;

public class EnterAElementInAArray {

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
		int element=200;
		int pos=4;
		
		for(int x=a.length-1;x>3;x--) {
			
			a[x] = a[x-1]; //means 5 position elements of 4 position
		}
		
		a[3]=element;
		
		for(int x=0;x<a.length;x++) {
			System.out.print(a[x] + " ");
		}
	
	

	}

}
