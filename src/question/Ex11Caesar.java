package question;

public class Ex11Caesar {
		/////////// ���� ��ġ�� 3�� �о ����� ���� ��ȣ ���� /////////////
	public static void main(String[] args) {	
		Ex11Caesar start = new Ex11Caesar();
		start.print();
	}
	
	public void print() {
		CaesarCode cae = new CaesarCode();
		
		String str = "Hello World";
		String outStr = "";
		
		System.out.println("���� : " + str);
		System.out.println("��ȣ : " + 	cae.code(str, outStr));
	}
}





//for(int i = 0; i < str.length(); i++) {
//	c = str.charAt(i);
//	if(Character.isLowerCase(c)) {
//		if(c + 3 > 90)
//			c -= 23;
//		else
//			c += 3;
//	}
//	else if(Character.isUpperCase(c)) {
//		if(c + 3 >122)
//			c -= 23;
//		else
//			c += 3;
//	}
//	outStr += c;
//}