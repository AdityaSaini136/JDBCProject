package com.bmw.build.HashMap;
//find out the duplicate word in aaray using hashMap and using  forLoop====
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DuplicateWord2 {
	public static void main(String[] args) {
		String strMsg = "Hello Java developer And Java Tester And developer developer";
		findDuplicateWordInArrayUsingCollection(strMsg);
	}
	public static void findDuplicateWordInArrayUsingCollection(String strMsg) {
		Map<String , Integer> mapWordCount = new HashMap<>();
		String[] wordArray = strMsg.split(" ");
		for(int i = 0; i<wordArray.length; i++) {
			String word = wordArray[i];
			if(mapWordCount.containsKey(word)) {
				mapWordCount.put(word, mapWordCount.get(word)+1);
			}else {
				mapWordCount.put(word, 1);
				//System.out.println(mapWordCount.containsKey(word));
			}
		}
		//System.out.println(word);
		Set<String> wordkeySet = mapWordCount.keySet();
		Iterator<String> iterator = wordkeySet.iterator();
		while(iterator.hasNext()) {
			String wordKey = iterator.next();
           // System.out.println(wordKey);
              if(mapWordCount.get(wordKey)>0) {
            	 // System.out.println(wordKey);
            	  System.out.println(wordKey + " : "+ mapWordCount.get(wordKey));
              }
		 }
	 }
 }