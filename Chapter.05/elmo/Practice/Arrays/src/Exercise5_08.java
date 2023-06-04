import java.util.Arrays;

public class Exercise5_08 {
    /*
    다음은 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 ‘*’을 찍어서 그래프를 그리는 프로그램이다
    */
    public static void main(String[] args) {
        int[] answer = {1,4,4,3,1,4,4,2,1,3,2}; //counter에서의 n번째 요소를 의미하는 데이터를 담고있음
        int[] counter = new int[4]; //[0, 0, 0, 0]

        for(int a: answer){
            counter[a-1]++;
        }
        System.out.println(Arrays.toString(counter)); //[3, 2, 2, 4]

        for(int i=0; i<counter.length; i++){
            System.out.print(counter[i]);
            for (int j=0; j<counter[i]; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
