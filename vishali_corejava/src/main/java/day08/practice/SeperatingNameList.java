package day08.practice;


import java.util.HashMap;

public class SeperatingNameList {
	public static void main(String[] args) {
		String s = " Ram, Ram, Superman, Spider, hey, hello, hey, Spider";
		String arr[] = s.split(",");

		HashMap<String, Integer> countMap = new HashMap<String, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (countMap.get(arr[i]) == null) {
				countMap.put(arr[i], 1);
			} else {
				int count = countMap.get(arr[i]);
				count++;
				countMap.put(arr[i], count);
			}
		}
		System.out.println(countMap);
	}
}