package GameTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Character {
	private String characterName, job;
	private int level, hp, mp;
	private long guid;
	
	public Character(String characterName, String job, int level, int hp, int mp, long guid) {
		super();
		this.characterName = characterName;
		this.job = job;
		this.level = level;
		this.hp = hp;
		this.mp = mp;
		this.guid = guid;
	}

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public long getGuid() {
		return guid;
	}

	public void setGuid(long guid) {
		this.guid = guid;
	}

	@Override
	public String toString() {
		return "Character [characterName=" + characterName + ", job=" + job + ", level=" + level + ", hp=" + hp
				+ ", mp=" + mp + ", guid=" + guid + "]";
	}
}
