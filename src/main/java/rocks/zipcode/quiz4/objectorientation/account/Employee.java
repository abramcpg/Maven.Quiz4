package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker{
    Double hourlyWage = null;
    Double hoursWorked = null;
    Double balance = null;
    Double bankAccountBalance = balance;
    Double moneyEarned = hourlyWage * hoursWorked;
    public Employee() {

    }

    public Employee(BankAccount bankAccount) {
        Double balance;
    }

    public BankAccount getBankAccount() {
        return null;
    }

    public void setBankAccount(BankAccount bankAccount) {
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
    public Double getMoneyEarned() {
        return moneyEarned;
    }
}
