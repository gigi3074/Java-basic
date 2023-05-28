public class Exercise {
    public static void main(String[] args) {

    }
}
/*
4-1
1) 10 < x && x < 20
2) !(ch == ' ' || ch = '/t')
3) ch == 'x' || ch == 'X'
4) '0' <= ch && ch <='9'
5) ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')
6) year%400==0 || year%4==0 && year%100!=0
7) !powerOn
8) str.equals("yes")

4-2
int sum = 0;
for(int i = 1; i < 21; i++) {
    if(i%2 != 0 && i%3 != 0)
        sum += i;
     }

4-3
int sum = 0;
int total = 0;
for (int i = 1; i<11; i++) {
    sum += i;
    total += sum;
  }

4-4
int sum = 0;
for(int i = 1; sum < 100; i++)
    if (i%2 == 0){
        i *= -1;
        sum += i;
     } else {
        sum += 1;
     }
     
4-5
int i=0;
while(i<=10) {
    int j=0;
    while(j<=i) {
        System.out.print("*"); } j++;
        System.out.println();
        i++;
4-6
for(int i=1;i<=6;i++)
    for(int j=1;j<=6;j++)
        if(i+j==6)
        System.out.println(i+"+"+j+"="+(i+j));

4-7
(int)(Math.random()*6)+1

4-8
for(int x=0; x <=10;x++) {
    for(int y=0; y <=10;y++) {
        if(2*x+4*y==10) {
            System.out.println("x="+x+", y="+y);
        }

4-9
    sum += str.charAt(i) - '0';

4-10
while(num > 0) {
	sum += num%10;
	num /= 10;
}

4-11
num3 = num1 + num2;
System.out.print(","+num3);

num1 = num2;
num2 = num3;

4-12
for (int i = 2; i<=9 i+=3) {
    for (int j = 1; j<= 9; j++)
       System.out.print("%d * %d = %d\t", i,j,i*j);
       System.out.println("%d * %d = %d\t", i+1,j,(i+1)*j);
       System.out.println("%d * %d = %d\t", i+2,j,(i+2)*j);
       }
}
4-13
ch = value.charAt(i);
if(!('0'<=ch && ch<='9')) {
   isNumber = false;
        break;
}
4-14
if(answer > input) {
    System.out.println("더 큰 수를 입력하세요.");
} else if(answer < input) {
    System.out.println("더 작은 수를 입력하세요.");
} else {
    System.out.println("맞췄습니다.");
    System.out.println("시도횟수는 "+count+"번입니다.");
    break;
}
4-15
result = result*10 + tmp % 10;
tmp /= 10;
 */