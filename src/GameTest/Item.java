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

	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getGuid() {
		guid++;
		return guid;
	}

	public void setGuid(long guid) {
		this.guid = guid;
	}
}
