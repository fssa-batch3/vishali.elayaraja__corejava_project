package day10.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMain {
	@Test
	 void testIsValidEmail() throws InvalidEmailException {
		Assertions.assertTrue(EmailValidator.isValidEmail("pranaw.murugesan@fssa.freshworks.com"));
	}
	@Test
	 void testInValidEmail() throws InvalidEmailException {
		try {
			Assertions.assertTrue(EmailValidator.isValidEmail("freshworks.com"));
		}catch(InvalidEmailException e) {
			Assertions.assertEquals("Invalid email format", e.getMessage());
		}
		
	}
	
}