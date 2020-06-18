package question;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankAccountManager {
	Scanner sc = new Scanner(System.in);
	private ArrayList<BankAccount> mBankAccounts;
	
	public static void main(String[] args) {
		BankAccountManager bm = new BankAccountManager();
		for(int i=0;i<3;i++) {
			bm.makeAccount();
		}
	}
	
	public BankAccountManager() {
		mBankAccounts = new ArrayList<BankAccount>();
		//mBankDic = new Hashtable();
	}
	
	public void makeAccount() {
		String account, name;
		int balance = 0;
		System.out.print("������ ���� �Է� : ");
		account = sc.next();
		System.out.print("������ �Է� : ");
		name = sc.next();
		System.out.print("���� �ܾ� �Է� : ");
		balance = sc.nextInt();
		
		if(addAccount(account, name, balance))
			System.out.println("���¸� �����Ͽ����ϴ�.");
		else 
			System.out.println("�ߺ��� �����Դϴ�.");	
	}
	
	public boolean addAccount(String account, String name, int balance) {
		for(BankAccount ba : mBankAccounts) {
			if(ba.getmAccount().equals(account)) {
				System.out.println(" error message");
				return false;
			}
		}
		BankAccount ba = new BankAccount(account, name, balance);
		mBankAccounts.add(ba);
		return true;
	}
	
	public void removeAccount() {
		int number = 1;
		System.out.println("==============���� ���==============");
		for(BankAccount ba : mBankAccounts) {
			System.out.println(number + "." + ba.toString());
			number++;
		}
		System.out.println("=====================================");
		System.out.print("������ ���¸� �����ϼ��� : ");
		int index = 0;
		index = sc.nextInt();
		if((index - 1) <= mBankAccounts.size() && (index - 1) >= 0){
			mBankAccounts.remove(index-1);
			System.out.println(index-1 + "�� ���¸� �����Ͽ����ϴ�.");
		}else
			System.out.println("�������� �ʴ� ����Դϴ�.");
	}
	
	public void selectAccount() {
		int number = 1;
		System.out.println("==============���� ���==============");
		for(BankAccount ba : mBankAccounts) {
			System.out.println(number + "." + ba.toString());
			number++;
		}
		System.out.println("=====================================");
		System.out.print("���¸� �����ϼ��� : ");
		int index = 0;
		index = sc.nextInt();
		if((index - 1) <= mBankAccounts.size() && (index - 1) >= 0){
			start(index);
		}else
			System.out.println("�������� �ʴ� ����Դϴ�.");
	}
	
	public void menu() {
		System.out.println("===================");
		System.out.println("1. ���� Ȯ��\n2. �ܾ�Ȯ��\n3. �Ա�\n4. ���\n5. ����");
		System.out.println("===================");
	}
	
	public void start(int index) {
		int i = 0;
		int indexNumber = index -1;
		while(i!=5) {
			menu();
			System.out.print("��ȣ �Է�: ");
			i = numberException();
			if(i == 1)
				System.out.println(mBankAccounts.get(indexNumber));
			else if(i == 2)	
				System.out.println("�ܾ� : " + connectToDecimalFormat(mBankAccounts.get(indexNumber).getmBalance()));
			else if(i == 3) mBankAccounts.get(indexNumber).deposit();
			else if(i == 4) mBankAccounts.get(indexNumber).withdraw();
			else if(i == 5) break;
		}
		System.out.println("�����մϴ�.");
	}
	
	private String connectToDecimalFormat(int getmBalance) {
		// TODO Auto-generated method stub
		DecimalFormat format = new DecimalFormat("###,###");
		return format.format(getmBalance);
	}	
	
	public BankAccount getAccount(String account) {
		return null;
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