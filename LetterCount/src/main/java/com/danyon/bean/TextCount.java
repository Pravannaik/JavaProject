package com.danyon.bean;

public class TextCount {

		private String key;
		private int value;
		
		
		public TextCount(String key, int value) {
			super();
			this.key = key;
			this.value = value;
		}
		
		
		public String getKey() {
			return key;
		}
		public void setKey(String key) {
			this.key = key;
		}
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}

		
}
