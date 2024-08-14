package org.Jspider.Patterns;

import java.util.Scanner;

public class Ptn1 { // Pascal Triangle
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of lines: ");
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= n - i; j++)
				System.out.print(" ");
			int k = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(k + " ");
				k = k * (i - j) / j;
			}
			System.out.println();
		}
		sc.close();
	}
}
