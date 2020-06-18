package question;

/////////////// Alt + Shift + F ������ �� ���� //////////

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Bank ba = new Bank();
		ba.start();
	}	
	
	public void menu() {
		System.out.println("===================");
		System.out.println("1. ���� ����\n2. ���� ����\n3. ���� ����\n4. ����");
		System.out.println("===================");
	}
	
	public void start() {
		int i = 0;
		BankAccountManager bm = new BankAccountManager();
		while(i!=4) {
			menu();
			System.out.print("��ȣ �Է�: ");
			i = numberException();
			if(i == 1)
				bm.makeAccount();
			else if(i == 2)
				bm.removeAccount();
			else if(i == 3)
				bm.selectAccount();
			else if(i == 4) break;
				
		}
		System.out.println("�����մϴ�.");
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
