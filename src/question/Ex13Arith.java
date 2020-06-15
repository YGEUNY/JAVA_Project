package question;

import java.util.Scanner;

public class Ex13Arith {
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Ex13Arith start = new Ex13Arith();
		start.print();
	}
	
	public void print() {
		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();
		calcPlus(x, y);
		calcMinus(calcPlus(x,y), 2);
		calcMul(calcMinus(calcPlus(x,y), 2), 2);
		
		System.out.println("<" + x + " + " + y + " - 2> * 2 / 3 = " + calcDiv(calcMul(calcMinus(calcPlus(x,y), 2), 2), 3));
	}
	
	public int calcPlus(int x, int y) {
		return x + y;
	}
	
	public int calcMinus(int x, int y) {		
		return x - y;
	}
	
	public int calcMul(int x, int y) {
		return x * y;
	}
	
	public int calcDiv(int x, int y) {
		return x / y;
	}
}
