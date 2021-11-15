package goorm;

import java.util.Scanner;

public class testAvgLevel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		float avg = (float)(a+b+c)/3;
		String level = null;
		
		if (avg>=90) level = "A";
		else if (avg<90 && avg>=80) level = "B";
		else if (avg<80 && avg>=70) level = "C";
		else if (avg<70 && avg>=60) level = "D";
		else level = "F";
		System.out.printf("%.2f %s", avg, level);
	}

}
