package question;

public class Ex9MArr {

	public static void main(String[] args) {
		
		int[][] student = {{90, 80, 80}, {85, 85,95}, {95, 70, 75}, {80, 80, 90}, {90, 75, 80}};
		int sum = 0;
		double avg = 0;
	
		
		for(int i = 0; i < student.length; i++) {
			for(int j = 0; j < student[i].length; j++) {
				sum += student[i][j];
			}
			avg = (double)sum/student[i].length;
			System.out.println("ID-" + i + ": ÇÕ°è-" + sum + ", Æò±Õ-" + Math.round(avg*100)/100.0);
			sum = 0;
			avg = 0;
		}
		
		
		
//		for(int[] sum: student) {
//		
//			for(int score: sum) {
//				System.out.print(score+"\t");
//			}
//			System.out.println();
//		}
							
	}
}
