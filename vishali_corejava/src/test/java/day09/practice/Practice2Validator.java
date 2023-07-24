package day09.practice;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class Practice2Validator {
    public static boolean validate(Task task) throws IllegalArgumentException {
        
    	if (task == null) {
			throw new IllegalArgumentException("Argument is null");
		}
		validateName(task.getName());
		validateId(task.getId());
		validateDate(task.getDeadline());
		return true;
        

        
    }
    @Test
    public static boolean validateId(int id) throws IllegalArgumentException{
    	if (id <= 0) {
            throw new IllegalArgumentException("Invalid id. Id should be greater than zero.");
        }
    	return true;
    }
    @Test
    public static boolean validateName(String name) throws IllegalArgumentException{
    	if (name == null || "".equals(name.trim()) || name.length() < 3) {
            throw new IllegalArgumentException("Invalid name. Name should not be empty.");
        }
    	return true;
    }
    @Test
    public static boolean validateDate(LocalDate date) throws IllegalArgumentException{
    	if (date == null || date.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Invalid deadline. Deadline should be a future date.");
        }
        return true;
    }
}