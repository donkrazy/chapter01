package chapter01;

public class TypeCast {

	public static void main(String[] args) {
		char c = 'A';
		// explicity casting
		byte b = (byte)c;
		
		// implicity casting
		int i = c;
		
		byte b1 = 127;
		byte b2 = (byte)128;
		
		int i1 = 2147483647;
		int i2 = (int)2147483648L;
		
		float f = 3.14f;
		
		long l = 10L;
		float f1 = l;
		
	}

}
