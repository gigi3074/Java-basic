/*
문제 3: 은행 계좌 관리
은행 계좌를 관리하는 프로그램을 작성하세요. Account 클래스를 구현하고,
각 계좌 객체는 계좌번호와 잔액을 가지며, 입금 및 출금을 처리하는 메서드를 가져야 합니다.
또한, 잔액을 출력하는 메서드를 구현해보세요.
*/
public class Ex03 {
    public static void main(String[] args) {
        Account myAcc = new Account(67683696, 10_000);
        System.out.println("계좌번호: "+ myAcc.getAccountNum()); //계좌번호: 67683696
        myAcc.deposit(30_000); //30000.0원 입금 완료!
        myAcc.withdraw(50_000); //잔액 40000.0원으로 50000.0원 출금 불가
        myAcc.withdraw(40_000); //40000원 출금 완료!
        System.out.println("현재잔액: "+ myAcc.getBalance()+"원"); //현재잔액: 0원
    }
}
class Account{
    int accountNum;
    int balance;

    Account(int accountNum, int balance){
        this.accountNum = accountNum;
        this.balance = balance;
    }
    void deposit(int amount){
        balance += amount;
        System.out.println(amount+"원 입금 완료!");
    }
    void withdraw(int amount){
        if(balance-amount<0){
            System.out.println("잔액 "+balance+"원으로 "+amount+"원 출금 불가");
        }else {
            balance -= amount;
            System.out.println(amount+"원 출금 완료!");
        }
    }
    int getBalance(){
        return balance;
    }
    int getAccountNum(){
        return accountNum;
    }
}
