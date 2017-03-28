package com.kmarquardsen;

public class LibraryMain {
	private String name;

	public LibraryMain(String name) { this.name = name; }

	public String getMessage() { return "Hello, " + this.name + "!"; }
}
