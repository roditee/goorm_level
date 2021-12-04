package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class minesweeper {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = br.read() - 48;
		br.read();
		int n = br.read() - 48;
		br.read();
		
		char[][] board = new char[n][m];
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				board[i][j] = (char)br.read();
			}
			br.read();
		}
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				int cnt = 0;
				if (board[i][j] != '*') {
					if (i>0 && board[i-1][j] == '*') cnt++;

				}
			}
		}
	}
}
