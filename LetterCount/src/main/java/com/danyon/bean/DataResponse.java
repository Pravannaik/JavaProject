package com.danyon.bean;


import java.util.List;

public class DataResponse {
	
	private TextLength textLength;
	private int wordCount;
	private List characterCount; 
	
	
	public DataResponse(TextLength textLength, int wordCount, List characterCount) {
		super();
		this.textLength = textLength;
		this.wordCount = wordCount;
		this.characterCount = characterCount;
	}
	
	
	public TextLength getTextLength() {
		return textLength;
	}
	public void setTextLength(TextLength textLength) {
		this.textLength = textLength;
	}
	
	
	public int getWordCount() {
		return wordCount;
	}
	public void setWordCount(int wordCount) {
		this.wordCount = wordCount;
	}
	
	
	public List getCharacterCount() {
		return characterCount;
	}
	public void setTextCount(List characterCount) {
		this.characterCount = characterCount;
	}

}
