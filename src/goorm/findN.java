package goorm;

import java.util.Scanner;

public class findN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int sum = 0;
		
		for (int i=1; i<A; i++) {
			sum+=i;
			if (sum>A) {
				System.out.println(i);
				break;
			}
		}
	}
}
