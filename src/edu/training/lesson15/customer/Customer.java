package edu.training.lesson15.customer;

import java.util.Objects;

public class Customer {
	private final int id;
	private String surname;
	private String name;
	private String lastName;
	private String adress;
	private int creditCardNumber;
	private int bankAccountNumber;

	public Customer(int id, String surname, String name, String lastName, String adress, int creditCardNumber,
			int bankAccountNumber) {

		this.id = id;
		this.surname = surname;
		this.name = name;
		this.lastName = lastName;
		this.adress = adress;
		this.creditCardNumber = creditCardNumber;
		this.bankAccountNumber = bankAccountNumber;

	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public int getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(int bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(adress, bankAccountNumber, creditCardNumber, id, lastName, name, surname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(adress, other.adress) && Objects.equals(bankAccountNumber, other.bankAccountNumber)
				&& Objects.equals(creditCardNumber, other.creditCardNumber) && id == other.id
				&& Objects.equals(lastName, other.lastName) && Objects.equals(name, other.name)
				&& Objects.equals(surname, other.surname);
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", surname=" + surname + ", name=" + name + ", lastName=" + lastName + ", adress="
				+ adress + ", creditCardNumber=" + creditCardNumber + ", bankAccountNumber=" + bankAccountNumber + "]";
	}
	
}
