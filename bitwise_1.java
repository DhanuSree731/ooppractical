package oop_practical;
import java.util.Scanner;
public class bitwise_1 {
public static void main(String[] args) {
	int a,b,c;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a:");
	a = sc.nextInt();
	System.out.println("enter b:");
	b = sc.nextInt();
	c=a & b;
	System.out.println("a & b =" + c);
	c=a | b;
	System.out.println("a | b =" + c);
	c=a ^ b;
	System.out.println("a ^ b =" + c);
	c= ~a;
	System.out.println("a =" + c);
	c= a >> 2;
	System.out.println("a =" + c);
	c=a << 2;
	System.out.println("a =" + c);
	c=a>>> 2;
	System.out.println("a =" + c);

}
}
