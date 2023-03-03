import java.util.Arrays;

public class Array_Java {

	 static public void  main(String[] args) {
	   	
       int [] a = {2,6,4,7,5};
       Arrays.sort(a);
       System.out.println(Arrays.toString(a)); 
       
       int b =    Arrays.binarySearch(a, 1);
       System.out.println(b);
        
	}
}
