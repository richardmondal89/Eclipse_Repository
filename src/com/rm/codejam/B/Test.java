package com.rm.codejam.B;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int T;
		String s;
		Scanner sc = new Scanner(System.in);
		String[] ar = { "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE" };
		List<String> list = new ArrayList<String>();
		String currentDigit = null;
		T = sc.nextInt();
		List<Integer> countList = new ArrayList<Integer>();

		List<Character> stList = new ArrayList<Character>();
		List<Character> tempList = new ArrayList<Character>();
		for (int i = 0; i < T; i++) {

			StringBuffer result = new StringBuffer();
			s = sc.next();
			stList.clear();
			for (int l = 0; l < s.length(); l++)
				stList.add(s.charAt(l));

			while (stList.size() > 0) {

				for (int j = 0; j < 9; j++) {
					countList.clear();
					currentDigit = ar[j];
					for (int k = 0; k < currentDigit.length(); k++) {
						if (stList.contains(currentDigit.charAt(k))) {
							
							countList.add(stList.indexOf(currentDigit.charAt(k)));
						} else {
							countList.clear();
							break;
						}
					}

					if (countList.size() > 0) {
						result.append(j);
						tempList.clear();
						for (int k = 0; k < stList.size(); k++){
							if(!countList.contains(k))
								tempList.add(stList.get(k));							
							
						}
						stList.clear();
						for (int k = 0; k < tempList.size(); k++){
							stList.add(tempList.get(k));
						}
					}

					if (stList.size() == 0) {
						break;
					}
				}

				list.add(new String(result.toString()));

			}
		}

		// Result

		for (int i = 0; i < T; i++) {
			System.out.println("Case #" + (i + 1) + ": " + list.get(i));
		}
	}

}
