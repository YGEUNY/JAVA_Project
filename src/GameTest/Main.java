package GameTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private ArrayList<Items> Item;
	private ArrayList<Skills> Skill;
	Scanner sc =  new Scanner(System.in);
	private ArrayList<Character> CharacterList;
	
	public static void main(String[] args) {
		
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
		String job = sc.next();
		int level = 1;
		int hp = 100;
		int mp = 200;
		if(existName(characterName, job, level, hp, mp))
			System.out.println("캐릭터 생성");
		else
			System.out.println("이미 존재하는 캐릭터 이름입니다.");
	}
	
	public boolean existName(String characterName, String job, int level, int hp, int mp){
		for(Character c : CharacterList) {
			if(characterName.equals(c.getCharacterName())) {
				return false;
			}
		}
		Character character = new Character(characterName, job, level, hp, mp);
		CharacterList.add(character);
		return true;
	}
	
	public void choiceCharacter() {
		System.out.print("플레이 할 캐릭터를 선택하세요 : ");
		String name = sc.next();
		
		for(Character c : CharacterList) {
			
		}
	}
	
	
	public void settingItems() {
		int hp = 0, mp = 0, hair = 0, shoose = 0;
		System.out.print("아이템 설정할 캐릭터 이름 : ");
		String name = sc.next();
		for(Character c : CharacterList) {
			
			}
		}
		
	
	public void showItems() {
		
		for(Items i : Item) {
			
		}
		
	}
	
}
