package GameTest;

public class Skills {

	private String skillCode;
	private int skillLevel;
	private String name;
	
	public Skills(String skillCode, int skillLevel, String name) {
		super();
		this.skillCode = skillCode;
		this.skillLevel = skillLevel;
		this.name = name;
	}
	public String getSkillCode() {
		return skillCode;
	}
	public void setSkillCode(String skillCode) {
		this.skillCode = skillCode;
	}
	public int getSkillLevel() {
		return skillLevel;
	}
	public void setSkillLevel(int skillLevel) {
		this.skillLevel = skillLevel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}
