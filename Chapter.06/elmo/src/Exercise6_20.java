public class Exercise6_20 {
    public static void main(String[] args) {
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original)); //[1, 2, 3, 4, 5, 6, 7, 8, 9]

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));

        //<주의> 괄호 위치
        System.out.println((int)Math.random()*9); //0밖에 안나온다: 0<=랜덤<1 사이의 int적용되어 0밖에 안나옴
        System.out.println((int)(Math.random()*9)); //0~8의 int나옴: 0<=랜덤<9 사이
    }

    /** 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다 */
    static int[] shuffle(int[] arr){
        for(int i=0; i<arr.length; i++){
            int random = (int)(Math.random()*arr.length); //<주의> 괄호 위치
            int tmp = arr[i];
            arr[i] = arr[random];
            arr[random] = tmp;
        }
        return arr;
    }
}
