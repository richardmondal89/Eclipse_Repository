package com.rm.jobChalanges.goldManSachs;

import java.util.Arrays;
import java.util.Scanner;

public class BuyMaximumStocks {

	static int buyMaximumProducts(int n, float k, float[] a) {
		float[] sortArray = new float[n];
		float sum = 0;
		int totalStock = 0;
		for (int i = 0; i < n; i++) {
			sortArray[i] = a[i];
		}
		Arrays.sort(sortArray);

		for (int i = 0; i < sortArray.length; i++) {
			for (int j = a.length - 1; j >= 0; j--) {
				if (sortArray[i] == a[j] && a[j] != -(float) 100.00 && sum < k) {

					for (int l = j; l >= j; l--) {
						if (a[j] * l + sum <= k) {
							sum = sum + a[j]*l;
							totalStock = totalStock + l;
							a[j] = (float) -100.00;
							break;
						}
					}

				}
			}
		}

		return totalStock;
		// Complete this function
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		float[] arr = new float[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextFloat();
		}
		float k = in.nextFloat();
		int result = buyMaximumProducts(n, k, arr);
		System.out.println(result);
		in.close();
	}

}
