package day03.practice;

class Employee {

	private int id;
	private String name;

	public Employee(int id, String name) {
		this.setId(id);
		this.setName(name);
	}

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
}

    public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "naresh");

		System.out.println("Id = " + e1.getId() + ", name = " + e1.getName());

//        
//        e1.setId(1);
//        e1.setName("naresh");
//        e2.setId(2);
//        e2.setName("suresh");
//        System.out.print("Id = " + e1.getId() );
//        System.out.println( ", name = " + e1.getName());
//        System.out.print("Id = " + e2.getId());
//        System.out.print( ", name = " + e2.getName());

		Employee e2 = new Employee(2, "suresh");
		System.out.println("Id = " + e2.getId() + ", name = " + e2.getName());
	}
}
