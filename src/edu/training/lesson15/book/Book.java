package edu.training.lesson15.book;

import java.util.Objects;
import java.lang.Object;

public class Book {

	private int id;
	private final String title; // финальное поле не может быть изменено после инициализации
	private final String author;
	private String publisher;
	private int yearOfPublication;
	private int numberOfPages;
	private double price;
	private String typeOfCover;
 	
	public Book (int id, String title, String author, String publisher, int yearOfPublication,  int numberOfPages, double price, String typeOfCover) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.yearOfPublication = yearOfPublication;
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.typeOfCover = typeOfCover;
		}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

		public String getAuthor() {
		return author;
	}
	
	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYearOfPublication() {
		return yearOfPublication;
	}

	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTypeOfCover() {
		return typeOfCover;
	}

	public void setTypeOfCover(String typeOfCover) {
		this.typeOfCover = typeOfCover;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, id, numberOfPages, price, publisher, title, typeOfCover, yearOfPublication);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && id == other.id && numberOfPages == other.numberOfPages
				&& price == other.price && Objects.equals(publisher, other.publisher)
				&& Objects.equals(title, other.title) && Objects.equals(typeOfCover, other.typeOfCover)
				&& yearOfPublication == other.yearOfPublication;
	}

	@Override
	public String toString() {
				return "Book [id=" + id + ", title=" + title + ", author=" + author + ", publisher=" + publisher
				+ ", yearOfPublication=" + yearOfPublication + ", numberOfPages=" + numberOfPages + ", price=" + price
				+ ", typeOfCover=" + typeOfCover + "]";
	}

	
}