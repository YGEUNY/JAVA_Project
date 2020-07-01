package GameTest;

public class Item {
	private int itemCode;
	private int itemCount;
	private String name;
	private long guid;

	public Item(String name, int itemCode, long guid, int itemCount) {
		this.name = name;
		this.itemCode = itemCode;		
		this.guid = guid;
		this.itemCount = itemCount;
	}
	
	public static Item createItem(String name, int itemCode, long guid, int itemCount) {
		return new Item(name, itemCode, guid, itemCount);
	}

}
