package question;

public class CaesarCode {
	
	public String code(String str, String outStr) {
		char c = ' ';
		
		for(int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if(Character.isLowerCase(c))
				c = (char) ((c + 3 % 26 -'a') % 26 + 'a');
			else if(Character.isUpperCase(c))
				c = (char) ((c + 3 % 26 - 'A')% 26 + 'A');
			outStr += c;
		}
		
		return outStr;
	}
}
