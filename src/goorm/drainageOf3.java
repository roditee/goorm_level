package goorm;

import java.util.Scanner;

public class drainageOf3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			if (i%3 == 0) System.out.println('X');
			else System.out.println(i);
		}
		
		sc.close();
	}

}
