package GameTest;

import java.util.HashMap;

public class ItemManager {
	private long mCurrentGUID = 100000000000000L;

	private HashMap mItemMap = new HashMap();

	public ItemManager() {
		initItems();
	}

	private void initItems() {
		mItemMap.put(ItemDef.LONG_SORD, "롱소드");
		mItemMap.put(ItemDef.AXE, "도끼");
		mItemMap.put(ItemDef.GOLD_BOW, "황금 궁");
		mItemMap.put(ItemDef.SPEED_GUN, "섬광총");
		mItemMap.put(ItemDef.WIND_BLADE, "바람의 검");
		mItemMap.put(ItemDef.HEALING_POIRION, "HP포션");
		mItemMap.put(ItemDef.MP_POTION, "MP포션");
		mItemMap.put(ItemDef.GOLD_HAIR, "금발머리");
		mItemMap.put(ItemDef.OLD_ARMOR, "낡은갑옷");
		mItemMap.put(ItemDef.BEGINNER_PANTS, "초심자의 바지");
		mItemMap.put(ItemDef.BEGINNER_SHOES, "초심자의 신발");
		mItemMap.put(ItemDef.BEGINNER_GLOVES, "초심자의 장갑");
		mItemMap.put(ItemDef.BASIC_HAIR, "기본헤어");
		mItemMap.put(ItemDef.SHORT_SORD, "숏소드");
		mItemMap.put(ItemDef.HONEY_APPLE, "꿀사과");
		mItemMap.put(ItemDef.OLD_MAGICSTICK, "낡은지팡이");
	}

	private long getGuid() {
		mCurrentGUID++;
		return mCurrentGUID;
	}

	public Item createItem(int itemCode, int itemCount) {
		Object itemNameObj = mItemMap.get(itemCode);
		if(itemNameObj == null) 
			return null;
		return Item.createItem((String)itemNameObj, itemCode, getGuid(), itemCount);
	}
}
