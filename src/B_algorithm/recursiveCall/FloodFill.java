package B_algorithm.recursiveCall;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class FloodFill {
	static int N;
	static int[][] Board = new int[100][100];	//문제에 따른 최댓값을 선언 100*100 을 그릴수 있다. 

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());  // Board (row * col) 정 사각형의 보드 사이즈를 정한다.
		
     																//00000
		//board 의 벽을 하나하나 그린다, 1이 벽                           	//00011  
		for(int i = 0; i < N; i++)					                //00010  
			for(int j = 0; j < N; j++)                              //11110  
				Board[i][j] = Integer.parseInt(br.readLine());		//00000  
		
		//sRow : 시작할 가로줄, sCol : 시작할 세로줄 -> 좌표값을 입력받음
		int sRow, sCol;
		StringTokenizer st = new StringTokenizer(br.readLine());	//공백으로 split
		sRow = Integer.parseInt(st.nextToken());
		sCol = Integer.parseInt(st.nextToken());
		
		fill(sRow, sCol);
	}
	
	/**
	 * 경계면인 1을 벗어나지 않고 0을 1로 바꾼다
	 * @param r
	 * @param c
	 */
	public static void fill(int r, int c) {
		//base Case
		if(r < 0 || r >(N -1) || c < 0 || c  >(N - 1)) return;	//해당 보드의 경우 인덱스4 이므로 (5*5), 0~ n-1까지
		if(Board[r][c] != 0) return;	//0이 아니라면 벽을 만났거나 이미 1로 바뀜
		
		Board[r][c] = 1;	//벽 인덱스를 넘지도, 0이 아니라면 1로 채움
		
		//recursive case 
		fill(r-1, c);	//위
		fill(r+1, c);	//아래
		fill(r, c-1);	//왼쪽
		fill(r, c+1);	//오른쪽
	}
}
