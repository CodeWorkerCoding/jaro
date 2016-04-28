package com.shenmajr.demo.main;

import com.shenmajr.fuzzy.match.JaroWinklerDistance;
import com.shenmajr.fuzzy.match.SplitSentence;

public class FuzzyMath {

	public static void main(String[] args) {
		String toMatchStr = "太好了，今天是星期六啊?";
		int result = 'z' - 'a';
//		System.out.println(result);
//		System.out.println(toMatchStr.length());
//		new SplitSentence(toMatchStr).start();
		
		JaroWinklerDistance distance = new JaroWinklerDistance();
		System.out.println(distance.getDistance("印象笔记", "印象文档"));//印象笔记 有道笔记  0.6667 印象文档
	}

}
