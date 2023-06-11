public class Exercise6_030405 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;
        System.out.println(s.name); //홍길동
        System.out.println(s.getTotal()); //236
        System.out.println(s.getAverage()); //78.7

        Student s2 = new Student("홍길동", 1, 1, 100, 60, 76);
        System.out.println(s2.info()); //홍길동, 1, 1, 100, 60, 76, 236, 78.7
    }
}
class Student{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student(){

    }
    Student(String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal(){
        return this.kor + this.eng + this.math;
    }
    /**  총점 (국어점수 +영어점수 +수학점수) 을 과목수로 나눈 평균을 구한다.소수점 둘째자리에서 반올림할 것 */
    float getAverage(){
        return Math.round(getTotal()/3f*10)/10f;
    }
    String info(){

        return this.name+", "+this.ban+", "+this.no+", "+this.kor+", "+this.eng+", "+this.math+", "+getTotal()+", "+getAverage();
    }
}