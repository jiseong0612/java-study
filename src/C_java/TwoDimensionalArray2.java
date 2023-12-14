package C_java;

import java.util.Scanner;

public class TwoDimensionalArray2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 수를 입력하세요 : ");
		int studentCount = sc.nextInt();
		
		String[] subject = {"국어", "영어", "수학"};
		int[][] scores = new int[studentCount][subject.length];
		double[] sum = new double[studentCount];
		
		for(int i = 0; i<scores.length; i++) {
			System.out.println((i+1) + "번 학생의 성적을 입력하세요 : ");
			
			for(int j = 0; j <subject.length; j++) {
				System.out.print(subject[j] +" 점수 : ");
				int point = sc.nextInt();
				scores[i][j] = point;
				sum[i] += point;
			}
		}
		
		for(int i = 0; i<scores.length; i++) {
			double total = sum[i];
			double average = sum[i]/subject.length;
			System.out.println(i +"번 학생의 총점 : "+ total  + " 평균 : " + average);
		}
		
		sc.close();
	}
}
