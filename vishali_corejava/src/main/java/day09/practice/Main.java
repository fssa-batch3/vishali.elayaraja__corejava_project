package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		List<Task1> arr1 = new ArrayList<Task1>();
		arr1.add(new Task1(3, "Coding", LocalDate.of(2022, 10, 22),1));
		arr1.add(new Task1(5, "Product Design", LocalDate.of(2022, 10, 01),1));
		arr1.add(new Task1(1, "Software Design", LocalDate.of(2022, 10, 07),1));
		arr1.add(new Task1(3, "Coding", LocalDate.of(2022, 10, 22),2));
		Collections.sort(arr1, new TaskComparator());
		System.out.println(arr1);
	}
}
class TaskComparator implements Comparator<Task1> {
    @Override
    public int compare(Task1 o1, Task1 o2) {
        if (o1.getDeadline().isEqual(o2.getDeadline())) {
            // If the deadlines are equal, compare based on priority
            return Integer.compare(o1.getPriority(), o2.getPriority());
        } else {
            // Compare based on deadlines
            return o1.getDeadline().compareTo(o2.getDeadline());
        }
    }
}
class Task1 implements Comparable<Task1> {
	private int priority;
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	private int id;
	private String name;
	private LocalDate deadline;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDeadline() {
		return deadline;
	}
	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}
	Task1(int id, String name, LocalDate deadline, int priority) {
		this.id = id;
		this.name = name;
		this.deadline = deadline;
		this.priority = priority;
	}
	@Override
	public int compareTo(Task1 o) {
		if (this.deadline.isEqual(o.getDeadline())) {
			return 0;
		} else {
			if (this.deadline.isBefore(o.getDeadline())) {
				return -1;
			} else {
				return 1;
			}
		}
	}
	@Override
	public String toString() {
		return "\n[id=" + id + ", name=" + name + ", deadline=" + deadline + ", priority=" + priority + "]";
	}
}
