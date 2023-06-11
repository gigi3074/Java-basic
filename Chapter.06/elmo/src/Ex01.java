public class Ex01 {
    //문제 1: 도형 계층 구조
    //다음과 같은 도형 계층 구조를 구현해보세요.
    //Shape (도형)
    //Circle (원)
    //Rectangle (사각형)
    //Triangle (삼각형)
    //각 도형 클래스는 넓이를 계산하는 메서드를 가져야 합니다. 또한, 도형의 특징을 출력하는 메서드를 구현해보세요.
    public static void main(String[] args) {
        Circle c = new Circle(3);
        System.out.println(c.printInfo()+"의 넓이: "+c.area()); //28.274334

        Rectangle r = new Rectangle(5,2);
        System.out.println(r.printInfo()+"의 넓이: "+r.area()); //10.0

        Triangle t = new Triangle(5,2);
        System.out.println(t.printInfo()+"의 넓이: "+t.area()); //5.0
    }
}

abstract class Shape{
    abstract float area();
    abstract String printInfo();
}
class Circle extends Shape{
    int radius;
    final double PI = Math.PI;
    Circle(int radius){
        this.radius = radius;
    }
    @Override
    public float area(){
        return (float) PI*radius*radius;
    }
    @Override
    public String printInfo(){
        return ">>원<<";
    }
}
class Rectangle extends Shape{
    int width;
    int height;
    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    @Override
    public float area(){
        return width*height;
    }
    @Override
    public String printInfo(){
        return ">>직사각형<<";
    }
}
class Triangle extends Shape{
    int width;
    int height;
    Triangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    @Override
    public float area(){
        return width*height/2f;
    }
    @Override
    public String printInfo(){
        return ">>삼각형<<";
    }
}
