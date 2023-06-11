public class Exercise6_19 {
    public static void change(String str){
        str += "456";
    }
    public static void main(String[] args) {
        String str = "ABC123";
        System.out.println(str); //ABC123

        change(str);
        System.out.println(str); //<주의> ABC123456(X) ABC123(O)그대로!!!
    }
}
