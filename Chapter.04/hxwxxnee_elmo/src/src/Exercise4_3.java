public class Exercise4_3 {
    public static void main(String[] arg){
        //1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) 의 결과를 계산하시오
        int result = 0;
        for(int i=1; i<=10; i++){
            int sum = 0;
            for(int j=1; j<=i; j++){
                sum += j;
            }
            result += sum;
        }
        System.out.println("result: " + result);
    }
}
