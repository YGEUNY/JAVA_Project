package question;

import java.util.Scanner;

public class Ex7Score {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int score = 0;
		char grade = ' ';
		
		System.out.print("���� �Է� : ");
		score = sc.nextInt();
		
		if(score <100 && score >= 0) {
			if(score <100 && score >= 90)
				grade = 'A';
			else if(score < 90 && score >= 80)
				grade = 'B';
			else if(score < 80 && score >= 70)
				grade = 'C';
			else if(score < 70 && score >= 60)
				grade = 'D';
			else 
				grade = 'F';
		}
		else {
			System.out.println("���� �߸� �Է�");
		}
		
		System.out.println("���� : " + grade);
			
	}

}
