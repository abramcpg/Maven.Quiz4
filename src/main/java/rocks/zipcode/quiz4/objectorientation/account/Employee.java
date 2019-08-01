package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable{
    private BankAccount bankAccount;
    private Double hoursWorked;
    private Double hourlyWage;
    private Double balance;


    public Employee() {
        this.bankAccount = new BankAccount();
        bankAccount.setBalance(0.0);
        this.hourlyWage = 35.0;
        this.hoursWorked = 0.0;
        this.balance = bankAccount.getBalance();

    }

    public Employee(BankAccount bankAccount) {
        this.hourlyWage = 35.0;
        this.hoursWorked = 0.0;
        this.balance = bankAccount.getBalance();
        this.bankAccount = bankAccount;
    }

    public BankAccount getBankAccount() {
        return this.bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        this.hoursWorked += numberOfHours;
    }

    @Override
    public Double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public Double getHourlyWage() {
        return hourlyWage;
    }

    @Override
    public Double getMoneyEarned() { return this.hoursWorked * hourlyWage; }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        this.balance += amountToIncreaseBy;
        this.bankAccount.deposit(amountToIncreaseBy);
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        this.balance -= amountToDecreaseBy;
        this.bankAccount.withdrawal(amountToDecreaseBy);
    }

    @Override
    public Double getBalance() {
        return this.bankAccount.getBalance();
    }
}
