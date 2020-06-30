package GameTest;

public class Skills {

	private String skillA, skillB, skillC;
	private int skillLevel;
	private String name;
	
	public Skills(String skillA, String skillB, String skillC, int skillLevel,String name) {
		super();
		this.skillA = skillA;
		this.skillB = skillB;
		this.skillC = skillC;
		this.skillLevel = skillLevel;
		this.name = name;
	}
	public String getSkillA() {
		return skillA;
	}
	public void setSkillA(String skillA) {
		this.skillA = skillA;
	}
	public String getSkillB() {
		return skillB;
	}
	public void setSkillB(String skillB) {
		this.skillB = skillB;
	}
	public String getSkillC() {
		return skillC;
	}
	public void setSkillC(String skillC) {
		this.skillC = skillC;
	}
	public int getSkillLevel() {
		return skillLevel;
	}
	public void setSkillLevel(int skillLevel) {
		this.skillLevel = skillLevel;
	}
	
	
}
