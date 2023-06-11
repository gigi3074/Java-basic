public class Ex00 {
    //빵을 만들었습니다 <—— method 1을 호출해서 나온 결과
    //————————
    //빵을 만들었습니다<—— method 2를 호출해서 나온 결과
    //빵을 만들었습니다
    //요청하신 2개의 빵을 만들었습니다
    //————————
    //크림빵을 만들었습니다<—— method 3을 호출해서 나온 결과
    //크림빵을 만들었습니다
    //요청하신 2개의 빵을 만들었습니다
    public static void main(String[] args) {
        method1();
        System.out.println("————————");
        method1();
        method2();
        System.out.println("————————");
        method3();
        method2();
    }
    static void method1(){
        System.out.println("빵을 만들었습니다.");
    }
    static void method2(){
        System.out.println("요청하신 2개의 빵을 만들었습니다.");
    }
    static void method3(){
        System.out.println("크림빵을 만들었습니다.");
    }
}
