package day06.practice;

import java.util.*;
import java.util.HashSet;

public class CityList {

	public static void main(String[] args) {
		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");
// Add logic to remove the duplicate Array and 
		HashSet<String> s = new HashSet<>(cityList);
		System.out.println(s);
// store the unique city name is an another ArrayList
	}
}
