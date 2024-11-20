package com.bmw.build.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class DuplicateChar {
	public static void main(String[] args) {
		String strMsg = "DEVELOPER";
		findDuplicateCharacterInString(strMsg);
	}
	public static void findDuplicateCharacterInString(String strPassMsg) {
		char[] charArray = strPassMsg.toCharArray();
		Map<Character, Integer> charCountMap = new HashMap<>();     
		for(char character : charArray) {
			if(charCountMap.containsKey(character)) {
				charCountMap.put(character, charCountMap.get(character) + 1);
			}else {
			charCountMap.put(character,1);
			}
		}
		Set<Character> keySet = charCountMap.keySet();
		for(Character  characterValue : keySet) {
			if(charCountMap.get(characterValue) >=1) {
				System.out.println(characterValue + " : " +charCountMap.get(characterValue) );
			}
		}
	}
}