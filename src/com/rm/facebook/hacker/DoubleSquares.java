package com.rm.facebook.hacker;

import java.util.Scanner;

public class DoubleSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] result = new int[T];
		int count;

		int sqRt, N;
		for (int t = 0; t < T; t++) {
			N = sc.nextInt();
			sqRt = (int) Math.sqrt(N);
			count = 0;
			if (N == 0) {
				result[t] = 1;
			} else if (N == 1) {
				result[t] = 1;
			} else {
				int a[] = new int[sqRt];
				int b[] = new int[sqRt];
				for (int i = 0; i <= sqRt; i++) {
					for (int j = 0; j <= sqRt; j++) {
						if (i * i + j * j == N && valid(a, b, i, j)) {
							a[count] = i;
							b[count] = j;
							count++;
						}
					}
				}
				result[t] = count;
			}
		}
		for (int t = 0; t < T; t++) {
			System.out.println("Case #" + (t + 1) + ": " + result[t]);
		}

	}

	private static boolean valid(int[] a, int[] b, int i, int j) {
		// TODO Auto-generated method stub
		for (int l = 0; l < a.length; l++) {
			if ((a[l] == i && b[l] == j) || (a[l] == j && b[l] == i)) {
				return false;
			}
		}

		return true;
	}

}
