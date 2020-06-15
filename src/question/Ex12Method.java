package question;

import java.util.Arrays;
import java.util.Scanner;

public class Ex12Method {
	
	public static void main(String[] args) {
		Ex12Method meth = new Ex12Method();
		meth.loop();
	}
	
	public void loop() {
		int[] arr = new int[5];
		int i=0;
		char ch = 'A';
		while(i<2) {
			System.out.print("임의의 정수 5개 입력 : ");
			
			scanArr(arr);
			
			System.out.print(ch + ": " + Arrays.toString(arr));			
			System.out.println("\nSum<" + ch + "> = " + sumAll(arr));
			
			i++;
			ch++;
		}
		System.out.println("끝!!");
		
	}
	
	public int[] scanArr(int[] arr) {
		Scanner  sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) 
			arr[i] = sc.nextInt();
		
		return arr;
	}
	
	public int sumAll(int[] arr) {
		int sum = 0;
		
		for(int num: arr) 
			sum += num;
		
		return sum;
	}

}
