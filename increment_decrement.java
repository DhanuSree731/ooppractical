package oop_practical;
import java.util.Scanner;
public class increment_decrement {
public static void main(String[] args) {
	int a,b;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a value:");
	a = sc.nextInt();
	int result1 = ++a;
	System.out.println("After increment: " + result1);
	
	System.out.println("enter b value:");
	b = sc.nextInt();
	int result2 = --a;
	System.out.println("After decrement: " + result2);
}
}

