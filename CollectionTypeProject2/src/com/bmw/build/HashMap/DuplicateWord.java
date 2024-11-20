package com.bmw.build.HashMap;
//find out the duplicate word in aaray using hashMap and using Advance forEachLoop====
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class DuplicateWord {
	public static void main(String[] args) {
		String strMsg = "Hello Java developer And Java Tester And developer developer";
		findDuplicateWordInAnString(strMsg);
	}
	public static void findDuplicateWordInAnString(String strMsg) {
		Map<String, Integer> wordCountMap =  new HashMap<>();
		String[] words = strMsg.split(" ");
		for(String word : words) {
			//System.out.println(word);
			if(wordCountMap.containsKey(word)) {
				wordCountMap.put(word, wordCountMap.get(word)+1);
			}else {
				wordCountMap.put(word, 1);
			}
		}
		Set<String> wordKeySet = wordCountMap.keySet();
		for(String word : wordKeySet) {
			if(wordCountMap.get(word)>0) {
				System.out.println(word + " : " +wordCountMap.get(word));
			}
		}
	}
}