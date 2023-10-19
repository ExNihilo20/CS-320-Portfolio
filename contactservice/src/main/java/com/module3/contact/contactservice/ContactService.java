package com.module3.contact.contactservice;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ContactService {
	private Map<String, Contact> contacts;
	Random random;
	
	public ContactService() {
		this.contacts = new HashMap<>();
		this.random = new Random();
	}
	
	public void addContact(String id, Contact contact) {
		// add the contact if the list is empty and the contact/id not = null
		if (contact == null || id == null) {
			return;
		}
		
		// add a contact if the ID is unique
		if (contacts.isEmpty()) {
			this.contacts.put(id, contact);
		} else if (!(this.contacts.containsKey(id))){
			this.contacts.put(id, contact);
		}
		
	}
	
	public void deleteContact(String id) {
		if (id == null || this.contacts.size() == 0) {
			return;
		}
		
		// remove the contact whose id matches the parameter
		this.contacts.remove(id);
	}
	
	public void updateFirstName(String id, String newFirstName) {
		if (id == null || newFirstName == null) {
			return;
		}
		// extract the value from the collection
		Contact contact = contacts.get(id);
		// replace the first name
		contact.setFirstName(newFirstName);
		// replace the entire contact with the updated firstname
		contacts.replace(id, contact);
		
	}
	
	public void updateLastName(String id, String newLastName) {
		if (id == null || newLastName == null) {
			return;
		}
		// extract the value from the collection
		Contact contact = contacts.get(id);
		// replace the last name
		contact.setLastName(newLastName);
		// replace the entire contact with the updated last name
		contacts.replace(id, contact);
		
	}
	
	public void updatePhoneNumber(String id, String newPhoneNumber) {
		if (id == null || newPhoneNumber == null) {
			return;
		}
		// extract the value from the collection
		Contact contact = contacts.get(id);
		// replace the phone number
		contact.setPhoneNumber(newPhoneNumber);
		// replace the entire contact with the updated phone number
		contacts.replace(id, contact);
		
	}
	
	public void updateAddress(String id, String newAddress) {
		if (id == null || newAddress == null) {
			return;
		}
		// extract the value from the collection
		Contact contact = contacts.get(id);
		// replace the address
		contact.setAddress(newAddress);
		// replace the entire contact with the updated address
		contacts.replace(id, contact);
		 
	}
	
	public Map<String, Contact> getContacts() {
		return this.contacts;
	}
	
	
	
	
}
