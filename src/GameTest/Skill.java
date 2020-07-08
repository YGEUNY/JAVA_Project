package GameTest;

public class Skill {

	private int skillCode;
	private int skillLevel;
	private String name;
	
	public Skill(int skillCode, int skillLevel, String name) {
		this.skillCode = skillCode;
		this.skillLevel = skillLevel;
		this.name = name;
	}
	
	public static Skill createSkill(int skillCode, int skillLevel, String name) {
		return new Skill(skillCode, skillLevel, name);
	}
}
