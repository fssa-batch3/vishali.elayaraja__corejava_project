package day09.practice;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class TestPractice3Validator {

    @Test
    public void testValidTask() {
        try {
            Task1 task = new Task1(1, "Coding", LocalDate.of(2023, 12, 12), 1);
            Assertions.assertTrue(Practice3Validator.validate(task));
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Argument is null", e.getMessage());
        }
    }

    @Test
    public void testInvalidTask() {
        try {
            Assertions.assertTrue(Practice3Validator.validate(null));
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Argument is null", e.getMessage());
        }
    }

    @Test
    public void testValidId() {
        try {
            Assertions.assertTrue(Practice3Validator.validateId(4));
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Invalid id. Id should be greater than zero.", e.getMessage());
        }
    }

    @Test
    public void testInvalidId() {
        try {
            Assertions.assertTrue(Practice3Validator.validateId(0));
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Invalid id. Id should be greater than zero.", e.getMessage());
        }
    }

    @Test
    public void testValidName() {
        try {
            Assertions.assertTrue(Practice3Validator.validateName("Project"));
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Invalid name. Name should not be empty.", e.getMessage());
        }
    }

    @Test
    public void testInvalidName() {
        try {
            Assertions.assertTrue(Practice3Validator.validateName(""));
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Invalid name. Name should not be empty.", e.getMessage());
        }
    }

    @Test
    public void testValidDeadline() {
        try {
            Assertions.assertTrue(Practice3Validator.validateDeadline(LocalDate.of(2023, 10, 13)));
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Invalid deadline. Deadline should be a future date.", e.getMessage());
        }
    }

    @Test
    public void testInvalidDeadline() {
        try {
            Assertions.assertTrue(Practice3Validator.validateDeadline(null));
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Invalid deadline. Deadline should be a future date.", e.getMessage());
        }
    }

    @Test
    public void testValidPriority() {
        try {
            Assertions.assertTrue(Practice3Validator.validatePriority(2));
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Invalid priority. Priority should be greater than or equal to 1.", e.getMessage());
        }
    }

    @Test
    public void testInvalidPriority() {
        try {
            Assertions.assertTrue(Practice3Validator.validatePriority(0));
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Invalid priority. Priority should be greater than or equal to 1.", e.getMessage());
        }
    }
}