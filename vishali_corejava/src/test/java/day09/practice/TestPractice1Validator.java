package day09.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPractice1Validator {
	@Test
	void testValidArray() throws IllegalArgumentException {
		try {
			int[] arr = { 8, 9, 45, 12, 1 };
			Assertions.assertTrue(Practice1Validator.validateArray(arr));

		} catch (IllegalArgumentException e) {
			Assertions.assertEquals("Array cannot be null or empty", e.getMessage());
		}

	}

	@Test
	void testInvalidArray() throws IllegalArgumentException {
		try {
			int[] arr = null;
			Assertions.assertTrue(Practice1Validator.validateArray(arr));
			Assertions.fail("The validateArray got failed");
		} catch (IllegalArgumentException e) {
			Assertions.assertEquals("Array cannot be null or empty", e.getMessage());
		}

	}
}