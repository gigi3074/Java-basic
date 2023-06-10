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

        /*
        문제 6
        1 ~ 45사이의 난수를 발생시켜 lotto배열에 담아, 번호를 생성하는 프로그램을 작성(중복숫자x)
        2중 for문, continue나 break문도 사용
        int[] lotto = new int[6];
        */
        int[] lotto = new int[6];
        loop : for (int i = 0; i < lotto.length;) {
            lotto[i] = new Random().nextInt(45)+1;
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    continue loop;
                }
            }
            i++;
        }
        System.out.println("로또번호 : " + Arrays.toString(lotto));

        /*
            문제 7
            A B C D
            E F G H
            I J K L
            다차원배열로 위와 같이 출력하기
         */
        String[][] str = new String[3][4];
        char ch = 'A';

        for (int i = 0; i < str.length; i++){
            for (int j = 0; j<str[i].length; j++){
                str[i][j] =""+ ch++;
                System.out.print(str[i][j]);
            }
            System.out.println("");
        }
        System.out.println("--------------");
        /*
            문제 8
            A B
            C D E
            F
            다차원배열로 위와 같이 출력하기
         */
        char[][] alpa = {{'A', 'B'},
                        {'C','D','E'},
                        {'F'}};
        for (int i = 0; i < alpa.length; i++){
            for (int j = 0; j<alpa[i].length; j++){
                System.out.print(alpa[i][j]);
            }
            System.out.println("");
        }

        /*
            문제 9
            배열 arr에 담긴 모든 값의 총 합과 평균을 출력하시오
            총합 : 106
            평균 : 6.63(소수점 두자리까지 표시)
            int[][] arr = { {5, 4, 3},
            {11, 6},
            {13, 9, 17, 2},
            {1, 2, 3},
            {7, 11, 9, 3} };
         */
        int[][] arr = { {5, 4, 3},
                {11, 6},
                {13, 9, 17, 2},
                {1, 2, 3},
                {7, 11, 9, 3} };
        int exArrSum = 0;
        float avr = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                exArrSum += arr[i][j];
                count++;
                avr = (float) (Math.round((float) exArrSum/count*100)/100.0);
            }
        }
        System.out.println("합계는 "+ exArrSum+ "입니다.");
        System.out.println("평균은 "+ avr+ "입니다.");
        /*
            연습문제 P22 해설 203P
            5-1
            다음은 배열을 선언하거나 초기화환 것이다. 잘못된 것을 고르고 그 이유를 설명하시오
            a. int[] arr[];
            b. int[] arr = {1,2,3,};
            c. int[] arr = new int[5];
            d. int[] arr = new int[5]{1,2,3,4,5};
            e. int arr[5];
            f. int[] arr[] = new int[3][];
         */

        /*
            문제 5-2
            다음과 같은 배열이 있을 때, arr[3].length의 값은 얼마인가?

         */

        int[][] arr1 = {
                {5, 5, 5, 5, 5},
                {10, 10, 10},
                {20, 20, 20, 20},
                {30, 30}
        };
        System.out.println(arr[3].length);

        /*
            문제 5-3
            배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.
         */

        int[] arr2 = {10, 20,30, 40, 50};
        int arrSum = 0;
        for (int i = 0; i < arr1.length;i++){
            arrSum += arr2[i];
        }
        System.out.println("sum = "+arrSum);

        /*
            문제 5-4
            2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오
         */

        int[][] arr3 ={
                {5,5,5,5,5},
                {10,10,10,10,10},
                {20,20,20,20,20},
                {30,30,30,30,30}
        };
        int total = 0;
        float average = 0;
        int count1 = 0;

        for (int i = 0; i < arr3.length;i++){
            for (int j = 0; j < arr3[i].length; j++){
                total += arr3[i][j];
                count1++;
            }
        }

        average = (float) (Math.round((float) total/count1*100)/100.0);

        System.out.println("total = "+ total);
        System.out.println("average = " + average);

        /*
            문제 5-5
            다음은 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다.
            (1)~(2)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
            [참고] Math.random()을 사용했기 때문에 실행결과와 다를 수 있다.
         */
        int[] ballArr = {1,2,3,4,5,6,7,8,9};
        int[] ball3 = new int[3];
        // 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
        for(int i = 0; i< ballArr.length;i++) {
            int j = (int)(Math.random() * ballArr.length);
            int tmp = 0;
            tmp = ballArr[i];
            ballArr[i] = ballArr[j];
            ballArr[j] = tmp;
        }
        // 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
        for(int i=0;i<ball3.length;i++) {
            ball3[i] = ballArr[i];
            System.out.print(ball3[i]);
        }


    }//main
}