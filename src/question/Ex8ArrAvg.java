package question;



public class Ex8ArrAvg {
	
	public static void main(String[] args) {
		
		int[] score = {90, 75, 85, 95, 70, 75, 85, 85, 95, 72};
		//score =  = new array[10]????????????????
		int sum = 0;
		
		System.out.print("���� : ");
		for(int scoreList: score) {
			System.out.print(scoreList + "\t");
			sum += scoreList;
		}
		
		System.out.println("\n�հ� : " + sum);
		System.out.println("��� : " + (double)sum/score.length);
		
	}
}
