package p2;

public class P2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3, b = 5, c = 6;
		int intResult;
		double x = 1.5, y = 2.3;
		double doubleResult;

		intResult = c - a * 3; 	// -3 int
		intResult = c / b; 		// 1 int
		intResult = a + b / c; 	// 3 int

		doubleResult = c / b; 		// 1 int
		doubleResult = c + a / b; 	// 6 int
		doubleResult = x + y * b; 	// 13 double

		// Korrekt (d) & (e)
		doubleResult = (double) c / b; 		// 1.2
		doubleResult = c + (double) a / b;	// 6.6
		
	}

}
