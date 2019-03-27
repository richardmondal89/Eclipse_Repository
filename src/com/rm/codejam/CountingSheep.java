package com.rm.codejam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CountingSheep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long N, next = 0, currenrt, T;
		Scanner sc = new Scanner(System.in);
		T = sc.nextLong();
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < T; i++) {
			currenrt = N = sc.nextLong();
			Map<Long, Boolean> map = new HashMap<Long, Boolean>();
		//	System.out.println(map.size());
			insertintomap(map, currenrt);
			int count = 1, flag = 0;
			while (true) {
				if (map.size() == 10) {
					break;
				}
				next = (++count) * N;
				insertintomap(map, next);
				if (currenrt == next) {
					flag = 1;
					break;
				}
				if (currenrt > next) {
					flag = 1;
					break;
				}
				currenrt = next;
			}
			if (flag == 1) {
				list.add(i, "INSOMNIA");
			} else {
				list.add(i, String.valueOf(next));
			}

		}
		
		for (int i = 0; i < T; i++) {
			System.out.println("Case #"+(i+1)+": "+list.get(i));
		}
	}

	private static void insertintomap(Map<Long, Boolean> map, long n) {
		// TODO Auto-generated method stub
		while (n != 0) {
			map.put(n % 10, true);
			n = n / 10;
		}
	}

}
