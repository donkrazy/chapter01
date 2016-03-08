package chapter01;

import java.util.Arrays;

public class ArrayTest {
	int[] intArray2;
	
	public static void main(String[] args) {
		char[] c = new char[3];
		
		c[0] = 'B';
		c[1] = 'I';
		c[2] = 'T';
		
		System.out.println( c.length );
		System.out.println( c );
		
		//배열객체의 참조값
		System.out.println( System.identityHashCode( c ) );
		
		// String 참조값
		String s = new String( "hello" );
		System.out.println( s );
		System.out.println( s.hashCode() );
		System.out.println( System.identityHashCode( s ) );
		
		//배열의 선언
		int[] intArray;
		intArray = new int[10];
		int[] intArray2 = new int[20];
		
		int[] intArray3 = { 0, 1, 2, 3, 4, 5 };
//		int[] intArray4;
//		intArray4 = { 10, 20, 30, 40 };
		
		//배열 OutOfBound 예외
		try {
			intArray[10] = 10;
		} catch( ArrayIndexOutOfBoundsException ex ) {
			System.out.println( "Array Index Out of Bound Error" );
		}
		
		//Arrays 유틸리티 클래스 사용
		int[] intArray5 = { 30, 20, 15, 10, 9, 8 };
		int index = Arrays.binarySearch( intArray5, 15 );
		System.out.println( "이진 검색 결과:" + index );
		
		int[] intArray6 = { 100, 20, 1500, 20, 1, 5, 6 };
		System.out.println( Arrays.toString( intArray6 ));
		Arrays.sort( intArray6 );
		System.out.println( Arrays.toString( intArray6 ));
		
		int[] intArray7 = { 1, 5, 6, 20, 25, 100, 1500 };
		boolean b = Arrays.equals( intArray6, intArray7 );
		System.out.println( b );
		
		Arrays.fill( intArray7, -10);
		System.out.println( Arrays.toString( intArray7 ) );
		
		// 배열 복사
		int[] src = {10, 20, 30, 40, 50};
		int[] dest1 = src;  // 같은 배열 객체 참조
		int[] dest2 = new int[src.length]; // 배열 복사
		System.arraycopy(src, 0, dest2, 0, src.length);
		System.out.println( Arrays.toString( dest2 ) );
		
		// My ArrayUtil 테스트 해보기
		boolean b2 = ArrayUtil.equals( src, dest2 );
		System.out.println( b2 );
		
		int[] dest3 = ArrayUtil.concat( src, null );
		System.out.println( Arrays.toString( dest3 ) );
	}

}
