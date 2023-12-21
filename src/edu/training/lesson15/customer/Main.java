package edu.training.lesson15.customer;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		int from = 111111;
		int to = 333333;

		Shop shop = new Shop();

		shop.addCustomer(new Customer(1, "Фёдоров", "Ф", "Ф", "Минск", 123456, 123456789));
		shop.addCustomer(new Customer(2, "Белкин", "Б", "Б", "Минск", 234567, 134567891));
		shop.addCustomer(new Customer(3, "Акулов", "А", "А", "Минск", 345678, 145678912));
		shop.addCustomer(new Customer(4, "Кошечкин", "К", "К", "Минск", 456789, 156789123));
		shop.addCustomer(new Customer(5, "Левин", "Л", "Л", "Минск", 567891, 167891234));
		shop.addCustomer(new Customer(6, "Носов", "Н", "Н", "Минск", 678912, 178912345));
		shop.addCustomer(new Customer(7, "Игнатенко", "И", "И", "Минск", 789456, 189123456));

		print("Custormens sorted by surname: ", shop.sortCustormerBySurname());

		print("Credit cards range between " + from + " and " + to + ": ", shop.CreditCardNumberRange(111111, 333333));
	}

	public static void print(String message, List<Customer> customers) {
		System.out.println(message);

		for (Customer customer : customers) {
			System.out.println(customer.toString());
		}
		System.out.println();
	}
}
