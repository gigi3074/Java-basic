import java.util.Arrays;
import java.util.Scanner;

public class Exercise5_13 {
    /* 단어의 글자위치를 섞어서 보여주고 원래의 단어를 맞추는 예제이다 실행결과와 같이 동작하도록 예제의 빈 곳을 채우시오. */
    public static void main(String[] args) {
        String[] words = { "television", "computer", "mouse", "phone" };

        for(int i=0; i<words.length; i++){
            char[] question = words[i].toCharArray();

            for(int j=0; j<question.length; j++){
                int index = (int)(Math.random() * question.length);

                char tmp = question[j];
                question[j] = question[index];
                question[index] = tmp;
            }

            System.out.printf("Q%d. %s의 정답을 입력하세요.", i+1, new String(question));
            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine();

            if(answer.trim().equals(words[i])){
                System.out.println("정답입니다.");
            }else{
                System.out.println("틀렸습니다.");
            }

        }


    }
}
