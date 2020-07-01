package GameTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Character {
	private ArrayList<Item> items;
	private ArrayList<Skill> skills;
	
	private String characterName, job;
	private int level, hp, mp;
	private long guid;
	
	ItemManager itemManager;
	
	public Character(String characterName, String job, long guid) {
		this.characterName = characterName;
		this.guid = guid;
		this.job = job;
		this.level = 1;
		this.hp = 100;
		this.mp = 200;
		
		itemManager = new ItemManager();
		
		initItems(job);
	}

	private void initItems(String job) {
		if(job.equals("°Ë»ç"))	getItem(ItemDef.LONG_SORD, 1);
		else if(job.equals("±Ã¼ö"))	getItem(ItemDef.GOLD_BOW, 1);
		else if(job.equals("¸¶¹ý»ç"))	getItem(ItemDef.OLD_MAGICSTICK, 1);
		else if(job.equals("ÀÚ°´"))	getItem(ItemDef.WIND_BLADE, 1);
		getItem(ItemDef.HEALING_POIRION, 3);
		getItem(ItemDef.MP_POTION, 3);
		getItem(ItemDef.OLD_ARMOR, 1);
		getItem(ItemDef.BASIC_HAIR, 1);
		getItem(ItemDef.BEGINNER_PANTS, 1);
		getItem(ItemDef.BEGINNER_SHOES, 1);
		getItem(ItemDef.BEGINNER_GLOVES, 1);
	}

	public boolean getItem(int itemCode, int itemCount) {
		items.add(itemManager.createItem(itemCode, itemCount));
		return true;
	}
	
	public boolean loseItem(long guid) {
		return true;
	}
}
