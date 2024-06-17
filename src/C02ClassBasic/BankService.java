package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankService {
    public static void main(String[] args) {

        List<BankAccount> bankAccountList = new ArrayList<>();

        while(true){
            System.out.println("서비스 번호를 입력하세요. 1.계좌 개설/2.입금/3.출금/4.계좌 송금");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            String accountNumber;
            int money;
            switch (choice){
                case 1 :
                    System.out.println("계좌 번호를 입력하세요.");
                    accountNumber = sc.nextLine();
                    BankAccount bankAccount = new BankAccount(accountNumber);
                    bankAccountList.add(bankAccount);
                    break;
                case 2 :
                    System.out.println("계좌 번호를 입력하세요.");
                    accountNumber = sc.nextLine();
                    System.out.println("얼마 입급하시겠어요?");
                    money = Integer.parseInt(sc.nextLine());
                    for (int i=0; i<bankAccountList.size(); i++){
                        if(bankAccountList.get(i).equals(accountNumber)){
                            bankAccountList.get(i).deposit(money);
                        }
                    }
                    break;
                case 3 :
                    System.out.println("얼마 출금하시겠어요?");
                    // bankAccount.withdraw(Integer.parseInt(sc.next()));

                    break;
                case 4 :
                    System.out.println("본인 계좌 번호를 입력하세요.");
                    String myAccountNumber = sc.nextLine();
                    System.out.println("상대방 계좌 번호를 입력하세요.");
                    String yourAccountNumber = sc.nextLine();
                    BankAccount myAccount = null;
                    BankAccount yourAccount = null;
                    System.out.println("얼마 입급하시겠어요?");
                    money = Integer.parseInt(sc.nextLine());

                    for (int i=0; i<bankAccountList.size(); i++){
                        if(bankAccountList.get(i).getAccountNumber().equals(myAccount)){
                            myAccount = bankAccountList.get(i);
                        }
                        if(bankAccountList.get(i).getAccountNumber().equals(yourAccount)){
                            yourAccount = bankAccountList.get(i);
                        }
                    }
                    myAccount.transfer(yourAccount, money);
                    break;
            }
        }
    }
}
class BankAccount {
    private String accountNumber;
    private int balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public int getBalance() {
        return balance;
    }

    public void deposit(int a){
        this.balance += a;
        System.out.println(a + "원이 입금되었습니다.");
    }

    public void withdraw(int a){
        if (this.balance >= a){
            this.balance -= a;
            System.out.println(a + "원이 출금되었습니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }
    public void transfer(BankAccount bankAccount, int a) {
        this.balance -= a;
        bankAccount.deposit(a);
        System.out.println(a+"원이 송금되었습니다.");
    }
}
