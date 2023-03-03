import java.util.Scanner;

public class ReverseTheArray {

	public static void main(String[] args) {

   Scanner sc = new Scanner( System.in);
   System.out.println( "size of the arrry ");
   
     int n = sc.nextInt();
     
     int a[] = new int [n];
     
     System.out.println("Elementd ");
     for(int x =0; x<a.length;x++) {
    	 
    	 a[x]= sc.nextInt();
    	 
     }
     
     System.out.println("array is :");
     
     for(int x=0; x<a.length;x++) {
    	 System.out.print(a[x] + " ");
     }	 
     System.out.println();
     
   System.out.println("reverse the array ");

     for(int x=a.length-1; x>=0; x--) {     // reverse the array logic ....
    	 
    	 System.out.print(a[x] +" ");
     }

	}

}
