public class Exercise4_4 {
    public static void main(String[] args) {
        //1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이 100 이상이 되는지 구하시오
        int sum = 0;
        int num = 0;
        while(true){
            System.out.println("@num: "+ num); //num=0;
            num++; //num=1;
            System.out.println("#num: "+ num); //num=1;
            if(num%2==1) { //num=1;
                sum += num;
                System.out.println("sum: "+sum+", num: "+ num);
            }else if(num%2==0){
                sum -= num;
                System.out.println("sum: "+sum+", num: "+ num);
            }
            if(sum>=100){
                System.out.println(num+"까지 더했을때"+"sum이 "+sum+"으로 100이 넘는다");
                break;
            }
        }

    }
}
