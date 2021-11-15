package goorm;

import java.util.Scanner;

public class NarcissisticNumber {
	static boolean isNarcissistic(int n) {
		int a = n;
		int b = 0;
		int sum = 0;
		while(a!=0) {
			b= a%10;
			a = (int) a/10;
			sum += (int) Math.pow(b, 3);
		}
		return sum == n;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		for (int i=start; i<=end; i++) {
			boolean ret = isNarcissistic(i);
			if (ret) System.out.printf("%d ",i);
		}
	}
}
