package oop_practical;
import java.util.Scanner;
public class Assignment {
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a:");
		a = sc.nextInt();
//		System.out.println("enter b:");
//		b = sc.nextInt();
		b = a;
		System.out.println("b using =: " +b);
		b +=a;
		System.out.println("b using =: " +b);
		b *=a;
		System.out.println("b using =: " +b);
	}
}
