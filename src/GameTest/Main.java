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
		String job = sc.next();
		int level = 1;
		int hp = 100;
		int mp = 200;
		if(existName(characterName, job, level, hp, mp))
			System.out.println("ĳ���� ����");
		else
			System.out.println("�̹� �����ϴ� ĳ���� �̸��Դϴ�.");
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
		System.out.print("�÷��� �� ĳ���͸� �����ϼ��� : ");
		String name = sc.next();
		
		for(Character c : CharacterList) {
			
		}
	}
	
	
	public void settingItems() {
		int hp = 0, mp = 0, hair = 0, shoose = 0;
		System.out.print("������ ������ ĳ���� �̸� : ");
		String name = sc.next();
		for(Character c : CharacterList) {
			
			}
		}
		
	
	public void showItems() {
		
		for(Items i : Item) {
			
		}
		
	}
	
}
