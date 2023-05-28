import java.util.Scanner;

public class Exercise4_14 {
    public static void main(String[] args) {
        //다음은 숫자맞추기 게임을 작성한 것이다. 1과 100사이의 값을 반복적으로 입력해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다
        //사용자가 값을 입력하면 컴퓨터는 자신이 생각한 값과 비교해서 결과를 알려준다
        //사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고, 몇 번 만에 숫자를 맞췄는지 알려준다

        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(true){
            System.out.println("1과 100사이의 숫자를 입력하세요 =>");
            int user = sc.nextInt();
            int com = (int)(Math.random()*100)+1;

            if(user == com){
                count++;
                System.out.println("입력한 값 "+user+"와 컴퓨터의 값이 일치합니다!");
                System.out.println(count+"회 만에 일치!");
                break;
            }else {
                count++;
                System.out.println("입력한 값 "+user+"와 컴퓨터의 값 "+com+"이 일치하지 않습니다!");
            }

        }

    }
}
