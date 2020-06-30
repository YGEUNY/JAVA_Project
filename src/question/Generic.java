package question;

public class Generic {
	private int number1 = 0, number2 = 0;

	public Generic(int number1, int number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
	}

	@Override
	public String toString() {
		return "사칙연산 결과 : " + (number1 + number2) + ", " + (number1 - number2) + ", "+ (number1 * number2) + ", "+ (number1 / number2);
	}
	
	

}
