package day09.practice;


public class Practice1Validator {
	public static boolean validate(Practice1 obj) throws IllegalArgumentException{
		if(obj == null) {
			throw new IllegalArgumentException("Object cannot be null");
		}
		
		int[] arr = {8 ,9 ,45 ,12 ,1};
		validateArray(arr);
		return true;
	}
	public static boolean validateArray(int[] arr)throws IllegalArgumentException {
		if(arr == null || arr.length <= 0) {
			throw new IllegalArgumentException("Array cannot be null or empty");
		}
		return true;
	}
}