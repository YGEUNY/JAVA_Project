package question;

public class Ex11Caesar {
		/////////// 문자 위치를 3씩 밀어서 만드는 시저 암호 구현 /////////////
	public static void main(String[] args) {	
		Ex11Caesar start = new Ex11Caesar();
		start.print();
	}
	
	public void print() {
		CaesarCode cae = new CaesarCode();
		
		String str = "Hello World";
		String outStr = "";
		
		System.out.println("원문 : " + str);
		System.out.println("암호 : " + 	cae.code(str, outStr));
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