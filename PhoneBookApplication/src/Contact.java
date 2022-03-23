import java.time.LocalTime;

public abstract class Contact {

	protected String name;
	protected String phoneNumber;
	protected LocalTime createdAt;
	
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
