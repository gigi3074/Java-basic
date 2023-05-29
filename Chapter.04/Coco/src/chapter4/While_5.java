package chapter4;

public class While_5 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while(sum <=100) {
			
			if (i%2==0) {
				sum = sum+ -i;
			}else {
				sum = sum+ i;
			}
			i++;
		}
		System.out.println(i);
	}
}
