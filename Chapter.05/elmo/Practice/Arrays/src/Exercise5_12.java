import java.util.Scanner;

public class Exercise5_12 {
    public static void main(String[] args) {
        String[][] words = {
                {"chair", "의자"},
                {"computer", "컴퓨터"},
                {"integer", "정수"}
        };

        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        for(int i=0; i<words.length; i++){
            System.out.println("Q"+(i+1)+". "+words[i][0]+"의 뜻은?");
            String answer = sc.nextLine();

            if(answer.trim().equals(words[i][1])){
                System.out.println("정답입니다!");
                cnt++;
            }else{
                System.out.println("틀렸습니다. 정답은 "+words[i][1]+"입니다.");
            }
        }

        System.out.println("전체 "+words.length+"중에 "+cnt+"개 맞추셨습니다");

    }
}
