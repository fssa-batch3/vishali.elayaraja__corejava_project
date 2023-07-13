package day06.practice;

import java.util.ArrayList;

public class TaskList{

	 public static void main(String[] args) {
	    	Task task = new Task();
	        ArrayList<Task> tasks = new ArrayList<>();

	
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

	        String nameToFind = "Task 2";
	        boolean found = task.findTaskByName(nameToFind, tasks);

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
