package com.module3.contact.contactservice;

import java.util.Objects;


public class Contact {
	private final String id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	/**
	 * 
	 * @param id the contact's ID
	 * @param firstName the contact's first name
	 * @param lastName the contact's last name
	 * @param phoneNumber the contact's phone number
	 * @param address the contact's address
	 */
	public Contact(String id, String firstName, String lastName, String phoneNumber, String address) {
		super();
		
		// make sure id is not null and exactly 10 characters, only decimals
		if (id == null || !(String.valueOf(id).matches("^\\d{10}$"))){
			throw new IllegalArgumentException("id must be unique, 10 characters or less, and not null");
		}
		
		this.id = id;
		
		
		// make sure firstname not null and no more than 10 characters in length
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("first name must be 10 characters or less and not null");
		}
		this.firstName = firstName;
		// make sure lastname not null and no more than 10 characters in length
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("last name must be 10 characters or less and not null");
		}
		this.lastName = lastName;
		// make sure phone number not null and exactly 10 characters, only decimals
		if (phoneNumber == null || !(phoneNumber.matches("^\\d{10}$"))) {
			throw new IllegalArgumentException("phone number must be less than 10 digits and not null");
		}
		this.phoneNumber = phoneNumber;
		// make sure address not null and anywhere from 1 to 30 characters in length
		if (address == null || !(address.matches("^.{1,30}$"))) {
			throw new IllegalArgumentException("address must not be null.\n"
					+ "address must not exceed 30 characters");
		}
		this.address = address;
	}
	// getters and setters	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("first name must not be null");
		}
		this.firstName = firstName;
	}
		
	public String getLastName() {
		return lastName;
	}
	
	
	public void setLastName(String lastName) {
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("last name must not be null");
		}
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		
		if (phoneNumber == null || !(phoneNumber.matches("^\\d{10}$"))) {
			throw new IllegalArgumentException("phone number must be less than 10 digits and not null");
		}
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		if (address == null || !(address.matches("^.{1,30}$"))) {
			throw new IllegalArgumentException("address must not be null.\n"
					+ "address cannot be more than 30 characters long");
		
		}
		this.address = address;
	}
	
	public String getId() {
		return id;
	}
	// toString for printing object attributes
	@Override
	public String toString() {
		return "Contact [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber="
				+ phoneNumber + ", address=" + address + "]";
	}
	// for equals method
	@Override
	public int hashCode() {
		return Objects.hash(address, firstName, id, lastName, phoneNumber);
	}
	// for comparing objects
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		return Objects.equals(address, other.address) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(id, other.id) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(phoneNumber, other.phoneNumber);
	}
	
	
	
	
}
