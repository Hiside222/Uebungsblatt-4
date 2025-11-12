package h2;

public class H2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x, y, a, b, c = true;
		int input = 10;
		if (input == 10 || input == 11) {
			x = true;
		} else {
			x = false;
		}
		if (input == 11 || input == 1) {
			y = true;
		} else {
			y = false;
		}
		if (x == true && y == true) {
			a = true;
		} else {
			a = false;
		}
		if (x == true || x != y) {
			b = true;
		} else {
			b = false;
		}
		if ((x == true && y == false)||(x == false && y == false)) {
			c = true;
		} else {
			c = false;
		}
//		 System.out.println(x);
//		 System.out.println(y);
//		 System.out.println(a);
//		 System.out.println(b);
//		 System.out.println(c);
	}

}
