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

	public void inputName(String characterName) {
		characterMap.put(characterName, characterName);
	}

	public boolean existName(ArrayList<Character> characters, String name) {
		Object characterNameObj = characterMap.get(name);
		if(characterNameObj == null)
			return true;
		else
			return false;
	}

	public long getGuid() {
		currentGUID++;
		return currentGUID;
	}

	public Character createCharacter(String characterName, String job) {
		return Character.createCharacter(characterName, job, getGuid());
	}
}
