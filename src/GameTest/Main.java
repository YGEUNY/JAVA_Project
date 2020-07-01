package GameTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private ArrayList<Character> characters;
	Scanner sc =  new Scanner(System.in);
	long guid = 0;
//	long in = 100000000000000L;
	
	public static void main(String[] args) {
		Main run = new Main();
		run.menu();
	}
	
	public void menu() {
		while(true) {
			System.out.println("=====================");
			System.out.println("1. ĳ���� ����\n2. ĳ���� ����\n3. ���� ����");
			System.out.println("=====================");
			int choice = sc.nextInt();
			if(choice==1)	makeCharacter();
			else if(choice==2)	choiceCharacter();
			else if(choice == 3) break;
		}
		System.out.println("���� ����");
	}
	
	public void makeCharacter() {
		String characterName = sc.next();
		while(!existName(characterName)) {
			System.out.println("�̹� �����ϴ� ĳ���� �̸��Դϴ�. �ٽ� �Է��ϼ���");
			characterName = sc.next();
		}			
		String job = choiceJob();
		
		guid++;
		Character character = new Character(characterName, job,guid);
		characters.add(character);
		System.out.println("ĳ���� ���� �Ϸ�");
		
	}
	
	public boolean existName(String characterName){
		for(Character c : characters) {
			if(characterName.equals(c.getCharacterName())) 
				return false;
		}
		return true;
	}
	
	public String choiceJob(){
		System.out.println("======== ���� =======");
		System.out.println("1. �˻�\n2. �ü�\n3. ������\n4. �ڰ�");
		System.out.println("=====================");
		int choice;
		while(true) {
			 choice = sc.nextInt();
			if(choice != 1 && choice !=2 && choice !=3 && choice!=4) {
				System.out.println("���� ��ȣ�Դϴ�.");
			}
			else
				break;
		}
		if(choice == 1) 
			return "�˻�";
		else if(choice == 2)
			return "�ü�";
		else if(choice == 3)
			return "������";
		else if(choice == 4)
			return "�ڰ�";
		else	return null;		
	}
	
	
	public void choiceCharacter() {
		int index = 1;
		for(Character c: characters) {
			System.out.println("=============================================");
			System.out.println(index + c.toString());
			System.out.println("=============================================");
			index++;
		}
		System.out.print("�÷��� �� ĳ���͸� �����ϼ��� : ");
		int choice = sc.nextInt();
//		for() {
//			if() {
//
//			}
//			else
//				count++;
//		}
//		
//		if(count == guid)
//			System.out.println("�������� �ʴ� ĳ���� ����Դϴ�.");
	}
	
	
	public void settingItems() {
		
	}
		
	
//	public void showItems() {
//		
//		for(Item i : Items) {
//			
//		}
//		
//	}
	
}
