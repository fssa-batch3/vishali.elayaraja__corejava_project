package day05.misc;

import java.util.Arrays;
import java.util.Scanner;
public class sorting {
	public static void main(String[] args) {
		Scanner nn = new Scanner(System.in);
		System.out.println("Enter the array");
		int n = nn.nextInt();
		int count = 0;
		
		int[] newarr = new int[n*n];
		
		int[][] arr = new int[n][n];
		System.out.println("enter the elements");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = nn.nextInt();
				newarr[count]= arr[i][j];
				count++;
				
			}
		}
		int num ;
		for (int i = 0; i < newarr.length; i++) {
			for (int j = 0; j < newarr.length-1-i; j++) {
				if(newarr[j]>newarr[j+1]) {
					num = newarr[j];
					newarr[j]=newarr[j+1];
					newarr[j+1]=num;
				}
			}
			}
		  for (int i = 0; i < newarr.length; i++) {
	            System.out.print(newarr[i] + " ");
		  }
				
		
	}
}









