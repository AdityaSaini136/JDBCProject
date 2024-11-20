package com.infosys.List;

import java.util.ArrayList;
import java.util.Collections;

public class VC {
	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<>(2);
		al1.add(711);
		al1.add(221);
		al1.add(33);
		al1.add(44);
		al1.add(552);
		Collections.sort(al1);
		System.out.println(al1);
	}

}
