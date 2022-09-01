package com.oops.bll;

public class Author {
	private String firstname;
	private String lastname;
	private String bookname;
	
	public Author() {

}
	public Author(String firstname, String lastname) {
		this.firstname=firstname;
		this.lastname=lastname;
	}
	public Author(String firstname, String lastname, String bookname) {
		this.firstname=firstname;
		this.lastname=lastname;
		this.bookname=bookname;
	}
	public void setFirstname(String firstname) {
		this.firstname=firstname;
	}
	public void setlastname(String lastname) {
		this.lastname=lastname;
	}
	public void setbookname(String bookname) {
		this.bookname=bookname;
	}
	public String getfirstname() {
		return firstname;
	
	public String getlastname() {
		return lastname;
	}
	public String getbookname() {
		return bookname;
	}
	
	
	public String tostring() {
	
		return "firstname:"+firstname+"\n lastname:"+lastname+"\nbookname:"+bookname;
	}
	
	
	
	}
