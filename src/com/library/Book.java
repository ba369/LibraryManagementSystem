package com.library;

public class Book {
	
	int id;
	String title;
	String author;
	boolean isIssued;
	
	public Book(int id, String title, String author) {
		this.id=id;
		this.title=title;
		this.author=author;
		this.isIssued = false;
	}
	
	public String toString() {
		return "ID: "+id+", Title: "+title+", Author: "+author+", Issued: "+ (isIssued ? "Yes" : "No");
	}

}
