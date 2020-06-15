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
		System.out.println("1. ���� Ȯ��\n2. �ܾ�Ȯ��\n3. �Ա�\n4. ���\n5. ����");
		System.out.println("===================");
	}
	public void start() {
		int i = 0;
		balance = 10000;
		while(i!=5) {
			menu();
			System.out.print("��ȣ �Է�: ");
			i = numberException();
			if(i == 1)
				System.out.println(i + ".\t" + bank());
			else if(i == 2)	
				System.out.println("�ܾ� : " + connectToDecimalFormat(balance(balance)));
			else if(i == 3) deposit();
			else if(i == 4) withdraw();
			else if(i == 5) break;
		}
		System.out.println("�����մϴ�.");
	}
	
	public String bank() {
		return "���� 123-456789  (������ : ��ٿ�)";
	}
	
	public int balance(int balance) {
		return balance;
	}
	
	public void deposit() {
		
		System.out.print("�Ա��� �ݾ� : ");
		int money = 0;
		money = numberException();
		
		while(ifMoney(money) == false) 
			money = numberException();
	
		System.out.println(connectToDecimalFormat(money) + "�� �Ա��մϴ�.");
		balance = money + balance(balance);
		balance(balance);
	}
	
	public void withdraw() {
		System.out.print("����� �ݾ� : ");
		int money = 0;
		money = numberException();
		
		while(withdrawError(money, balance) != true  || ifMoney(money) != true)
			money = numberException();
			
		System.out.println(connectToDecimalFormat(money) + "�� ����մϴ�.");
		balance = balance(balance) - money;
		balance(balance);
	}
	
	public String connectToDecimalFormat(int money) {
		DecimalFormat format = new DecimalFormat("###,###");
		return format.format(money);
	}
	
	public boolean withdrawError(int money, int balance) {
		if(money > balance) {
			System.out.print("�ܾ��� �����մϴ�. �ٽ� �Է��ϼ��� : ");
			return false;
		}
		else
			return true;	
	}
	
	public boolean ifMoney(int money) {
		if(money < 0) {
			System.out.print("�ùٸ� �ݾ��� �Է��ϼ��� : ");
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
				System.out.print("���ڸ� �Է��ϼ��� :");
			}
		}
		return number;
	}

}