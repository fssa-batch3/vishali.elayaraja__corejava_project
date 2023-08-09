package day08.practice;

import java.util.regex.Pattern;

public class TestValidator {

			public static boolean validateString(String str) throws IllegalArgumentException {
				String regex =  "^[A-Za-z]{2,30}$";
				boolean matches = Pattern.compile(regex).matcher(str).matches();
				if (str == null || !matches) {
					throw new IllegalArgumentException("String should not be empty");

				}
				return false;

		}
	}
