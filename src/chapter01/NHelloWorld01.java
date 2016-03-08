package chapter01;

import java.util.Scanner;

public class NHelloWorld01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		int count = scanner.nextInt();

		System.out.println( count );

		int i = 0;
		while( i < count ) {
			System.out.println( "hello World");
			i = i + 1;
		}
		
		scanner.close();
	}

}
