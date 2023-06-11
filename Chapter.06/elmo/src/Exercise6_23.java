public class Exercise6_23 {
    public static void main(String[] args) {
        int[] data = {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값: "+max(data)); //최대값: 9
        System.out.println("최대값: "+max(null));
        System.out.println("최대값: "+max(new int[] {})); //크기가 0인 배열이라는 뜻
    }

    static int max(int[] arr){
        if(arr==null || arr.length==0){
            return -999999;
        }else{
            int max = 0;
            for(int i=0; i<arr.length; i++){
                max = (arr[i]>max)? arr[i]:max;
            }
            return max;
        }
    }
}
