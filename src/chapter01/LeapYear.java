package chapter01;

public class LeapYear {

	public static void main(String[] args) {
		int year = 2016;
		
		if( year % 4 == 0 ) {
			System.out.println( "윤년");
		} else {
			System.out.println( "윤년아님");
		}
	}

}
