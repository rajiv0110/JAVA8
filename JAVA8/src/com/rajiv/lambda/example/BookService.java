package com.rajiv.lambda.example;

import java.util.Collections;
import java.util.List;

public class BookService {

	/*
	 * ( o1, o2) -> o2.getName().compareTo(o1.getName());
	 * 
	 */
	public List<Book> getBooksinSort() {
		List<Book> books = new BookDAO().getBooks();
		Collections.sort(books, (o1, o2) -> o1.getName().compareTo(o2.getName()));
		return books;
	}

	public static void main(String[] args) {
		System.out.println(new BookService().getBooksinSort());
	}
}
