package com.danyon.bean;

public class TextLength {

	private int withSpaces;
	private int withoutSpaces;
	

	public TextLength(int withSpaces, int withoutSpaces) {
		super();
		this.withSpaces = withSpaces;
		this.withoutSpaces = withoutSpaces;
	}
	
	public int getWithSpaces() {
		return withSpaces;
	}
	public void setWithSpaces(int withSpaces) {
		this.withSpaces = withSpaces;
	}
	public int getWithoutSpaces() {
		return withoutSpaces;
	}
	public void setWithoutSpaces(int withoutSpaces) {
		this.withoutSpaces = withoutSpaces;
	}	
	
}
