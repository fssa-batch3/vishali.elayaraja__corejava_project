package day09.practice;

import java.time.LocalDate;

public class Practice3Validator {
    public static boolean validate(Task1 task) throws IllegalArgumentException {
        if (task == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        validateId(task.getId());
        validateName(task.getName());
        validateDeadline(task.getDeadline());
        validatePriority(task.getPriority());
        return true;
    }

    public static boolean validateId(int id) throws IllegalArgumentException {
        if (id <= 0) {
            throw new IllegalArgumentException("Invalid id. Id should be greater than zero.");
        }
        return true;
    }

    public static boolean validateName(String name) throws IllegalArgumentException {
        if (name == null || name.trim().isEmpty() || name.length() < 3) {
            throw new IllegalArgumentException("Invalid name. Name should not be empty.");
        }
        return true;
    }

    public static boolean validateDeadline(LocalDate deadline) throws IllegalArgumentException {
        if (deadline == null || deadline.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Invalid deadline. Deadline should be a future date.");
        }
        return true;
    }

    public static boolean validatePriority(int priority) throws IllegalArgumentException {
        if (priority < 1) {
            throw new IllegalArgumentException("Invalid priority. Priority should be greater than or equal to 1.");
        }
        return true;
    }
}