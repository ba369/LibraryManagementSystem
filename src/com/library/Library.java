package com.library;
import java.util.ArrayList;

public class Library {
	
	ArrayList<Book> books = new ArrayList<>();
	
	
	
	public void addBook(Book book) {
		books.add(book);
		System.out.println("Book added successfully");
	}
	
	
	
	public void viewBooks() {
		
		if(books.isEmpty()) {
			System.out.println("No books are available.");
		}else {
			for (Book b :books) {
				System.out.println(b);
			}
		}
	}

	public void issueBook(int id) {
		for(Book b : books) {
			if(b.id == id) {
				if(!b.isIssued) {
					b.isIssued = true;
					System.out.println("Book issued successfully");
					
				} else {
					System.out.println("Bok is already issued");
				}
				return;
			}
		}
		System.out.println("Book ID not found");
	}
	
	public void returnBook(int id) {
        for (Book b : books) {
            if (b.id == id) {
                if (b.isIssued) {
                    b.isIssued = false;
                    System.out.println("Book returned successfully.");
                } else {
                    System.out.println("Book was not issued.");
                }
                return;
            }
        }
        System.out.println("Book ID not found.");
    }
	
	public void removeBook(int id) {
		for(Book b : books) {
			if(b.id == id) {
				books.remove(b);
				System.out.println("Book removed successfully.");
				return;
			}
		}
		System.out.println("Book ID not found.");
	}
	

}
