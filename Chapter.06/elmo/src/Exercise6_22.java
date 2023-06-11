public class Exercise6_22 {
    public static void main(String[] args) {
        String str = "123";
        System.out.println(str+"는 숫자입니까? "+isNumber(str)); //true

        str = "1234o";
        System.out.println(str+"는 숫자입니까? "+isNumber(str)); //false
    }

    static boolean isNumber(String str){
        boolean flag = false;

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if('0'<=c && c<='9'){
                flag = true;
            }else{
                flag = false;
                break;
            }
        }

        return flag;
    }
}
