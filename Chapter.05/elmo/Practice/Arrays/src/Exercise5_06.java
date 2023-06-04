public class Exercise5_06 {
    //최소한의 갯수로 동전 거슬러주기
    public static void main(String[] args) {
        int[] coins = {500, 100, 50, 10};
        int money = 2680;

        System.out.println("money: " + money);
        for(int i=0; i<coins.length; i++){
            System.out.println(coins[i]+"원: "+money/coins[i]);
            money %= coins[i];
        }

    }
}
