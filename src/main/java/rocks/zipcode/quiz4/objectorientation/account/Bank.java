package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    private ArrayList<BankAccount> accountList = new ArrayList<BankAccount>();

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        if (this.accountList.get(indexNumber) != null){
            BankAccount account = this.accountList.get(indexNumber);
            this.accountList.remove(this.accountList.get(indexNumber));
            return account;
        }
        return null;
    }

    public void addBankAccount(BankAccount bankAccount) {
        this.accountList.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        return this.accountList.contains(bankAccount);
    }
}
