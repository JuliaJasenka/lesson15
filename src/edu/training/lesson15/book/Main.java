package edu.training.lesson15.book;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		Library library = new Library();
		int year = 2022;

		library.add(new Book(1, "Две трети правды", "Сергей Федин", "Вита-пресс", 2017, 93, 12.5, "твердая"));
		library.add(new Book(2, "Не открывать! Кусается!", "Шарлотта Хаберзак", "Эксмо", 2022, 238, 45.5, "твердая"));
		library.add(new Book(3, "Рождественский поросенок", "Джоан Роулинг", "Махаон", 2021, 284, 27.0, "твердая"));
		library.add(new Book(4, "Приключения Чипаллино", "Джанни Родари", "Эксмо", 2022, 252, 35.0, "твердая"));
		library.add(new Book(5, "Винни-Пух и все-все-все", "Алан Милн", "Росмэн", 2023, 381, 22.5, "твердая"));
		library.add(new Book(6, "Икабог", "Джоан Роулинг", "Махаон", 2020, 343, 27.0, "твердая"));
		library.add(new Book(7, "Изумительный мистер лис", "Роальд Даль", "Самокат", 2022, 86, 20.5, "твердая"));
		library.add(new Book(8, "Кот в сапогах", "Шарль Перро", "Издательство: Добрая книга", 2015, 28, 15.0, "твердая"));

		print("Books by author: ", library.findByAuthor("Джоан Роулинг"));
		print("Books from a publisher: ", library.findByPublisher("Эксмо"));
		print("Books published after: " + year + " year", library.findBooksPublishedAfterSettingYear(2022));

	}

	public static void print(String message, List<Book> books) {
		System.out.println(message);

		for (Book book : books) {
			System.out.println(book.toString());
		}
		System.out.println();
	}
}
