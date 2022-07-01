package Day1;

import java.util.Scanner;

public class IntegerSum {
	
	public static void main(String[] args) {
		int Sum = 0;
		System.out.println("Enter first Number ");
		Scanner x = new Scanner(System.in);
		int a = x.nextInt();
		System.out.println("Enter Second Number ");
		Scanner y = new Scanner(System.in);
		int b = y.nextInt();
		Sum= a+b;
		System.out.println("Sum = " +Sum);
		
		}

}
