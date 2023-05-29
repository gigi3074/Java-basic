package chapter4;

public class For_8 {
	public static void main(String[] args) {
		for (int x = 0; x <= 10; x++) {
			for (int y = 0; y <= 10; y++) {
				if (2*x+4*y == 10) {
					System.out.println("x: "+ x +", y: "+ y);
				}
			}
		}
	}
}
