public class Exercise6_0607 {
    public static void main(String[] args) {
        System.out.println(getDistance(1,1,2,2)); //1.4142135623730951

        MyPoint my = new MyPoint(1,1);
        System.out.println(my.getDistance(2,2)); //1.4142135623730951

    }
    static double getDistance(int x1, int y1, int x2, int y2){

        return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    }
}
class MyPoint{
    int x;
    int y;
    MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    double getDistance(int x2, int y2){

        return Math.sqrt((x2-this.x)*(x2-this.x) + (y2-this.y)*(y2-this.y));
    }

}
