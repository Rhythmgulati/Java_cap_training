package com.cg.bean;

public class Librarian {
	private int librarianId; 
	private String name; 
	private Book book;
	
	
	public int getLibrarianId() {
		return librarianId;
	}
	public void setLibrarianId(int librarianId) {
		this.librarianId = librarianId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	
	
	public String issueBook() {
		return "\n librarianId=" + librarianId + "\n name=" + name + "\n" + book.displayBookDetails() + "";
	}
	
	
	
}
