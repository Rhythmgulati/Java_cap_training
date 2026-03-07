package com.library.service;

import java.util.Scanner;

import com.library.dao.LibraryDao;

public class Main {
	public static void main(String[] args) {
	
		LibraryDao lib = new LibraryDao();
		
//		lib.insertAuthorwithBooks();
//		lib.getAllAuthorsandBooks();
//		lib.updatePrice();
//		lib.getAllAuthorsandBooks();
//		lib.deleteAuthor();
//		lib.getAllAuthorsandBooks();

		Scanner scanner=new Scanner(System.in);
		
		int choice ; 
		do {
			System.out.println("-------------MENU---------------");
			System.out.println(" 1.Insert \n 2.Get all authors and books \n 3.Update price by bookid \n 4.Delete Author \n 5.Delete Book");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				lib.insertAuthorwithBooks();
				break;
			case 2:
				lib.getAllAuthorsandBooks();
				break;
			case 3:
				lib.updatePrice();
				break;
			case 4:
				lib.deleteAuthor();
				break;
			case 5:
				lib.deleteBook();
				break;
			case 0:
				return;
			default:
				break;
			}
		} while (choice!=0);
		
	
	}
}
