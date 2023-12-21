package edu.training.lesson15.book;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<Book> books = new ArrayList<>();

	public Library() {

	}

	public void add(Book book) {
		books.add(book);

	}

	public List<Book> findByAuthor(String author) {
		List<Book> foundBooks = new ArrayList<>();

		for (Book book : books) {
			if (book.getAuthor().equals(author)) {
				foundBooks.add(book);
			}
		}
		return foundBooks;
	}

	public List<Book> findByPublisher(String publisher) {
		List<Book> foundBooks = new ArrayList<>();

		for (Book book : books) {
			if (book.getPublisher().equals(publisher)) {
				foundBooks.add(book);
			}
		}
		return foundBooks;
	}

	public List<Book> findBooksPublishedAfterSettingYear(int year) {
		List<Book> foundBooks = new ArrayList<>();

		for (Book book : books) {
			if (book.getYearOfPublication() > (year)) {
				foundBooks.add(book);
			}
		}
		return foundBooks;
	}

}
