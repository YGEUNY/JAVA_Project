package study;

import java.util.Scanner;

public class Bank {	
	public static void main(String[] args) {
		runBankAccountExample();
	}
	
	public static void runBankAccountExample() {
		BankAccountManager man = new BankAccoountManager();
		Scanner sc = new Scanner(System.in);
		
		String account = "";
		String holder = "";
		int amount = 0;
		
		System.out.print("생성할 계좌 입력 : ");
		account = sc.next();
		System.out.print("계좌주 입력 : ");
		holder = sc.next();
		System.out.print("계좌 잔액 입력 : ");
		amount = sc.nextInt();
		
		if(man)
	}

}
