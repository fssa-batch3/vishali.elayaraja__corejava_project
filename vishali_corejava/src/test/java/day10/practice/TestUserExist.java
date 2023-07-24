package day10.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUserExist {
	User u1 = new User(1, "pranaw", "pranaw@gmail.com");
	User u2 = new User(2, "cyber", "cyber@gmail.com");
	User u3 = new User(3, "sparky", "sparky@gmail.com");

	@Test
	public void testValidId() {

		Assertions.assertTrue(UserExist.validateId(u1.getId()));

	}

	@Test
	public void testValidateEmail() {
		UserExist.validateEmail(u2.getEmailId());
	}

	@Test
	public void testValidRegister() throws UserAlreadyExistsException {

		UserExist.register(u1);
		UserExist.register(u2);
		UserExist.register(u3);

	}
}