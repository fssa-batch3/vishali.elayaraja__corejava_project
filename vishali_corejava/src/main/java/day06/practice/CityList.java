package day06.practice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CityList {

	public static void main(String[] args) {
		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");
// Add logic to remove the duplicate Array and 
		Set<String> s = new LinkedHashSet<String>(cityList); 
		System.out.println(s);
// store the unique city name is an another ArrayList
	}
}
