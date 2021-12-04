package goorm;

import java.util.Scanner;

public class electric {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float pay = n;
		
		if (n<100) pay*=0.005;
		else if (n>=100 && n<200) pay*=0.007;
		else if (n>=200 && n<300) pay*=0.009;
		else pay*=0.01;
		
		System.out.printf("%.2f", pay);
		
		sc.close();
	}
}
