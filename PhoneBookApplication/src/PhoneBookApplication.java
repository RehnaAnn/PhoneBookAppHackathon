import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBookApplication implements Serializable {
	Scanner reader=new Scanner(System.in);

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

		this.list();

		System.out.println("Enter contact ID:");
		int response = reader.nextInt();

		boolean foundId = false;

		for(Contact contact : phonebook) {

			if(contact.getId() == response) {

				System.out.println(contact);
				foundId = true;

			}

		}

		if(!foundId) {
			System.out.println("ID not found.");
		}

	}

	public void delete() {

		this.list();

		System.out.println("Enter contact ID:");
		int response = reader.nextInt();

		for(int i = 0; i < this.phonebook.size(); i++) {

			if(this.phonebook.get(i).getId() == response) {

				this.phonebook.remove(i);

			}

		}

	}

	public void search() {
		//Ask user for search query. Enter name or part. Look at phonebook and display information for user. 
		System.out.println("Please enter a search query:");
		String query = reader.nextLine();
		//Search through each contact
		for(Contact contact : phonebook) {	

			if (contact.getName().contains(query)) {

				System.out.println(contact);
				return;
			}

		}
		System.out.println("Contact "+ query + " not found");
	} 

	public void SaveContactsToFile(String fileName) {

		try	{

			FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(this.phonebook);
			oos.close();
			fos.close();
			System.out.println("Contacts saved successfully : " + fileName );
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}

	public void LoadContactsFromFile(String fileName) {
		try {

			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);	
			this.phonebook = (ArrayList<Contact>) ois.readObject();
			ois.close();
			fis.close();
		}
		catch (IOException | ClassNotFoundException ioe)
		{
			ioe.printStackTrace();
			return;
		}
		for (Contact contact : this.phonebook) {

			System.out.println(contact);
		}

	}		
}
