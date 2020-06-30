package GameTest;

public class Items {
	private int itemCode;
	private int itemCount;
	private String name;
	private long guid;

	public Items(int itemCode, int itemCount, String name, long guid) {
		super();
		this.itemCode = itemCode;
		this.itemCount = itemCount;
		this.name = name;
		this.guid = guid;
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
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public long getGuid() {
		return guid;
	}

	public void setGuid(long guid) {
		this.guid = guid;
	}

	
}
