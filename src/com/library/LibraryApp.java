package com.library;
import java.util.Scanner;
public class LibraryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Library library = new Library();
		
		int choice;
		
		do {
			System.out.println("\n=== Library Menu ===");
			System.out.println("1. Add Book");
			System.out.println("2. View All Books");
			System.out.println("3. Issue Book");
			System.out.println("4. Return Book");
			System.out.println("5. Remove Book");
			System.out.println("6. Exit");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Enter Book ID: ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enetr Title: ");
				String title = sc.nextLine();
				System.out.println("Enetr Author: ");
				String author = sc.nextLine();
				Book book = new Book(id, title, author);
				library.addBook(book);
				break;
				
			case 2:
				library.viewBooks();
				break;
				
			case 3:
				System.out.println("Enter Book ID to issue");
				int issueId = sc.nextInt();
				library.issueBook(issueId);
				break;
				
			case 4:
				System.out.println("Enter Book ID to return: ");
				int returnId = sc.nextInt();
				library.returnBook(returnId);
				break;
				
			case 5:
				System.out.println("Enter Book ID to remove: ");
				int removedId = sc.nextInt();
				library.removeBook(removedId);
				break;
				
			case 6:
				System.out.println("Exiting system...");
				break;
				
			default:
				System.out.println("Invalid choice.");
				
			
			}
		}while(choice != 6);
			
		sc.close();

	}

}
