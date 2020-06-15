package question;

public class Ex10str {
	
	public static void main(String[] args) {
		
		String str = "Hello, World";
		String outStr = "";
		
		changeAlphabet(str, outStr);
		
		
	}
	
	public static void changeAlphabet(String str, String outStr) {
		
		char al =' ';
		
		for(int i=0; i < str.length(); i++) {
			al = str.charAt(i);
			if(65 <= al && al<=90)
				outStr += String.valueOf(al).toLowerCase();
			else if(al >= 97 && al <= 122)
				outStr += String.valueOf(al).toUpperCase();
			else
				outStr += al;
		}		
		
		System.out.println(str);
		System.out.println(outStr);
	}

}
