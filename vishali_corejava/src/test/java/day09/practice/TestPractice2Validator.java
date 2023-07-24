package day09.practice;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;

public class TestPractice2Validator {

	@Test
	public void testValidTask() {
		Task task = new Task(1, "Coding", LocalDate.of(2023, 12, 12));
		Assertions.assertTrue(Practice2Validator.validate(task));
	}

	@Test
	public void testInvalidTask() {
		Assertions.assertTrue(Practice2Validator.validate(null));
	}

	@Test
	public void testvalidId() {
		try {
			Assertions.assertTrue(Practice2Validator.validateId(4));
		} catch (IllegalArgumentException e) {
//        	Assertions.fail("An unexpected exception occurred: " + e.getMessage());
			Assertions.assertEquals("Invalid id. Id should be greater than zero.", e.getMessage());
		}
	}

	@Test
	public void testInvalidId() {
		try {
			Assertions.assertTrue(Practice2Validator.validateId(0));
		} catch (IllegalArgumentException e) {
//        	Assertions.fail("An unexpected exception occurred: " + e.getMessage());
			Assertions.assertEquals("Invalid id. Id should be greater than zero.", e.getMessage());
		}
	}

	@Test
	public void testValidName() {
		try {
			Assertions.assertTrue(Practice2Validator.validateName("Project"));
		} catch (IllegalArgumentException e) {
			Assertions.assertEquals("Invalid name. Name should not be empty.", e.getMessage());
		}
	}

	@Test
	public void testInvalidName() {
		try {
			Assertions.assertTrue(Practice2Validator.validateName(""));
		} catch (IllegalArgumentException e) {
			Assertions.assertEquals("Invalid name. Name should not be empty.", e.getMessage());
		}
	}

	@Test
	public void testValidDeadline() {
		try {
			Assertions.assertTrue(Practice2Validator.validateDate(LocalDate.of(2023, 10, 13)));
		} catch (IllegalArgumentException e) {
			Assertions.assertEquals("Invalid deadline. Deadline should be a future date.", e.getMessage());
		}
	}

	@Test
	public void testInvalidDeadline() {
		try {
			Assertions.assertTrue(Practice2Validator.validateDate(null));
		} catch (IllegalArgumentException e) {
			Assertions.assertEquals("Invalid deadline. Deadline should be a future date.", e.getMessage());
		}
	}
}