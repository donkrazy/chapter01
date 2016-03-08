package chapter01;

import java.util.Scanner;

public class NHelloWorld02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		int count = scanner.nextInt();

		System.out.println( count );

		
		for(int i = 0; i < count; i = i + 1 ) {
			System.out.println( "hello World");
		}
		
		scanner.close();		
	}
}
