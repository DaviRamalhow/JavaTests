package curso;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int x;
		 x = sc.nextInt();
		 System.out.println("Voce digitou: " + x);
		 sc.close();
		 
		// TODO Auto-generated method stub
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f %n", product1, price1);
		System.out.printf("%s, which price is $ %.2f %n", product2, price2);
		System.out.printf("Record: %d years old, code %d and gender: %c %n", age, code, gender);
		System.out.printf("Measure with eight decimal places: %.8f", measure);
		System.out.printf("Rounded (three decimal places: %.3f", measure);
		

	}

}