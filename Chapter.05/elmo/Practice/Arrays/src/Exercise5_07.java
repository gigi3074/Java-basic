import java.util.Scanner;
public class Exercise5_07 {
    /*
    문제 5_06에 동전의 개수를 추가한 프로그램이다 커맨드라인으로부터 거슬러 줄 금액을 입력받아 계산한다
    보유한 동전의 개수로 거스름돈을 지불할 수 없으면, ‘거스름 돈이 부족합니다.’라고 출력하고 종료한다
    지불할 돈이 충분히 있으면 거스름돈을 지불한 만큼 가진 돈에서 빼고 남은 동전의 개수를 화면에 출력한다
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("money를 입력하세요 =>");
        int money = sc.nextInt();
        System.out.println("money: "+ money);

        int[] coins = {500, 100, 50, 10};
        int[] coin = {5, 5, 5, 5}; //동전의 갯수

        for(int i=0; i<coins.length; i++){
            int coinNum = money/coins[i];
            if(coinNum>coin[i]){
                money -= coins[i]*coin[i];
                coin[i] = 0;
            }else {
                money %= coins[i];
                coin[i] -= coinNum;
            }
//            System.out.println(coins[i]+"원 동전의 남은 갯수: "+coin[i]);
//            System.out.println("money: "+money+"원------------------");
        }

        for(int i=0; i<coins.length; i++){
            System.out.println(coins[i]+"원 동전의 남은 갯수: "+coin[i]);
        }

        if(money>0){
            System.out.println("거스름돈이 부족합니다.");
        }

    }
}
