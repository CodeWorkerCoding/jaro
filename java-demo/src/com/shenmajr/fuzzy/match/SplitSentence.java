package com.shenmajr.fuzzy.match;

public class SplitSentence {
	
	private String[] dictionary = {"是","今天","星期", "星期六"};
	private String input;
	
	
	public SplitSentence(String input) {
		this.input = input;
	}

	public void start(){
		String temp;
		for (int index = 0; index < this.input.length(); index++) {
			temp = this.input.substring(index);
			System.out.println("----------"+ temp +"----------" + input);
			if (inDictionary(temp)) {
				System.out.println("--------"+ temp +"--------");
				this.input = this.input.replace(temp, "");
				index = -1;
			}
		}
		if (null != this.input && !"".equals(this.input)) {
			this.input = this.input.substring(0, this.input.length()-1);
			this.start();
		}
	}
	public boolean inDictionary(String temp){
		for (String str : this.dictionary) {
			if (str.equals(temp)) {
				return true;
			}
		}
		return false;
	}
}
