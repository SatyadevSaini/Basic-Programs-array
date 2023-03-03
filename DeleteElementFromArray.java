import java.util.Scanner;

public class DeleteElementFromArray {

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
			System.out.println("delete the Element");
			
			int delete=20;
			
			for(int x=0;x<a.length;x++) {
				
				if(a[x]==delete) {
					
					for(int y=x;y<a.length-1;y++) {
						a[y]=a[y+1];
					}
					}
					}
				
			for(int x=0;x<a.length-1;x++) {
				System.out.print(a[x] +" ");
			}
				
			}
			

	}


