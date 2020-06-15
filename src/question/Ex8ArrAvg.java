package question;



public class Ex8ArrAvg {
	
	public static void main(String[] args) {
		
		int[] score = {90, 75, 85, 95, 70, 75, 85, 85, 95, 72};
		//score =  = new array[10]????????????????
		int sum = 0;
		
		System.out.print("점수 : ");
		for(int scoreList: score) {
			System.out.print(scoreList + "\t");
			sum += scoreList;
		}
		
		System.out.println("\n합계 : " + sum);
		System.out.println("평균 : " + (double)sum/score.length);
		
	}
}
