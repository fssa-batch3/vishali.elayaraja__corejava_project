package day06.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTasks {
    @Test
    public void TestTaskName(){
        try {
            Assertions.assertTrue(ValidateTasks.validateTaskName("Learn java"));
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Task name cannot be null or empty", e.getMessage());
        }
    }
    @Test
    public void TestTaskpriority(){
        try {
            Assertions.assertTrue(ValidateTasks.validatePriority(7));
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Task priority is not valid", e.getMessage());
        }
    }
}