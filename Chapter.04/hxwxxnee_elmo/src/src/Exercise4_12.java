public class Exercise4_12 {
    public static void main(String[] args) {
        //구구단의 일부분을 다음과 같이 출력하시오
//        for(int i=2; i<=9; i++){
//            for(int j=1; j<=3; j++){
//                System.out.println(i+"*"+j+"="+i*j);
//            }
//            System.out.println();
//        }
//        for (int i = 1; i < 4; i++) {
//            for (int j = 2; j < 10; j++) {
//                System.out.print(j+"*"+i+"="+i*j+"\t");
//            }
//            System.out.println();
//        }

        for(int i=2; i<9; i+=3){
            for(int j=1; j<4; j++){
                for(int k=0; k<3; k++){
                    if(i+k < 10){
                        System.out.print(i+k+"*"+j+"="+((i+k)*j)+"\t");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
