package day07.practice;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // Create an ArrayList to store task details
    	Task task = new Task();
        ArrayList<Task> tasks = new ArrayList<>();

        // Add tasks to the list
        Task task1 = new Task();
        task1.taskName = "Task 1";
        task1.priority = 1;
        tasks.add(task1);

        Task task2 = new Task();
        task2.taskName = "Task 2";
        task2.priority = 2;
        tasks.add(task2);

        Task task3 = new Task();
        task3.taskName = "Task 3";
        task3.priority = 3;
        tasks.add(task3);

        // Search for a task by name
        String nameToFind = "Task 2";
        boolean found = task.findTaskByName(nameToFind, tasks);

        // Print the result
        if (found) {
            System.out.println("Task found: " + nameToFind);
        } else {
            System.out.println("Task not found: " + nameToFind);
        }
    }
}

 class Task {
 
    public String taskName;
     
    public int priority;
     
    public boolean findTaskByName(String name, ArrayList<Task> task) {
    	for(Task e : task) {
    		if(e.taskName.equals(name)) {
    			return true;
    		}
    	}
    	return false;
    }
     
}