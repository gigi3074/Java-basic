/*
문제 4: 동물 소리
동물 클래스와 여러 동물 서브클래스를 구현하세요.
각 동물 객체는 이름을 가지며, 동물의 소리를 출력하는 메서드를 가져야 합니다.
여러 동물 객체를 생성하고 소리를 출력하는 예제를 작성해보세요.
*/
public class Ex04 {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d.name + "는 "+d.sounds()); //강아지는 멍멍

        Cat c = new Cat();
        System.out.println(c.name + "는 "+c.sounds()); //고양이는 야옹

        Bird b = new Bird();
        System.out.println(b.name + "는 "+ b.sounds()); //새는 짹짹

    }
}
interface Animal{
    abstract String sounds();
}
class Dog implements Animal{
    String name;
    Dog(){
        name = "강아지";
    }
    @Override
    public String sounds(){
        return "멍멍";
    }
}
class Cat implements Animal{
    String name;
    Cat(){
        name = "고양이";
    }
    @Override
    public String sounds(){
        return "야옹";
    }
}
class Bird implements Animal{
    String name;
    Bird(){
        name = "새";
    }
    @Override
    public String sounds(){
        return "짹짹";
    }
}