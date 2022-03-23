import java.time.LocalDateTime;
import java.time.LocalTime;

public abstract class Contact {

	protected String name;
	protected String phoneNumber;
	protected LocalDateTime createdAt;
	
	
	
	public Contact(String name, String phoneNumber, LocalDateTime createdAt) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.createdAt = createdAt;
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
