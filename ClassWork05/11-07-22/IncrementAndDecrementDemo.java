package basicprograms;

public class IncrementAndDecrementDemo {
	public static void main(String[] args) {
		int x = 10, y;
		y = --x;
		System.out.println("x val: " + x);
		System.out.println("y val: " + y);

		// bitwise And operation
//		int a = 31, b = 16, z;
//		z = a & b;
//		System.out.println(z);

		// bitwise OR operation
		int m = 20, n = 24, p;
		p = m | n;
		System.out.println(p);

		// Ternary operation
		int a= 100, b= 20, max;
		/*
		 * if(a>b) System.out.println(a+"is greater"); else
		 * System.out.println(b+"is greater");
		 */

		max = (a > b) ? a : b; // 100>20
		System.out.println(max + " is greater");
		
	}
}
