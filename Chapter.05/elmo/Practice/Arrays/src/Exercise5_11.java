public class Exercise5_11 {
    /* 주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서 배열의 행과 열의 마지막 요소에
    각 열과 행의 총합을 저장하고 출력하는 프로그램이다.  */
    public static void main(String[] args) {
        int[][] score = {
                {100,100,100},
                {20,20,20},
                {30,30,30},
                {40,40,40},
                {50,50,50}
        };
        int[][] result = new int[score.length+1][score[0].length+1];

        //score만큼을 돌아야지 indexException발생안함
        for(int i=0; i<score.length; i++){
            int rowSum = 0;
            for(int j=0; j<score[i].length; j++){
                result[i][j] = score[i][j];

                //row
                result[i][result[i].length-1] += score[i][j];
                //column
                result[result.length-1][j] += score[i][j];
                //total
                result[result.length-1][result[i].length-1] += score[i][j];
            }
        }

        for(int i=0; i<result.length; i++) {
            for(int j=0; j<result[i].length; j++) {
                System.out.printf("%5d", result[i][j]);
            }
            System.out.println();
        }


    }
}
