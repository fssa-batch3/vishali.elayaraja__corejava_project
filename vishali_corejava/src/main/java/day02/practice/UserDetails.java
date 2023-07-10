package day02.practice;

//Create a User class with attribute id, name, password, emailId and create setters and getters for 
//the same. Please note no attribute should be available publicly they should be only be accessible via the access modifiers.

public class UserDetails {

	
	private int id;
	private String name;
	private String password;
	private String emailId;
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


    public static class UserValue {
	public static void main(String[] args) {
		
		UserDetails user = new UserDetails();
		user.setId(1);
		user.setName("Vishali");
		user.setEmailId("vishali@gmail.com");
		user.setPassword("password12");
		
		System.out.println(user.getId());
		System.out.println(user.getName());
		System.out.println(user.getEmailId());
		System.out.println(user.getPassword());
	
	 }
   }
}
