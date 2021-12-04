package goorm;

import java.util.Scanner;

public class legoBlock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cntLeftTop = 0;
		int cntRightTop = 0;
		int max = 0;
		int cntL = 1;
		int cntR = 1;
		
		int[] lego = new int[sc.nextInt()];
		for (int i=0; i<lego.length; i++) {
			lego[i] = sc.nextInt();
		}
		
		max = lego[0];
		for (int i=1; i<lego.length; i++) {
			if (max < lego[i]) cntL++;
		}
		
		max = lego[lego.length-1];
		for (int i=lego.length-2; i>=0; i--) {
			if (max < lego[i]) cntR++;
		}
		
		System.out.println(cntL + " " + cntR);
		
		sc.close();
	}
}
