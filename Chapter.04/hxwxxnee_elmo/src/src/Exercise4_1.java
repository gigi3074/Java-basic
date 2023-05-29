public class Exercise4_1 {
    public static void main(String[] args) {
//        [4-1] 다음의 문장들을 조건식으로 표현하라.
//        1. int형 변수 x가  10 보다 크고 20 보다 작을 때 true인 조건식
            int x = 0;
            if(x<10 && x>10){}
//        2. char 형 변수 ch가 공백이나 탭이 아닐 때  true 인 조건식
            char ch = ' ';
            if(!(ch==' ' || ch=='\t'))
//        3. char형 변수ch가 ‘x'또는 ’X' 일 때 true인 조건식
            if(ch=='x' || ch=='X'){}
            if(ch==120 || ch==88){}
//        4. char형 ch변수 가 숫자(‘0’~‘9’)일 때 true인 조건식
            if('0'<=ch && ch<='9'){}
//        5. char형 변수ch가 영문자(대문자 또는 소문자) 일 때 true인 조건식
            if('A'<=ch && ch<='Z' || 'a'<=ch && ch<='z'){}
//        6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을 때 true인 조건식
            int year = 0;
            if(year%400==0 || (year%4==0 && !(year%100==0))){}
//        7. boolean형 변수 powerOn가 false일 때 true인 조건식
            boolean powerOn = false;
            if(!powerOn){}
//        8. 문자열 참조변수 str이 "yes"일 때 true인 조건식
            String str = "";
            if(str.equals("yes")){}


    }


}