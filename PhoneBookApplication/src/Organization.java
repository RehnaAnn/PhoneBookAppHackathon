import java.time.LocalTime;

public class Organization extends Contact {
	protected String website;

	public Organization(String name, String phoneNumber, LocalTime createdAt, String website) {
		super(name, phoneNumber, createdAt);
		this.website = website;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
	

}
