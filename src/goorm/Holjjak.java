package goorm;

import java.util.Scanner;

public class Holjjak {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		if (n%2 == 0) System.out.println("even");
		else System.out.println("odd");
		
		s.close();
	}

}
