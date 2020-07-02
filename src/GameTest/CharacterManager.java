package GameTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class CharacterManager {
	private long currentGUID = 100000000000000L;

	private HashMap<String, String> characterMap = new HashMap<>();

//	public CharacterManager() {
//		
//	}

	public void inputName(ArrayList<Character> characters) {
		for (Character c : characters)
			characterMap.put(c.getCharacterName(), c.getCharacterName());
	}

	public boolean existName(ArrayList<Character> characters, String name) {
//		for(String key : characterMap.keySet()) {
//			if(key.equals(name))
//				return false;
//		}
//		return true;

		for (Character c : characters) {
			if (name.equals(c.getCharacterName()))
				return false;
		}
		return true;
	}

	public long getGuid() {
		currentGUID++;
		return currentGUID;
	}

	public Character createCharacter(String characterName, String job) {
		return Character.createCharacter(characterName, job, getGuid());
	}
}
