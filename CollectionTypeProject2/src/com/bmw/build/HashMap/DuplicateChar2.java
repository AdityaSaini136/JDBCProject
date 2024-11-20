package com.bmw.build.HashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateChar2 {
	public static void main(String[] args) {
		String strMsg = "EVELOVPER";
		findFirstRepetableAndNonRepetableCharacter(strMsg);
	}
	public static void findFirstRepetableAndNonRepetableCharacter(String strPass) {
		char[] charArray = strPass.toCharArray();
		Map<Character, Integer> mapCharCounter = new LinkedHashMap<>();
		for(char  character : charArray) {
			if(mapCharCounter.containsKey(character)) {
				mapCharCounter.put(character, mapCharCounter.get(character) +1);
			}else {
				mapCharCounter.put(character, 1);
			}
		}
		for(char character : charArray) {
			if(mapCharCounter.get(character) > 1) {
				System.out.println("First repetable character:>>>" +character+ ":" +mapCharCounter);
				break;
			}
		}
		for(char character : charArray) {
			if(mapCharCounter.get(character) ==1) {
				System.out.println("First Non Repetable character :>>>"+ character+ " : "+ mapCharCounter);
				break;
			}
		}
	}
}