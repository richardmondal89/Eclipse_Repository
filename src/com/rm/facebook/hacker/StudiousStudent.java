package com.rm.facebook.hacker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudiousStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String result[] = new String[N];
		String s;
		
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < N; i++) {
			s = sc.next();
			int l = Integer.parseInt(s);
			StringBuilder sb = new StringBuilder();
			list.clear();
			for (int j = 0; j < l; j++) {
				list.add(sc.next());
			}
			Collections.sort(list);
			for (String str : list) {
				sb.append(str);
			}
			result[i] = sb.toString();
		}

		for (int i = 0; i < N; i++) {
			System.out.println("Case #" + (i + 1) + ": " + result[i]);
		}

	}

}
