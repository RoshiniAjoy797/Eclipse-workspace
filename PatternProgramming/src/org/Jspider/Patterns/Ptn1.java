package org.Jspider.Patterns;
import java.util.Scanner;
public class Ptn1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of lines:");
		int n = sc.nextInt();
		for(int i= 0; i<n;i++)
		{
			System.out.print(" * ");
			System.out.println("* ");
		}
		sc.close();
	}
}
