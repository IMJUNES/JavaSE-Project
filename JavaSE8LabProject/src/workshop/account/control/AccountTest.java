
package workshop.account.control;

import workshop.account.entity.Account;
import workshop.account.exception.InsufficientBalanceException;

public class AccountTest {

    public static void main(String[] args) {

        // Account 객체 생성
        Account account = new Account();

        // 초기 계좌정보 설정
        account.setCustId("A1100");
        account.setAcctId("221-22-3477");
        account.deposit(100000);

        // 고객번호, 계좌번호 출력
        System.out.println("고객번호 : " + account.getCustId());
        System.out.println("계좌번호 : " + account.getAcctId());

        // 잔액 출력
        System.out.println("현재잔액 : " + account.getBalance());

        // 10000원 입금
        account.deposit(10000);
        System.out.println("입금 후 잔액 : " + account.getBalance());

        try {
            // 20000원 출금
            account.withdraw(20000);
            System.out.println("출금 후 잔액 : " + account.getBalance());

            // 잔액 부족 예외 테스트
            account.withdraw(200000);

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage() + e.getCurrentBalance());
        }
    }
}
