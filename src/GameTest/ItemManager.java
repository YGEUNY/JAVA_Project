package GameTest;

import java.util.HashMap;

public class ItemManager {
	private long mCurrentGUID = 100000000000000L;

	private HashMap mItemMap = new HashMap();

	public ItemManager() {
		initItems();
	}

	private void initItems() {
		mItemMap.put(ItemDef.LONG_SORD, "�ռҵ�");
		mItemMap.put(ItemDef.AXE, "����");
		mItemMap.put(ItemDef.GOLD_BOW, "Ȳ�� ��");
		mItemMap.put(ItemDef.SPEED_GUN, "������");
		mItemMap.put(ItemDef.WIND_BLADE, "�ٶ��� ��");
		mItemMap.put(ItemDef.HEALING_POIRION, "HP����");
		mItemMap.put(ItemDef.MP_POTION, "MP����");
		mItemMap.put(ItemDef.GOLD_HAIR, "�ݹ߸Ӹ�");
		mItemMap.put(ItemDef.OLD_ARMOR, "��������");
		mItemMap.put(ItemDef.BEGINNER_PANTS, "�ʽ����� ����");
		mItemMap.put(ItemDef.BEGINNER_SHOES, "�ʽ����� �Ź�");
		mItemMap.put(ItemDef.BEGINNER_GLOVES, "�ʽ����� �尩");
		mItemMap.put(ItemDef.BASIC_HAIR, "�⺻���");
		mItemMap.put(ItemDef.SHORT_SORD, "���ҵ�");
		mItemMap.put(ItemDef.HONEY_APPLE, "�ܻ��");
		mItemMap.put(ItemDef.OLD_MAGICSTICK, "����������");
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
