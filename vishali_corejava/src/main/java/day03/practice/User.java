package day03.practice;

class Userdetails {

	private String name;

	private String password;

	private String emailId;


	public Userdetails() {

	}

	public Userdetails(String password, String name, String emailId) {

		this.name = name;
		this.password = password;
		this.emailId = emailId;
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
}

	public class User {

		public static void main(String[] args) {

			Userdetails userdetails = new Userdetails();

			userdetails.setName("abc");
			userdetails.setEmailId("abc@gmail.com");
			userdetails.setPassword("password12");

			System.out.println("name : " + userdetails.getName());
			System.out.println("emailId : " + userdetails.getEmailId());
			System.out.println("password : " + userdetails.getPassword());

		}
	}
