package Reference;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankService {
    public static void main(String[] args) {
        List<BankAccount> bankAccounts = new ArrayList<>();
        while (true){
            System.out.println("서비스 번호를 입력하세요. 1.개설 2.입금 3.출금 4.송금");
            Scanner sc = new Scanner(System.in);
            int number = Integer.parseInt(sc.nextLine());
            if(number == 1){
                System.out.println("계좌번호를 입력하세요");
                String accountNumber = sc.nextLine();
                BankAccount bankAccount = new BankAccount(accountNumber);
                bankAccounts.add(bankAccount);
            }else if (number == 2){
                System.out.println("계좌번호를 입력하세요");
                String accountNumber = sc.nextLine();
                System.out.println("얼마 입금하겠습니까?");
                int money = Integer.parseInt(sc.nextLine());
                for(int i=0; i<bankAccounts.size(); i++){
                    if(bankAccounts.get(i).getAccountNumber().equals(accountNumber)){
                        bankAccounts.get(i).deposit(money);
                    }
                }
            }else if (number == 3){

            }else if( number == 4){
                System.out.println("본인 계좌번호를 입력하세요");
                String myNumber = sc.nextLine();
                System.out.println("상대방 계좌번호를 입력하세요");
                String yourNumber = sc.nextLine();
                System.out.println("얼마 입금하겠습니까?");
                int money = Integer.parseInt(sc.nextLine());
                BankAccount myAccount = null;
                BankAccount yourAccount = null;
                for(int i=0; i<bankAccounts.size(); i++){
                    if(bankAccounts.get(i).getAccountNumber().equals(myNumber)){
                        myAccount = bankAccounts.get(i);
                    }
                    if(bankAccounts.get(i).getAccountNumber().equals(yourNumber)){
                        yourAccount = bankAccounts.get(i);
                    }
                }
                myAccount.transfer(money, yourAccount);

            }
        }
    }
}
class BankAccount{
    private String accountNumber;
    private int balance;
    BankAccount(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public void transfer(int money, BankAccount bankAccount){
        this.balance -= money;
        bankAccount.deposit(money);
        System.out.println("현재 잔액은 " + this.balance);
    }
    public void deposit(int money){
        this.balance += money;
        System.out.println(money+"원 입금되었습니다.");
        System.out.println("현재 잔액은 " + this.balance);
    }
    public void withdraw(int money){
        if(this.balance < money){
            System.out.println("잔액 부족입니다.");
        }else {
            this.balance -= money;
            System.out.println(money + "원 출금되었습니다.");
        }
        System.out.println("현재 잔액은 " + this.balance);
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public int getBalance() {
        return balance;
    }
}