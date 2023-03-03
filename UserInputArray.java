import java.util.Scanner;

public class UserInputArray {

	public static void main(String[] args) {
      	
       Scanner sc = new Scanner(System.in);
       
       //size of array 
       System.out.println("Enter the size of the array");
       
       int n = sc.nextInt();
       int a[] = new int[n];
       
       //elements entered in the array 
       System.out.println("Enter the elements in the array");
       
       for(int x=0;x<a.length;x++) {
    	   
    	    a [x] = sc.nextInt();
       }
       
       //getting elements from the array 
       System.out.println("all elements of array is ");
       
       for(int x=0;x<a.length;x++) {
    	   
    	   System.out.println(a[x]);
       }
      
       
       
	}

}
