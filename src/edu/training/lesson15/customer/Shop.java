package edu.training.lesson15.customer;

import java.util.ArrayList;
import java.util.List;



public class Shop {

	private List<Customer> customers = new ArrayList<>();

	public Shop() {

	}

	public void addCustomer(Customer customer) {
		customers.add(customer);
	}

	public List<Customer> sortCustormerBySurname() {
		
		for (int i = 0; i < customers.size(); i++) {
			int minElemetIndex = i;

			for (int j = i + 1; j < customers.size(); j++) {
				if (customers.get(minElemetIndex).getSurname().compareTo(customers.get(j).getSurname()) > 0) {
					minElemetIndex = j;
				}
			}
			if (i != minElemetIndex) {
				Customer temp = customers.get(minElemetIndex);
				customers.set(minElemetIndex, customers.get(i));
				customers.set(i, temp);
			}
		}
		return customers;
	}

	public List<Customer> CreditCardNumberRange(int numberFrom, int numberTo) {
		List<Customer> foundCustomers = new ArrayList<>();

		for (Customer customer : customers) {
			if (customer.getCreditCardNumber() > (numberFrom) && customer.getCreditCardNumber() < (numberTo)) {
				foundCustomers.add(customer);
			}
		}
		return foundCustomers;
	}
}
