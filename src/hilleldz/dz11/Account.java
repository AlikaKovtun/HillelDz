package hilleldz.dz11;

public class Account {

    private int number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private long customerPhoneNumber;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public long getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(int customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double sum) {
        if (sum < 0) System.out.println("Недопустимое значение!");
        else balance += sum;
    }

    public void withdrawal(double sum) {
        if (balance < sum) {
            System.out.println("Недостаточно средств!");
        } else {
            balance -= sum;
        }
    }

    public void showBalance() {
        System.out.println("На балансе " + customerName + ": " + balance + "$");
    }
}
