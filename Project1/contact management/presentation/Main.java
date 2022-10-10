package presentation;

import java.util.List;

import controller.ManipulateContact;
import model.Contact;

public class Main {
    private Contact contact;
    private Input input;
    private ManipulateContact manipulateContact;
    Display display;
    
    public Main() {
	contact = new Contact();
	input = new Input();
	manipulateContact = new ManipulateContact();
	display = new Display();
    }
    private void displayUpdateOptions () {
	System.out.println("          Update Optinos");
	System.out.println();
	System.out.println("       1. Update Name");
	System.out.println("       2. Update Phone Number");
	System.out.println("       3. Update Both");
	System.out.println("       4. Exit");
	System.out.println("__________________________________________________");
	int updateOption = input.integerInput();
	if(updateOption >= 1 && updateOption <= 4) {
	    switch(updateOption) {
	    case 1:
		System.out.print("       Enter Id : ");
		contact.setId(input.integerInput());
		contact.setName(input.nameInput());
		manipulateContact.updateContactName(contact);
		displayUpdateOptions();
		break;
	    case 2:
		System.out.print("       Enter Id : ");
		contact.setId(input.integerInput());
		contact.setPhoneNumber(input.phoneNumberInput());
		manipulateContact.updateContactPhoneNumber(contact);
		displayUpdateOptions();
		break;
	    case 3:
		System.out.print("       Enter Id : ");
		contact.setId(input.integerInput());
		contact.setName(input.nameInput());
		contact.setPhoneNumber(input.phoneNumberInput());
		manipulateContact.updateContact(contact);
		displayUpdateOptions();
		break;
	    case 4:
		return;
	    }
	}else {
	    System.out.println("            Invalid Input");
	    System.out.println("__________________________________________________");
	    displayUpdateOptions();
	}
    }
    private void displayStartOptions () {
	System.out.println("          Contact Management");
	System.out.println();
	System.out.println("       1. All Contacts");
	System.out.println("       2. Add New Contact");
	System.out.println("       3. Search Contact");
	System.out.println("       4. Update Contact");
	System.out.println("       5. Delete Contact");
	System.out.println("       6. Exit");
	System.out.println("__________________________________________________");
	int startOption = input.integerInput();
	if(startOption >= 1 && startOption <= 6) {
	    switch (startOption) {
	    case 1:{
		List<Contact> allContacts = manipulateContact.allContact();
		display.displayContacts(allContacts);
		displayStartOptions();
		break;
	    }
	    case 2:{
		contact.setName(input.nameInput());
		contact.setPhoneNumber(input.phoneNumberInput());
		manipulateContact.addContact(contact);
		displayStartOptions();
		break;
	    }
	    case 3:{
		List<Contact> resultContacts = manipulateContact.searchContact(input.nameInput());
		display.displayContacts(resultContacts);
		displayStartOptions();
		break;
	    }
	    case 4:{
		displayUpdateOptions();
		displayStartOptions();
		break;
	    }
	    case 5:{
		System.out.print("       Enter The Contact Id : ");
		manipulateContact.deleteContact(input.integerInput());
		displayStartOptions();
		break;
	    }
	    case 6:
		return;
	    }
	}else {
	    System.out.println("            Invalid Input");
	    System.out.println("__________________________________________________");
	    displayStartOptions();
	}
    }
    public static void main(String[] args) {
	Main start = new Main();
	start.displayStartOptions();
    }

}
