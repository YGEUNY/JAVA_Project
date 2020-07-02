package GameTest;

import java.util.ArrayList;

public class World {
	// 캐릭터이름 중복 체크
	// 캐릭터 guid를 관리하는 캐릭터 ghidManager만들기
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
			System.out.println("1. 캐릭터 생성\n2. 캐릭터 선택\n3. 게임 종료");
			System.out.println("=====================");
			int choice = sc.inputNumber();
			if (choice == 1)
				makeCharacter();
			else if (choice == 2)
				choiceCharacter();
			else if (choice == 3)
				break;
		}
		System.out.println("게임 종료");
	}

	public void makeCharacter() {
		System.out.print("캐릭터 이름 입력>>");
		String characterName = sc.inputString();
		while(!characterManager.existName(characters, characterName)) {
			System.out.println("이미 존재하는 캐릭터 이름입니다. 다시 입력하세요");
			characterName = sc.inputString();
		}
		System.out.println("=====직업 선택=====");
		String job = choiceJob();

		if (createCharater(characterName, job)) {
			characterManager.inputName(characters);
			System.out.println("캐릭터 생성 완료");
		}
	}

	public boolean createCharater(String characterName, String job) {
		Character character = characterManager.createCharacter(characterName, job);
		characters.add(character);
		return true;
	}

	public String choiceJob() {
		System.out.println("======== 직업 =======");
		System.out.println("1. 검사\n2. 궁수\n3. 마법사\n4. 자객");
		System.out.println("=====================");
		System.out.print("선택>>");
		int choice;
		while (true) {
			choice = sc.inputNumber();
			if (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
				System.out.println("없는 번호입니다.");
				System.out.print("다시 입력>>");
			} else
				break;
		}
		if (choice == 1)
			return "검사";
		else if (choice == 2)
			return "궁수";
		else if (choice == 3)
			return "마법사";
		else if (choice == 4)
			return "자객";
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
		System.out.print("플레이 할 캐릭터를 선택하세요 : ");
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
//			System.out.println("존재하지 않는 캐릭터 목록입니다.");
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
