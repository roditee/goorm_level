package goorm;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		String[] exp = line.split(" ");
		
		int a = Integer.parseInt(exp[0]);
		int b = Integer.parseInt(exp[2]);
		String op = exp[1];
		System.out.println(a + " " + b + " " + op);
		if (op.equals("+")) System.out.println(a + b);
		else if (op.equals("-")) System.out.println(a - b);
		else if (op.equals("*")) System.out.println(a * b);
		else if (op.equals("/")) System.out.printf("%.2f", (float)a / b);
	}
}