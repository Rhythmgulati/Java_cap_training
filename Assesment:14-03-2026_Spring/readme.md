spring-core-xml
Description
Library Book Management System (Spring Core – XML Configuration)

Scenario

A small Library Management System wants to manage information about books and librarians. The application should use Spring Core with XML configuration to create and manage objects.

The system should demonstrate:

Dependency Injection
Bean configuration using XML
Constructor and Setter Injection
Requirements

1. Create a Book class

Attributes:

bookId (int)
title (String)
author (String)
Methods:

Getters and Setters
displayBookDetails()
2. Create a Librarian class

Attributes:

librarianId (int)
name (String)
Book book (dependency)
Methods:

Getters and Setters
issueBook() → should print librarian name and issued book details.
3. Configure Beans in XML (applicationContext.xml)

Create a bean for Book
Create a bean for Librarian
Inject the Book object into Librarian using setter injection
 

4. Create a MainApp class

Steps:

Load Spring container using ClassPathXmlApplicationContext
Get the librarian bean from the container
Call issueBook() method
Expected Output Example

Librarian: Amit
Issued Book Details:
Book Id: 101
Title: Spring Framework
Author: Rod Johnson

Concepts Tested

Spring IoC Container
XML based configuration
Dependency Injection
Setter Injection
