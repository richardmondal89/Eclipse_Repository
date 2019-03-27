package com.rm.codejam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CoinJam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int T, N, J, count = 0;
		long max = 0, value, start;
		List<Map<String, List<Long>>> result = new ArrayList<Map<String, List<Long>>>();
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for (int i = 0; i < T; i++) {

			N = sc.nextInt();
			J = sc.nextInt();
			value = 1;
			for (int j = 1; j <= N; j++) {
				max = (long) (max + Math.pow(2, j));
			}
			start = (long) Math.pow(2, N) + 1;
			List<Long> lt;
			Map<String, List<Long>> map = new HashMap<String, List<Long>>();
			while ( count < J) {

				if (checkValidBoolean(start)) {
					lt = checkPrimeInallBase(start);
					if (lt != null) {
						map.put(Long.toBinaryString(start), lt);
						count++;
					}
				}
				start++;
				
			}

			result.add(i, map);
		}
		for (int i = 0; i < T; i++) {
			Set<String> key = result.get(i).keySet();
			System.out.println("Case #:" + (i + 1));
			for (String s : key) {
				System.out.print(s);

				for (Long l : result.get(i).get(s)) {
					System.out.print(" "+l);
				}
				System.out.println();
			}
		}

	}

	private static boolean checkValidBoolean(long start) {
		// TODO Auto-generated method stub
		String value = Long.toBinaryString(start);

		if (value.charAt(0) == '1' && value.charAt(value.length() - 1) == '1') {
			return true;
		} else
			return false;

	}

	private static List<Long> checkPrimeInallBase(long start) {
		// TODO Auto-generated method stub
		String value = Long.toBinaryString(start);
		long check = 0;
		List<Long> list = new ArrayList<Long>();
		// 2 t0 10s compliment
		for (int j = 2; j <= 10; j++){
			for (int i = 0; i < value.length(); i++) {
				check = (long) (check
						+ Math.pow(j, i) * Long.parseLong(String.valueOf(value.charAt(value.length() - 1 - i))));
				
			}
			if (checkforPrime((long)check)) {
				return null;
			}
			list.add(j - 2, checkNonTrival(check));
		}

		return list;
	}

	private static Long checkNonTrival(long check) {
		// TODO Auto-generated method stub
		for (long i = 2; i < check; i++) {
			if (check % i == 0)
				return (long) i;
		}
		return (long) 0;
	}

	private static boolean checkforPrime(long check) {
		// TODO Auto-generated method stub
	
		for (long i = 2; i < check && i<100000; i++) {
			if (check % i == 0)
				return false;
		}
		return true;
	}

}
