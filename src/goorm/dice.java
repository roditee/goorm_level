package goorm;

import java.util.Scanner;

public class dice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n>6) {for (int i=n-6; i<=6; i++) System.out.printf("%d %d\n", i, n-i);}
		else {for (int i=1; i<n; i++) System.out.printf("%d %d\n", i, n-i);}
	}
}
