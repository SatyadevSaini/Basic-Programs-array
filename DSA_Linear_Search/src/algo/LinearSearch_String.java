package algo;

public class LinearSearch_String {

	public static void main(String[] args) {
		
	String a = "satyadev";
	char target = 'y';
   int  ans = search(a,target);
   System.out.println("Index is : "+ans);
	}

	public static int  search(String a, char target) {
		if(a.length() ==0) {
			return -1;
		}
		
		for(int i=0; i<a.length(); i++) {
			
			if(a.charAt(i) == target) {
				return i;
			}
		}
		return -1;
	}

}
