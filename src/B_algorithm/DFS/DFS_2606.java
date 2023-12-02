package B_algorithm.DFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class DFS_2606 {

	static boolean[][] graph;
	static boolean[] visited;
	static int n, m;
	static int answer;

	public static void dfs(int idx) {
		visited[idx] = true;
		answer++;
		
		//재귀함수 이해가 안가.. 공부해라
		for(int i = 1; i <=n; i++)
			if(visited[i] == false && graph[idx][i])
				dfs(i);
	}

	public static void main(String[] args) throws IOException {
		// 백준 바이러스 2606
		// DFS 키워드
		// 네트워크 상에서 연결되어 있는 모든 컴퓨터(그래프, 연결 == 탐색해야겠구나!)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());

		graph = new boolean[n + 1][n + 1];
		visited = new boolean[n + 1];

		// 1.graph 에 연결 정보 채우기
		int x, y;
		for (int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			graph[x][y] = true;
			graph[y][x] = true;
		}

		// 2.dfs 재귀함수 호출
		dfs(1); // 니가 감염할 수 있는 컴퓨터를 감염해봐!

		// 3.출력
		// BufferedWriter.write(int)라는 것이 존재하기는 하지만 여기서의 int는 System.out.println에 int를
		// 넘겨주는 것과는 의미가 전혀 다릅니다.
		// 정수를 사람이 읽기 좋은 10진수의 형태로 출력해주는 것이 아니라, 그냥 한 글자의 값을 그대로 출력해주는 것입니다.
		// 예를 들어 65라는 값을 10진수 형태로 출력하면 "65"가 출력되겠지만 , 65라는 값 자체를 출력하면 65의 아스키 코드에 해당하는
		// 문자인 'A'가 출력됩니다.
		bw.write(String.valueOf(answer - 1));

		br.close();
		bw.close();
	}
}
