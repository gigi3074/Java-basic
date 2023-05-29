package chapter4;

import java.util.Iterator;

public class For_3 {
	public static void main(String[] args) {
		int sum = 0;
		int total = 0;
		for (int i = 1; i < 11; i++) {
			sum = sum + i;
			total = total+sum;
		}
		System.out.println(total);
	}
}
