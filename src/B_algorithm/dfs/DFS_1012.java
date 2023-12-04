package B_algorithm.dfs;

import java.util.Scanner;

public class DFS_1012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt(); // 테스트 케이스의 수

		for (int i = 0; i < t; i++) {
			int m = sc.nextInt(); // 배추밭의 가로 길이
			int n = sc.nextInt(); // 배추밭의 세로 길이
			int k = sc.nextInt(); // 배추의 개수

			int[][] graph = new int[n][m]; // 배추밭을 나타내는 그래프

			// 배추의 위치를 그래프에 표시
			for (int j = 0; j < k; j++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				graph[y][x] = 1;
			}

			int result = 0; // 배추 그룹의 개수 초기화

			// 모든 좌표를 순회하면서 DFS를 통해 배추 그룹 확인
			for (int a = 0; a < n; a++) {
				for (int b = 0; b < m; b++) {
					if (graph[a][b] == 1) {
						dfs(graph, a, b);
						result++; // DFS를 마치면 배추 그룹이 하나 완성됨
					}
				}
			}
			System.out.println(result);
		}
		sc.close();
	}

	// DFS를 통해 배추 그룹 확인
	private static void dfs(int[][] graph, int x, int y) {
		int n = graph.length;
		int m = graph[0].length;

		if (x < 0 || x >= n || y < 0 || y >= m || graph[x][y] == 0) {
			return; // 범위를 벗어나거나 이미 방문한 곳이면 종료
		}

		graph[x][y] = 0; // 방문한 곳을 0으로 마킹

		// 상하좌우에 대해 DFS 수행
		dfs(graph, x - 1, y);
		dfs(graph, x + 1, y);
		dfs(graph, x, y - 1);
		dfs(graph, x, y + 1);
	}

}
