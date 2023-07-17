package day07.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		ArrayList<Task> taskList = new ArrayList<>();

		// Adding tasks to the ArrayList
		taskList.add(new Task(1, "Task 1", LocalDate.of(2023, 7, 15)));
		taskList.add(new Task(2, "Task 2", LocalDate.of(2023, 7, 15)));
		taskList.add(new Task(3, "Task 1", LocalDate.of(2023, 7, 15)));
		taskList.add(new Task(4, "Task 3", LocalDate.of(2023, 7, 16)));
		taskList.add(new Task(5, "Task 1", LocalDate.of(2023, 7, 15)));

		printTasks(taskList); // arraylist
		removeDuplicates(taskList); // hashset

	}

//		a methd to printing tasks
	public static void printTasks(ArrayList<Task> tasks) {
		for (Task task : tasks) {
			System.out.println("ID: " + task.getId() + ", Name: " + task.getName() + ", Deadline: " + task.getDeadline());
		}
		System.out.println();
	}

// 		a method to remove duplicates
	public static void removeDuplicates(ArrayList<Task> taskList) {
		HashSet<Task> taskSet = new HashSet<>(taskList);
		taskList.clear();
		taskList.addAll(taskSet);
	}

}

//	task class
class Task {
	private int id;
	private String name;
	private LocalDate deadline;

	public Task(int id, String name, LocalDate deadline) {
		this.id = id;
		this.name = name;
		this.deadline = deadline;
	}

//	getters and setters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	@Override
	public boolean equals(Object obj) { 
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Task other = (Task) obj;
		return id == other.id && name.equals(other.name) && deadline.equals(other.deadline);
	}
}