package day10.misc;



class divider{
	
	public static int divisor(int a , int b) throws IllegalArgumentException{
		if (b==0) {
			
			throw new IllegalArgumentException("divisor cannot be zero");
			
		}
		int c = a/b;
		return c;
		
	}
}

public class Main {
     public static void main(String[] args) {
		divider.divisor(5, 0);
	}
}
