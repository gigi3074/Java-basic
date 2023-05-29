public class Exercise4_15 {

    static int reverseNumber(int number){
        String str = "";
        while(number>0){
            str += number%10;
            number/=10;
        }
        return Integer.parseInt(str);
    }
    public static void main(String[] args) {
        //다음은 회문수를 구하는 프로그램이다. 회문수 (palindrome)란 숫자를 거꾸로 읽어도 앞으로 읽는 것과 같은 수를 말한다
        //예를 들면 ‘12321’이나 ‘13531’같은 수를 말한다
        //[Hint] 나머지 연산자를 이용하시오.

        int number = 12321;

//        int reverse = reverseNumber(number);
//        System.out.println("reverse: " + reverse);

        int tmpNum = number;
        int reverse = 0;

        while (tmpNum!=0){
            reverse = reverse*10 + tmpNum%10;
            tmpNum/=10;
        }
        System.out.println("#reverse: " + reverse);

        if(number == reverse) {
            System.out.println(number + " 는 회문수 입니다.");
        }else {
            System.out.println(number + " 는 회문수가 아닙니다.");
        }
    }
}
