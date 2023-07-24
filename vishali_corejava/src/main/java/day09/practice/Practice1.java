package day09.practice;

import java.util.*;
public class Practice1 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Scanner sc  = new Scanner(System.in);
		int num = 5;
		int i =0;
		while(i < num) {
			arr.add(sc.nextInt());
			i++;
		}
		Collections.sort(arr);
		System.out.println(arr);
		sc.close();
	}
}
