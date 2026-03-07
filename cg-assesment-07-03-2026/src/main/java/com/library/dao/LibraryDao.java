package com.library.dao;

import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.library.beans.Author;
import com.library.beans.Book;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class LibraryDao implements ILibraryDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
	EntityManager em = emf.createEntityManager();

	Scanner sc = new Scanner(System.in);

	@Override
	public void insertAuthorwithBooks() {
		System.out.println("ENTER AUTHOR NAME");
		String name = sc.nextLine();

		System.out.println("ENTER AUTHOR EMAIL");
		String email = sc.nextLine();

		Author author = new Author(name, email);

		List<Book> books = new ArrayList<>();

		System.out.println("NO OF BOOKS ?");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= n; i++) {

			System.out.println("ENTER BOOK TITLE");
			String title = sc.nextLine();

			System.out.println("ENTER BOOK PRICE");
			double price = sc.nextDouble();
			sc.nextLine();

			Book book = new Book(title, price, author);

			books.add(book);
		}

		author.setBooks(books);
		em.getTransaction().begin();
		em.persist(author);
		em.getTransaction().commit();

		System.out.println("INSERTED");

	}

	@Override
	public void getAllAuthorsandBooks() {
		List<Author> authorli = em.createQuery("Select a from Author a", Author.class).getResultList();

		for (Author a : authorli) {
			System.out.println("-------------AUTHOR-----------");
			System.out.println(a.getAuthorId());
			System.out.println(a.getAuthorName());
			System.out.println("-------------BOOKS WRITTEN-----------");
			List<Book> books = a.getBooks();
			for (Book b : books) {
				System.out.println(b.getBookId() + " " + b.getTitle() + "-" + b.getPrice());
			}

		}
	}

	@Override
	public void updatePrice() {
		System.out.println("ENTER BOOK TITLE YOU WANT TO UPDATE PRICE OF");
		int id = sc.nextInt();

		Book b = em.find(Book.class, id);
		if (b != null) {
			System.out.println("OLD PRICE IS: " + b.getPrice());
			System.out.println("ENTER NEW PRICE");
			double amt = sc.nextDouble();
			b.setPrice(amt);
			em.getTransaction().begin();
			em.getTransaction().commit();
		}

	}

	@Override
	public void deleteBook() {
		System.out.println("ENTER BOOK ID YOU WANT TO DELETE");
		int id = sc.nextInt();
		Book book = em.find(Book.class, id);
		if (book != null) {
			em.getTransaction().begin();
			em.remove(book);
			em.getTransaction().commit();
			System.out.println("DELETED SUCCESSFULLY");
		} else {
			System.out.println("BOOK NOT FOUND");
		}

	}

	@Override
	public void deleteAuthor() {
		System.out.println("ENTER AUTHOR ID YOU WANT TO DELETE");
		int id = sc.nextInt();
		Author author = em.find(Author.class, id);

		if (author != null) {
			em.getTransaction().begin();
			em.remove(author);
			em.getTransaction().commit();
			System.out.println("DELETED SUCCESSFULLY");
		} else {
			System.out.println("AUTHOR NOT FOUND");
		}

	}

}
