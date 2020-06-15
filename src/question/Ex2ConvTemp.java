package question;

public class Ex2ConvTemp {
	public static void main(String[] args) {
		
		Ex2ConvTemp start = new Ex2ConvTemp();
		start.change();
	}

	public void change() {
		double c, f;
		c = 31.5;
		f = (c*9/5) + 32;
		
		print(c, f);
	}
	
	public void print(double c, double f) {
		System.out.println("¼·¾¾ : " + c);
		System.out.println("È­¾¾ : " + f);
	}
}
