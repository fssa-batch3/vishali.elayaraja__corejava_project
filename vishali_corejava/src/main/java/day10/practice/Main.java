package day10.practice;

import java.util.regex.Pattern;

class InvalidEmailException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidEmailException(String message) {
		super(message);
	}
}

class EmailValidator {
	public static boolean isValidEmail(String emailId) throws InvalidEmailException {
		// TODO Write your logic; if valid, returns true; otherwise, throw the above
		// exception
		
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		boolean matches = Pattern.compile(regex).matcher(emailId).matches();

		if (matches) {
			return true;
		} else {
			throw new InvalidEmailException("Invalid email format");
		}
	}
}

public class Main {
	public static void main(String[] args) {
		String email = "example.com"; // Replace with the email you want to test

		try {
			if (EmailValidator.isValidEmail(email)) {
				System.out.println("Valid email: " + email);
			}
		} catch (InvalidEmailException e) {
			System.out.println(e.getMessage());
		}
	}
}
