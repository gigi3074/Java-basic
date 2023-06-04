public class Exercise5_04 {

    public static void main(String[] args) {
        int[][] arr = {{5,5,5,5,5},
                        {10,10,10,10,10},
                        {20,20,20,20,20},
                        {30,30,30,30,30}};
        int sum = 0;
        float avg = 0;
        int cnt = 0;

        for (int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                sum += arr[i][j];
                cnt++;
            }
        }
        avg = (float)sum/cnt;

        System.out.println("sum: "+sum);
        System.out.println("avg: "+avg);
    }

}
