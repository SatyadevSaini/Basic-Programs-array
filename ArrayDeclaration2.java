
public class ArrayDeclaration2 {

	public static void main(String[] args) {
        //valid here 
		int a[] = new int[] {23 , 34 , 56 , 34}; //valid here
		
		for(int x:a) {
			System.out.println(x);
		}
		System.out.println("   ");
		
		//valid
		int b [] = new int [5];
		b[0]=10444;
		b[1]=1064;
		b[2]=160;
		b[3]=105;
		b[4]=140;
		
		for(int x=0;x<b.length;x++) {
			
			System.out.println(b[x]);
		}
		System.out.println("   ");
		
		
		//best way
		
		int c[] = {12,34,5,67,54,67,32,90};  //array creation 
		
		for(int x=0; x<c.length;x++) {
			
			System.out.println(c[x]);
		}
	}

}
