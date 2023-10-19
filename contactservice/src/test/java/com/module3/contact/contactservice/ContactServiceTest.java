package com.module3.contact.contactservice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
	private final String CONTACT_ID = "1122334455";
	
	
	/**
	 * ensure added contacts are added to the mapping of keys -> contacts
	 */
	@Test
	public void testAddingContacts() {
		Contact contact = new Contact(CONTACT_ID, "Bob", "Smith", "1234567890", "123 Fake St");
		ContactService tester = new ContactService();
		tester.addContact("123", contact);
		assertTrue(tester.getContacts().containsKey("123"));
		assertTrue(tester.getContacts().containsValue(contact));
		assertTrue(tester.getContacts().size() == 1);
		
	}
	/**
	 * contact not added if their id is already in the HashMap
	 */
	@Test
	public void testAddingContactsWithUniqueId() {
		Contact contact = new Contact(CONTACT_ID, "Bob", "Smith", "1234567890", "123 Fake St");
		Contact contact2 = new Contact(CONTACT_ID, "Tim", "Tankersly", "0987654321", "995 Slow Lane");
		ContactService tester = new ContactService();
		tester.addContact(CONTACT_ID, contact);
		tester.addContact(CONTACT_ID, contact2);
		assertTrue(tester.getContacts().containsKey(CONTACT_ID));
		assertFalse(tester.getContacts().containsValue(contact2));
		assertTrue(tester.getContacts().size() == 1);
		
	}
	/**
	 * contact to be removed is actually removed and list size is decremented
	 */
	@Test
	public void testRemovingContacts() {
		Contact contact = new Contact(CONTACT_ID, "Bob", "Smith", "1234567890", "123 Fake St");
		ContactService tester = new ContactService();
		tester.addContact(CONTACT_ID, contact);
		tester.deleteContact(CONTACT_ID);
		assertFalse(tester.getContacts().containsKey(CONTACT_ID));
		assertFalse(tester.getContacts().containsValue(contact));
		assertTrue(tester.getContacts().size() == 0);
	}
	/**
	 * able to update the first name of a contact
	 */
	@Test
	public void testUpdatingFirstName() {
		Contact contact = new Contact(CONTACT_ID, "Bob", "Smith", "1234567890", "123 Fake St");
		ContactService tester = new ContactService();
		tester.addContact(CONTACT_ID, contact);
		tester.getContacts().get(CONTACT_ID).setFirstName("Dan");
		Assertions.assertEquals("Dan", tester.getContacts().get(CONTACT_ID).getFirstName());
		assertTrue(tester.getContacts().size() == 1);
	}
	/**
	 * able to update the last name of a contact
	 */
	@Test
	public void testUpdatingLastName() {
		Contact contact = new Contact(CONTACT_ID, "Bob", "Smith", "1234567890", "123 Fake St");
		ContactService tester = new ContactService();
		tester.addContact(CONTACT_ID, contact);
		tester.getContacts().get(CONTACT_ID).setLastName("Doyle");
		Assertions.assertEquals("Doyle", tester.getContacts().get(CONTACT_ID).getLastName());
		assertTrue(tester.getContacts().size() == 1);
	}
	/**
	 * able to update the phone number of a contact
	 */
	@Test
	public void testUpdatingPhoneNumber() {
		Contact contact = new Contact(CONTACT_ID, "Bob", "Smith", "1234567890", "123 Fake St");
		ContactService tester = new ContactService();
		tester.addContact(CONTACT_ID, contact);
		tester.getContacts().get(CONTACT_ID).setPhoneNumber("0987654321");
		Assertions.assertEquals("0987654321", tester.getContacts().get(CONTACT_ID).getPhoneNumber());
		assertTrue(tester.getContacts().size() == 1);
	}
	/**
	 * able to update the address of a contact
	 */
	@Test
	public void testUpdatingAddress() {
		Contact contact = new Contact(CONTACT_ID, "Bob", "Smith", "1234567890", "123 Fake St");
		ContactService tester = new ContactService();
		tester.addContact(CONTACT_ID, contact);
		tester.getContacts().get(CONTACT_ID).setAddress("987 Slow Lane");
		Assertions.assertEquals("987 Slow Lane", tester.getContacts().get(CONTACT_ID).getAddress());
		assertTrue(tester.getContacts().size() == 1);
	}
	
	
	
	
	
	
	
}
