
package workshop.account.entity;

import workshop.account.exception.InsufficientBalanceException;

public class Account {

    private String custId;
    private String acctId;
    private int balance;

    // 고객번호 Setter
    public void setCustId(String custId) {
        this.custId = custId;
    }

    // 고객번호 Getter
    public String getCustId() {
        return custId;
    }

    // 계좌번호 Setter
    public void setAcctId(String acctId) {
        this.acctId = acctId;
    }

    // 계좌번호 Getter
    public String getAcctId() {
        return acctId;
    }

    // 잔액 Getter
    public int getBalance() {
        return balance;
    }

    // 입금
    public void deposit(int amount) {
        balance += amount;
    }

    // 출금
    public void withdraw(int amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                "잔액이 부족합니다. 현재잔액은 = ", balance);
        }

        balance -= amount;
    }
}
