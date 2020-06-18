package question;

public class Ex14Triangle {

	private int length1 = 0;
	private int length2 = 0;
	private int length3 = 0;
	private int wholeLength = 0;
	
	public Ex14Triangle(int length1, int length2, int length3){
		this.length1 = length1;
		this.length2 = length2;
		this.length3 = length3;
	}
	
	protected String printDraw() {
		return "Draw<" + getLength1() + ", " + getLength2() + ", " + getLength3() + ">";
	}

	public int getWholeLength() {
		wholeLength = length1 + length2 + length3;
		return wholeLength;
	}

	public void setWholeLenth(int wholeLength) {
		this.wholeLength = wholeLength;
	}

	public int getLength1() {
		return length1;
	}

	public void setLength1(int length1) {
		this.length1 = length1;
	}

	public int getLength2() {
		return length2;
	}

	public void setLength2(int length2) {
		this.length2 = length2;
	}

	public int getLength3() {
		return length3;
	}

	public void setLength3(int length3) {
		this.length3 = length3;
	}
	
	
}
