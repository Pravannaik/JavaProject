package com.danyon.bean;


import java.util.List;

public class DataResponse {
	
	private TextLength textLength;
	private int wordCount;
	private List textCount; 
	
	
	public DataResponse(TextLength textLength, int wordCount, List textCount) {
		super();
		this.textLength = textLength;
		this.wordCount = wordCount;
		this.textCount = textCount;
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
	
	
	public List getTextCount() {
		return textCount;
	}
	public void setTextCount(List textCount) {
		this.textCount = textCount;
	}

}
