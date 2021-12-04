package goorm;

import java.util.Scanner;

public class findMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = -1;
		int idx = 0;
		
		for (int i=0; i<n; i++) {
			int num = sc.nextInt();
			if (num > max) { max = num; idx = i+1;}
		}
		System.out.println(max + " " + idx);
		sc.close();
	}
}
