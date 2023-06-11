public class Exercise6_02 {
    public static void main(String[] args) {
        SutdaCard card1 = new SutdaCard(3, false);
        SutdaCard card2 = new SutdaCard();
        System.out.println(card1.info()); //3
        System.out.println(card2.info()); //1K
    }
}

class SutdaCard{
    int num;
    boolean flag;
    SutdaCard(){
        num = 1;
        flag = true;
    }
    SutdaCard(int num, boolean flag){
        this.num = num;
        this.flag = flag;
    }

    String info(){
        if(!flag){
            return num+"";
        }else{
            return num+"K";
        }
    }
}
