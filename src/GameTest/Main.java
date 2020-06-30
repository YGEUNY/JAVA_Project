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
		while(!existName(characterName)) {
			
		}
		String job = sc.next();
		int level = 1;
		Character chracter = new Character()
	}
	
	public boolean existName(String characterName){
		for(Character c : CharacterList) {
			if(characterName.equals(c.getCharacterName())) {
				System.out.println("이미 존재하는 이름입니다.");
				return false;
			}
		}
		
		return true;
	}
	
	public void choiceCharacter() {
		System.out.print("플레이 할 캐릭터를 선택하세요 : ");
		String name = sc.next();
		
		for(Character c : CharacterList) {
			if(name.equals(c.characterName)); 
		}
	}
	
	
	public void settingItems() {
		int hp = 0, mp = 0, hair = 0, shoose = 0;
		System.out.print("아이템 설정할 캐릭터 이름 : ");
		String name = sc.next();
		for(Character c : CharacterList) {
			if(name.equals(c.characterName)) {
				hp = sc.nextInt();
				mp = sc.nextInt();
				hair = sc.nextInt();
				shoose = sc.nextInt();
				Items item = new Items();
				Item.add(item);
			}
		}
		
	}
	
	public void showItems() {
		
		for(Items i : Item) {
			
		}
		
	}
	
}
