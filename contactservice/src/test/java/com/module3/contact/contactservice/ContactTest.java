package com.module3.contact.contactservice;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactTest {
	private String CONTACT_ID = "1122334455";
	/**
	 * ensure null-calls are rejected
	 */
	@Test
	public void nullArgumentsForContact() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, null, null, null, null);
		});
	}
	
	/**
	 * Testing the constructor
	 */
	@Test
	public void testContactGetters() {
		Contact testContact = new Contact(CONTACT_ID, "Bob", "Smith", "1234567890", "123 Fake St");
		assertTrue(testContact.getId().equals(CONTACT_ID));
		assertTrue(testContact.getFirstName().equals("Bob"));
		assertTrue(testContact.getLastName().equals("Smith"));
		assertTrue(testContact.getPhoneNumber().equals("1234567890"));
		assertTrue(testContact.getAddress().equals("123 Fake St"));
	}
	
	/**
	 * verify all getter methods function properly
	 */
	@Test
	public void testGetters() {
		Contact testContact = new Contact(CONTACT_ID, "Bob", "Smith", "1234567890", "123 Fake St");
		assertEquals(testContact.getId(), CONTACT_ID);
		assertEquals(testContact.getFirstName(), "Bob");
		assertEquals(testContact.getLastName(), "Smith");
		assertEquals(testContact.getPhoneNumber(), "1234567890");
		assertEquals(testContact.getAddress(), "123 Fake St");
	}
	
	/**
	 * verify lastname able to be changed
	 */
	@Test
	public void testLastNameChange() {
		Contact testContact = new Contact(CONTACT_ID, "Bob", "Smith", "1234567890", "123 Fake St");
		testContact.setLastName("Robertson");
		assertEquals(testContact.getLastName(), "Robertson");
	}
	
	/**
	 * verify firstname able to be changed
	 */
	@Test
	public void testFirstNameChange() {
		Contact testContact = new Contact(CONTACT_ID, "Bob", "Smith", "1234567890", "123 Fake St");
		testContact.setFirstName("Harley");
		assertEquals(testContact.getFirstName(), "Harley");
	}
	
	/**
	 * verify phone number able to be changed
	 */
	@Test
	public void testPhoneNumberChange() {
		Contact testContact = new Contact(CONTACT_ID, "Bob", "Smith", "1234567890", "123 Fake St");
		testContact.setPhoneNumber("0987654321");
		assertEquals(testContact.getPhoneNumber(), "0987654321");
	}
	
	/**
	 * verify address able to be changed
	 */
	@Test
	public void testChangeAddress() {
		Contact testContact = new Contact(CONTACT_ID, "Bob", "Smith", "1234567890", "123 Fake St");
		testContact.setAddress("4 Stick st, Starks, AL");
		assertEquals(testContact.getAddress(), "4 Stick st, Starks, AL");
	}
	
	/**
	 * verify unable to set null fields with constructor
	 */
	@Test
	public void testSettingNullFields() {
		Contact testContact = new Contact(CONTACT_ID, "Bob", "Smith", "1234567890", "123 Fake St");
		assertThrows(IllegalArgumentException.class, () -> {
			testContact.setFirstName(null);
		});
		assertThrows(IllegalArgumentException.class, () -> {
			testContact.setLastName(null);
		});
		assertThrows(IllegalArgumentException.class, () -> {
			testContact.setPhoneNumber(null);
		});
		assertThrows(IllegalArgumentException.class, () -> {
			testContact.setAddress(null);
		});
	}
	
	
	
	
}
