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
		
		System.out.print("������ ���� �Է� : ");
		account = sc.next();
		System.out.print("������ �Է� : ");
		holder = sc.next();
		System.out.print("���� �ܾ� �Է� : ");
		amount = sc.nextInt();
		
		if(man)
	}

}
