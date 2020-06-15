package question;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BankAccount {
	
	Scanner sc = new Scanner(System.in);
	DecimalFormat formatter = new DecimalFormat("###,###");
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
			i = sc.nextInt();
			if(i == 1)
				System.out.println(i + ".\t" + bank());
			else if(i == 2)	
				System.out.println("잔액 : " + formatter.format(balance(balance)));
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
		int money = sc.nextInt();
		ifMoney(money);
		while(ifMoney(money) == false) {
			System.out.print("올바른 입금액을 입력하세요 : ");
			money = sc.nextInt();
			ifMoney(money);
		}
		
		System.out.println(formatter.format(money) + "원 입금합니다.");
		balance = money + balance(balance);
		balance(balance);
	}
	
	public void withdraw() {
		System.out.print("출금할 금액 : ");
		int money = sc.nextInt();

		withdrawError(money, balance);
		
		while(withdrawError(money, balance) != true) {
			System.out.print("잔액이 부족합니다. 다시 입력하세요 : ");
			money = sc.nextInt();
			withdrawError(money, balance);
		}
		
		System.out.println(formatter.format(money) + "원 출금합니다.");
		balance = balance(balance) - money;
		balance(balance);
	}
	
	public boolean withdrawError(int money, int balance) {
		if(money < balance)
			return true;
		else
			return false;	
	}
	
	public boolean ifMoney(int money) {
		if(money > 0)
			return true;
		else
			return false;	
	}

}



//public void account() {
//	bal = 10000;
//	
//	System.out.println("계좌 : 123-456789\t(예금주 : 양근영)");
//	System.out.println("잔액 : " + bal);
//	input(bal);
//}
//
//public void input(int bal) {
//	int money;
//	System.out.print("입금 금액 : ");
//	money = sc.nextInt();
//	
//	bal += money;
//	System.out.println(money + "원 입금합니다.");
//	System.out.println("잔액 : " + bal + "원");
//	output(bal);
//}
//
//public void output(int bal) {
//	int money;
//	System.out.print("출금 금액 : ");
//	money = sc.nextInt();
//	
//	bal -= money;
//	System.out.println(money + "원 출금합니다.");
//	System.out.println("잔액 : " + bal + "원");
//}
