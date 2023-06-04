import java.util.Arrays;

public class Exercise5_05 {
    public static void main(String[] args) {
        int[] ballArr = {1,2,3,4,5,6,7,8,9};
        int[] ball3 = new int[3];

        //배열 ballArr내 요소들의 위치를 임의로 바꾼다
        for(int i=0; i<ballArr.length; i++){
            int j = (int)(Math.random() * ballArr.length); //인덱스 번호 담는 j (0~8)
            int tmp = 0;

            tmp = ballArr[i];
            ballArr[i] = ballArr[j];
            ballArr[j] = tmp;
        }
        System.out.println("ballArr: "+Arrays.toString(ballArr));

        //배열 ballArr 요소중 앞에 3개를 ball3으로 복사한다
        for(int i=0; i<ball3.length; i++){
            ball3[i] = ballArr[i];
        }

        System.out.println("ball3: "+Arrays.toString(ball3));

    }
}
