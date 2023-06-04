public class Exercise5_10 {
    public static void main(String[] args) {
        //다음은 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램이다
        char[] abcCode =
                { '`','~','!','@','#','$','%','^','&','*',
                        '(',')','-','_','+','=','|','[',']','{',
                        '}',';',':',',','.','/'};

                        // 0 1 2 3 4 5 6 7 8 9
        char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};

        String src = "abc123";
        String result = "";

        //문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환후 result에 저장
        for(int i=0; i<src.length(); i++){
            char c = src.charAt(i);
            if('a'<=c && c<='z'){
//                result += abcCode[c-97]; //아스키코드 알파벳 소문자 97~122
                result += abcCode[c-'a'];
            }else if('0'<=c && c<='9'){
//                result += numCode[c-48]; //숫자 48~57
                result += numCode[c-'0'];
            }
        }
        System.out.println("src: " + src);
        System.out.println("result: " + result);


    }
}
