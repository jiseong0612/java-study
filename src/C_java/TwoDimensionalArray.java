package C_java;

import java.util.Scanner;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x : ");
		int x = sc.nextInt();
		System.out.print("Enter y : ");
		int y = sc.nextInt();
		
		int[][]graph = new int[x][y];
		System.out.println("===========================");
		System.out.println("A ["+ x +" X "+ y+"] graph has been created...");
		System.out.println("===========================");
		
		for(int row = 0; row < graph.length; row++) {
			for(int col = 0; col <graph[row].length; col++) {
				System.out.print(graph[row][col] + ", ");
			}
			System.out.println();
		}
		
		System.out.println("===========================");
		System.out.println("End");
		
	}
}
