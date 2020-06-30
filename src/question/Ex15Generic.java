package question;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex15Generic {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		runGeneric();
	}
	
	public static void runGeneric() {
		Ex15Generic gn = new Ex15Generic();
		int number1 = 0, number2 = 0;
		System.out.print("a = ");
		number1 = gn.inputNumber();
		System.out.print("b = ");
		number2 = gn.inputNumber();
		Generic gen = new Generic(number1, number2);
		gen.toString();
	}

	
	public int inputNumber() {
		int number = 0;
		while(true) {
			try {
				number = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				sc = new Scanner(System.in);
				System.out.print("숫자를 입력하세요: ");
			}
		}
		return number;
	}
	
}
