package goorm;

import java.util.Scanner;

public class delSpace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(str.replace(" ", ""));
		
		sc.close();
	}
}
