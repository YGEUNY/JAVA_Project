package GameTest;

import java.util.ArrayList;

public class World {
	// ĳ�����̸� �ߺ� üũ
	// ĳ���� guid�� �����ϴ� ĳ���� ghidManager�����
	private ArrayList<Character> characters;
	GameScanner sc = new GameScanner();
	private CharacterManager characterManager;

	public World(){
		characters = new ArrayList<Character>();
		characterManager = new CharacterManager();
	}
	
	public void menu() {
		while (true) {
			System.out.println("=====================");
			System.out.println("1. ĳ���� ����\n2. ĳ���� ����\n3. ���� ����");
			System.out.println("=====================");
			int choice = sc.inputNumber();
			if (choice == 1)
				makeCharacter();
			else if (choice == 2)
				choiceCharacter();
			else if (choice == 3)
				break;
		}
		System.out.println("���� ����");
	}

	public void makeCharacter() {
		System.out.print("ĳ���� �̸� �Է�>>");
		String characterName = sc.inputString();
		while(!characterManager.existName(characters, characterName)) {
			System.out.println("�̹� �����ϴ� ĳ���� �̸��Դϴ�. �ٽ� �Է��ϼ���");
			characterName = sc.inputString();
		}
		System.out.println("=====���� ����=====");
		String job = choiceJob();

		if (createCharater(characterName, job)) {
			characterManager.inputName(characters);
			System.out.println("ĳ���� ���� �Ϸ�");
		}
	}

	public boolean createCharater(String characterName, String job) {
		Character character = characterManager.createCharacter(characterName, job);
		characters.add(character);
		return true;
	}

	public String choiceJob() {
		System.out.println("======== ���� =======");
		System.out.println("1. �˻�\n2. �ü�\n3. ������\n4. �ڰ�");
		System.out.println("=====================");
		System.out.print("����>>");
		int choice;
		while (true) {
			choice = sc.inputNumber();
			if (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
				System.out.println("���� ��ȣ�Դϴ�.");
				System.out.print("�ٽ� �Է�>>");
			} else
				break;
		}
		if (choice == 1)
			return "�˻�";
		else if (choice == 2)
			return "�ü�";
		else if (choice == 3)
			return "������";
		else if (choice == 4)
			return "�ڰ�";
		else
			return null;
	}

	public void choiceCharacter() {
		int index = 1;
		for (Character c : characters) {
			System.out.println("=============================================");
			System.out.println(index + c.toString());
			System.out.println("=============================================");
			index++;
		}
		System.out.print("�÷��� �� ĳ���͸� �����ϼ��� : ");
		int choice = sc.inputNumber();
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
