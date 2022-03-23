import java.time.LocalDateTime;
import java.time.LocalTime;

public abstract class Contact {

	protected String name;
	protected String phoneNumber;
	protected LocalDateTime createdAt;
	protected int id = 1;
	
	
	
	public Contact(String name, String phoneNumber, LocalDateTime createdAt) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.createdAt = createdAt;
		this.id = this.id + 1;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public LocalDateTime getCreatedAt() {
		return createdAt;
	}



	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public int getId() {
		return this.id;
	}

	boolean validPhoneNumber() {
		
		try {
			
			int numberVersion = Integer.valueOf(this.phoneNumber);
			
			return this.phoneNumber.length() == 12;
		}
		
		catch(Exception e) {
			
			return false;
			
		}
	}
	
}
