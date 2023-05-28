import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        /*
            중복으로 풀어야되는 문제도 있기에
            네이밍 누구나 알 수 있게 구현 및
            함수화 처리해서 중복 없애는 방식으로 구현해보기
         */
        // 예제 4-1
        int x = 0;
        System.out.printf("x=%d 일 때, 참인 것은%n", x);
        if (x==0) System.out.println("x==0");
        if (x!=0) System.out.println("x!=0");
        if (!(x==0)) System.out.println("!(x==0)");
        if (!(x!=0)) System.out.println("!(x!=0)");

        x=1;
        System.out.printf("x=%d 일 때, 참인 것은%n", x);
        if (x==0) System.out.println("x==0");
        if (x!=0) System.out.println("x!=0");
        if (!(x==0)) System.out.println("!(x==0)");
        if (!(x!=0)) System.out.println("!(x!=0)");

        // 예제 4-2
        int input;
        System.out.println("숫자를 하나 입력하세요.>");
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
        input = Integer.parseInt(tmp); // 입력받은 문자열(tmp)을 숫자로 변환

        if(input==0){
            System.out.println("입력하신 숫자는 0 입니다.");
        }
        if(input!=0){
            System.out.println("입력하신 숫자는 0이 아닙니다.");
            System.out.printf("입력하신 숫자는 %d입니다.",input);
        }// main
    }
}