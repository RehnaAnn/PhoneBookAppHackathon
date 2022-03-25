import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Organization extends Contact implements Serializable {
	protected String website;

	public Organization(String name, String phoneNumber, LocalDateTime createdAt, String website) {
		super(name, phoneNumber, createdAt);
		this.website = website;
	}
	public Organization() {
		
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
	

}
