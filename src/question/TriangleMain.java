package question;

public class TriangleMain {

	public static void main(String[] args) {
		Ex14Triangle t1 = new Ex14Triangle(3, 4, 5);
		System.out.println("�ﰢ�� : A-"+t1.getLength1() + ", B-" + t1.getLength2() + ", C-" + t1.getLength3());
		System.out.println("�ѷ����� : " + t1.getWholeLength());
		System.out.println(t1.printDraw());
	}
}
