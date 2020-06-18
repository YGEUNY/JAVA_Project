package question;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankAccount {
	private String mAccount = "", mAccountName = "";
	private int mBalance =0;
	private int balance = 0;
	Scanner sc = new Scanner(System.in);


	public BankAccount(String account, String name, int balance) {
		mAccount = account;
		mAccountName = name;
		mBalance = balance;
	}
	
	public void deposit() {
		System.out.print("�Ա��� �ݾ� : ");
		balance = numberException();
		
		while(ifNegativeAmount(balance) == false) 
			balance = numberException();
	
		System.out.println(convertToDecimalFormat(balance) + "�� �Ա��մϴ�.");
		mBalance = mBalance + balance;
	}

	public void withdraw() {
		System.out.print("����� �ݾ� : ");
		balance = numberException();
		
		while(withdrawError(mBalance, balance) != true  || ifNegativeAmount(balance) != true)
			balance = numberException();
			
		System.out.println(convertToDecimalFormat(balance) + "�� ����մϴ�.");
		mBalance = mBalance - balance;
	}
	
	public String convertToDecimalFormat(int amount) {
		DecimalFormat format = new DecimalFormat("###,###");
		return format.format(amount);
	}
	
	public boolean withdrawError(int mBalance, int balance) {
		if(balance > mBalance) {
			System.out.print("�ܾ��� �����մϴ�. �ٽ� �Է��ϼ��� : ");
			return false;
		}
		else
			return true;	
	}
	
	public boolean ifNegativeAmount(int amount) {
		if(amount < 0) {
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

	public String getmAccount() {
		return mAccount;
	}

	public void setmAccount(String mAccount) {
		this.mAccount = mAccount;
	}	
	
	public int getmBalance() {
		return mBalance;
	}

	public void setmBalance(int mBalance) {
		this.mBalance = mBalance;
	}

	@Override
	public String toString() {
		return "\t���¹�ȣ:" + mAccount + "\t ������: " + mAccountName + "\t �ܾ�: " + mBalance;
	}
}
