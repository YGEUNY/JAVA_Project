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
		while(!existName(characterName)) {
			
		}
		String job = sc.next();
		int level = 1;
		Character chracter = new Character()
	}
	
	public boolean existName(String characterName){
		for(Character c : CharacterList) {
			if(characterName.equals(c.getCharacterName())) {
				System.out.println("�̹� �����ϴ� �̸��Դϴ�.");
				return false;
			}
		}
		
		return true;
	}
	
	public void choiceCharacter() {
		System.out.print("�÷��� �� ĳ���͸� �����ϼ��� : ");
		String name = sc.next();
		
		for(Character c : CharacterList) {
			if(name.equals(c.characterName)); 
		}
	}
	
	
	public void settingItems() {
		int hp = 0, mp = 0, hair = 0, shoose = 0;
		System.out.print("������ ������ ĳ���� �̸� : ");
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
