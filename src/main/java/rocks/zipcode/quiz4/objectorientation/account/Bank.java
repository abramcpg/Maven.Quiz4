package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    private ArrayList<BankAccount> accountList = new ArrayList<BankAccount>();

    public void removeBankAccountByIndex(Integer indexNumber) {
        this.accountList.remove(indexNumber);
        //return null;
    }

    public void addBankAccount(BankAccount bankAccount) {
        this.accountList.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        return this.accountList.contains(bankAccount);
    }
}
