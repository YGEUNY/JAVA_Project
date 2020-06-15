package question;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankAccount {
	
	Scanner sc = new Scanner(System.in);
	
	int balance;
	
	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount();
		ba.start();
	}
	
	public void menu() {
		System.out.println("===================");
		System.out.println("1. 계좌 확인\n2. 잔액확인\n3. 입금\n4. 출금\n5. 종료");
		System.out.println("===================");
	}
	public void start() {
		int i = 0;
		balance = 10000;
		while(i!=5) {
			menu();
			System.out.print("번호 입력: ");
			i = numberException();
			if(i == 1)
				System.out.println(i + ".\t" + bank());
			else if(i == 2)	
				System.out.println("잔액 : " + connectToDecimalFormat(balance(balance)));
			else if(i == 3) deposit();
			else if(i == 4) withdraw();
			else if(i == 5) break;
		}
		System.out.println("종료합니다.");
	}
	
	public String bank() {
		return "계좌 123-456789  (예금주 : 양근영)";
	}
	
	public int balance(int balance) {
		return balance;
	}
	
	public void deposit() {
		
		System.out.print("입금할 금액 : ");
		int money = 0;
		money = numberException();
		
		while(ifMoney(money) == false) 
			money = numberException();
	
		System.out.println(connectToDecimalFormat(money) + "원 입금합니다.");
		balance = money + balance(balance);
		balance(balance);
	}
	
	public void withdraw() {
		System.out.print("출금할 금액 : ");
		int money = 0;
		money = numberException();
		
		while(withdrawError(money, balance) != true  || ifMoney(money) != true)
			money = numberException();
			
		System.out.println(connectToDecimalFormat(money) + "원 출금합니다.");
		balance = balance(balance) - money;
		balance(balance);
	}
	
	public String connectToDecimalFormat(int money) {
		DecimalFormat format = new DecimalFormat("###,###");
		return format.format(money);
	}
	
	public boolean withdrawError(int money, int balance) {
		if(money > balance) {
			System.out.print("잔액이 부족합니다. 다시 입력하세요 : ");
			return false;
		}
		else
			return true;	
	}
	
	public boolean ifMoney(int money) {
		if(money < 0) {
			System.out.print("올바른 금액을 입력하세요 : ");
			return false;
		}
		else
			return true;	
	}
	
	public int numberException() {
		int number = 0;
		while(true) {
			try {
				number = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				sc = new Scanner(System.in);
				System.out.print("숫자를 입력하세요 :");
			}
		}
		return number;
	}

}