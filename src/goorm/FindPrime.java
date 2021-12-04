package goorm;

import java.util.Scanner;

public class FindPrime {
	
	public static boolean isPrime (int n) {
		if (n<2) return false;
		
		for (int i=2; i<n; i++) {
			if (n%i == 0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) throws Exception {
	Scanner scan = new Scanner(System.in);
	int A = scan.nextInt();
	
	if (isPrime(A)) System.out.println("True");
	else System.out.println("False");
	
	scan.close();
		}
	}


//public class FindPrime {
//	
//	public static boolean isPrime (int n) {
//		if (n<2) return false;
//		
//		for (int i=2; i<i*i; i++) {
//			if (n%i == 0) return false;
//		}
//		return true;
//	}
//	
//	public static void main(String[] args) throws Exception {
//	Scanner scan = new Scanner(System.in);
//	int A = scan.nextInt();
//	
//	if (isPrime(A)) System.out.println("True");
//	else System.out.println("False");
//		}
//	}