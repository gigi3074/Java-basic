import java.util.Arrays;

public class Exercise5_09 {
    /* 주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램을 완성하시오 */
    public static void main(String[] args) {
        char[][] star = {       //4행 5열
                {'＊', '＊', '　', '　', '　'},
                {'＊', '＊', '　', '　', '　'},
                {'＊', '＊', '＊', '＊', '＊'},
                {'＊', '＊', '＊', '＊', '＊'}
        };
        for(int i=0; i<star.length; i++){
            for(int j=0; j<star[i].length; j++){
                System.out.print(star[i][j]);
            }
            System.out.println();
        }

        System.out.println("-------------------------------------");

        //5행 4열
        char[][] result = new char[star[0].length][star.length];

        for(int i=0, column=0; i<result.length; i++){
            for(int j=0, row=3; j<result[i].length; j++){ //row = star.length-1;
                result[i][j] = star[row][column];
                row--;
            }
            column++;
        }
        for(int i=0; i<result.length; i++){
            for(int j=0; j<result[i].length; j++){
                System.out.print(result[i][j]);
            }
            System.out.println();
        }


    }
}
