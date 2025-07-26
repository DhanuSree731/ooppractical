package oop_practical;
import java.util.Scanner;
public class Ternary {
	public static void main(String[] args) {
		int febDays;
		String result;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter febDays:");
		febDays = sc.nextInt();
		result=(febDays == 28) ? "Not a Leap Year" : "Leap Year";
		System.out.println(result);
	}
}
