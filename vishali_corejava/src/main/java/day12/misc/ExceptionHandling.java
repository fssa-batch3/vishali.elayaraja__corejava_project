package day12.misc;

public class ExceptionHandling {
	public static void main(String[] args) {
		int a = 12;
		int b = 0;
	
		
		try {
			int ans=a/b;
			System.out.println("Answer:"+ans);
			
		}
		catch(Exception e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally{
			System.out.println("completed...");
		}
	}
}
