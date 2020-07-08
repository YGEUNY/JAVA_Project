package GameTest;

import java.util.HashMap;

public class SkillManager {
	private HashMap mSkillMap = new HashMap();
	
	public SkillManager() {
		
	}
	
	private void initSkills() {
		mSkillMap.put(SkillDef.CRAZY_SHOT, "Crazy Shot");
		mSkillMap.put(SkillDef.BACK_TUMBLING_SHOT, "Back Tumbling Shot");
		mSkillMap.put(SkillDef.WIND_STEAL, "Wind Steal");
		mSkillMap.put(SkillDef.SHADOW_STEP, "Shadow Step");
		mSkillMap.put(SkillDef.LUNA_BLADE, "Luna Blade");
		mSkillMap.put(SkillDef.DARK_CLOUD, "Dark Cloud");
		mSkillMap.put(SkillDef.MAGIG_GUARD, "Magic Guard");
		mSkillMap.put(SkillDef.FIRE_BALL, "Fire Ball");
		mSkillMap.put(SkillDef.HEAL, "Heal");
		mSkillMap.put(SkillDef.DARK_FORCE, "Dark Force");
	}
	
	public Skill createSkill(int skillCode, int skillLevel) {
		Object skillNameObj = mSkillMap.get(skillCode);
		if(skillNameObj == null)
			return null;
		return Skill.createSkill(skillCode, skillLevel, (String)skillNameObj);
	}
}
