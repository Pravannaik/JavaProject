package com.danyon.bean;

public class TextLength {

	private int withspace;
	private int withoutspace;
	

	public TextLength(int withspace, int withoutspace) {
		super();
		this.withspace = withspace;
		this.withoutspace = withoutspace;
	}
	
	public int getWithspace() {
		return withspace;
	}
	public void setWithspace(int withspace) {
		this.withspace = withspace;
	}
	public int getWithoutspace() {
		return withoutspace;
	}
	public void setWithoutspace(int withoutspace) {
		this.withoutspace = withoutspace;
	}	
	
}
