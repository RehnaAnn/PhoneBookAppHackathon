import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBookApplication {

	ArrayList<Contact> phonebook;
	
	public PhoneBookApplication() {
		
		this.phonebook = new ArrayList<Contact>();
		
	}
	
	public void add(Contact contact) {
		
		phonebook.add(contact);
		
	}
	
	public void list() {
		
		for(Contact contact : phonebook) {
			
			System.out.println(contact);
			
		}
		
	}
	
	public int count() {
		
		return this.phonebook.size();
		
	}
	
	public void info() {
		Scanner reader = new Scanner(System.in);
		
		this.list();
		
		System.out.println("Enter contact ID:");
		int response = reader.nextInt();
		
		for(Contact contact : phonebook) {
			
			if(contact.getId() == response) {
				
				System.out.println(contact);
				
			} else {
				
				System.out.println("No contact has that ID.");
				
			}
			
		}
		
	}
	
	public void delete() {
		
		Scanner reader = new Scanner(System.in);
		
		this.list();
		
		System.out.println("Enter contact ID:");
		int response = reader.nextInt();
		
		for(int i = 0; i < this.phonebook.size(); i++) {
			
			if(this.phonebook.get(i).getId() == response) {
				
				this.phonebook.remove(i);
				
			}
			
		}
		
	}
	
	
}
