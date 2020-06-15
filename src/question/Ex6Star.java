package question;

import java.util.Scanner;

public class Ex6Star {
	
	public static void main(String[] args) {
		
		int num =0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter line number : " );
		num=sc.nextInt();
		
		for(int i = 0; i < num; i++) {
            for(int j = 0; j <= i; j++) {
            	System.out.print("*");
            }
            System.out.println();
		}
	}

}
