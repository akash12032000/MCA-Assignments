package com.mca.student.Bean;

import javax.persistence.*;

@Entity
@Table(name="GuestTab")
public class Guest {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	
	@Column
	private String FirstName;
	@Column
	private String LastName;
	@Column
	private String EmailAddress;
	@Column
	private String GovtIssuedId;
	@Column

	private String DateOfArrival;
	@Column

	private String DateOfDeparture;
	@Column
	private String Country;
	@Column
	private String NumberOfPerson;
	@Column
	private String SpecialRequest;
	@Column
	private String PaymentMethod;
	

	public Guest() {
		super();
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmailAddress() {
		return EmailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		EmailAddress = emailAddress;
	}

	public String getGovtIssuedId() {
		return GovtIssuedId;
	}

	public void setGovtIssuedId(String govtIssuedId) {
		GovtIssuedId = govtIssuedId;
	}

	
	public String getDateOfArrival() {
		return DateOfArrival;
	}

	public void setDateOfArrival(String dateOfArrival) {
		DateOfArrival = dateOfArrival;
	}

	public String getDateOfDeparture() {
		return DateOfDeparture;
	}

	public void setDateOfDeparture(String dateOfDeparture) {
		DateOfDeparture = dateOfDeparture;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getNumberOfPerson() {
		return NumberOfPerson;
	}

	public void setNumberOfPerson(String numberOfPerson) {
		NumberOfPerson = numberOfPerson;
	}

	public String getSpecialRequest() {
		return SpecialRequest;
	}

	public void setSpecialRequest(String specialRequest) {
		SpecialRequest = specialRequest;
	}

	public String getPaymentMethod() {
		return PaymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		PaymentMethod = paymentMethod;
	}

	@Override
	public String toString() {
		return "Guest [FirstName=" + FirstName + ", LastName=" + LastName + ", EmailAddress=" + EmailAddress
				+ ", GovtIssuedId=" + GovtIssuedId + ", DateOfArrival=" + DateOfArrival + ", DateOfDeparture="
				+ DateOfDeparture + ", Country=" + Country + ", NumberOfPerson=" + NumberOfPerson + ", SpecialRequest="
				+ SpecialRequest + ", PaymentMethod=" + PaymentMethod + "]";
	}

	
	
}
