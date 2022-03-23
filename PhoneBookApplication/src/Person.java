import java.time.LocalTime;

public class Person extends Contact {

	
	protected String email;
	
	

	public Person(String name, String phoneNumber, LocalTime createdAt, String email) {
		super(name, phoneNumber, createdAt);
		this.email = email;
	}

	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
