import java.util.Arrays;
import java.util.Random;

public class Exercise {
    public static void main(String[] args) {
       /*
            문제 1: 배열의 합 구하기
            주어진 정수형 배열에서 모든 요소의 합을 구하는 프로그램을 작성하세요.
        */
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

                for(int i = 0; i < numbers.length; i++){
                    sum += numbers[i];
                }
                System.out.println("배열의 합: " + sum);
        /*
            문제 2: 최댓값 찾기
            주어진 정수형 배열에서 가장 큰 값을 찾는 프로그램을 작성하세요.

            int[] numbers = {10, 4, 7, 2, 9};
            int max = numbers[0];
         */
                int[] numbersMax = {10, 4, 7, 2, 9};
                int max = numbers[0];

                for (int i = 1; i < numbers.length; i++) {
                    if (numbers[i] > max) {
                        max = numbers[i];
                    }
                }
                System.out.println("최댓값: " + max);
        /*
            문제 3: 배열 뒤집기
            주어진 문자열 배열을 역순으로 뒤집는 프로그램을 작성하세요.
         */
                String[] names = {"Alice", "Bob", "Charlie", "Dave"};
                String[] reversedNames = new String[names.length];

                for (int i = 0; i < names.length; i++) {
                    reversedNames[i] = names[names.length - 1 - i];
                }
                System.out.println("뒤집힌 배열: " + Arrays.toString(reversedNames));

        /*
            문제 4: 배열 복사하기
            주어진 문자열 배열을 새로운 배열로 복사하는 프로그램을 작성하세요.
         */
                String[] source = {"apple", "banana", "cherry"};
                String[] destination = new String[source.length];

                for (int i = 0; i < source.length; i++) {
                    destination[i] = source[i];
                }

                System.out.println("복사된 배열: " + Arrays.toString(destination));
        /*
        문제 5
        변수 money에 10 ~ 5000사이의 난수를 발생시켜 넣는다.
        단, 3450, 2100, 60과 같이 1의자리 숫자는 반드시 0이 되도록 한다.

        발생된 난수 money를 동전으로 바꾸면 각 동전이 몇개씩 필요한지를 판단하는 코드를 작성
        가능한한 적은 수의 동전을 사용하도록 한다.

        2590 -> 500원 : 5개, 50원 : 1개, 10원 : 4개
        for문 1개
         */

        int[] coin = {500, 100, 50, 10};
        int money = new Random().nextInt(500)+ 1;
        money *= 10;
        System.out.println("금액 : " + money);
        for (int i = 0;i < coin.length; i++){
            int res = money/coin[i];
            System.out.println(coin[i] + "원 : " + res);
            money %= coin[i];
        }
    }//main
}