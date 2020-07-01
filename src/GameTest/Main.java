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
			System.out.println("1. 캐릭터 생성\n2. 캐릭터 선택\n3. 게임 종료");
			System.out.println("=====================");
			int choice = sc.nextInt();
			if(choice==1)	makeCharacter();
			else if(choice==2)	choiceCharacter();
			else if(choice == 3) break;
		}
		System.out.println("게임 종료");
	}
	
	public void makeCharacter() {
		String characterName = sc.next();
		while(!existName(characterName)) {
			System.out.println("이미 존재하는 캐릭터 이름입니다. 다시 입력하세요");
			characterName = sc.next();
		}			
		String job = choiceJob();
		
		guid++;
		Character character = new Character(characterName, job,guid);
		characters.add(character);
		System.out.println("캐릭터 생성 완료");
		
	}
	
	public boolean existName(String characterName){
		for(Character c : characters) {
			if(characterName.equals(c.getCharacterName())) 
				return false;
		}
		return true;
	}
	
	public String choiceJob(){
		System.out.println("======== 직업 =======");
		System.out.println("1. 검사\n2. 궁수\n3. 마법사\n4. 자객");
		System.out.println("=====================");
		int choice;
		while(true) {
			 choice = sc.nextInt();
			if(choice != 1 && choice !=2 && choice !=3 && choice!=4) {
				System.out.println("없는 번호입니다.");
			}
			else
				break;
		}
		if(choice == 1) 
			return "검사";
		else if(choice == 2)
			return "궁수";
		else if(choice == 3)
			return "마법사";
		else if(choice == 4)
			return "자객";
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
		System.out.print("플레이 할 캐릭터를 선택하세요 : ");
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
