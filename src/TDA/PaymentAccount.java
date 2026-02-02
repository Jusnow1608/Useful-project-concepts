package TDA;

public class PaymentAccount {
        public int customerID;
        public int totalBalance;

    public PaymentAccount(int customerID, int totalBalance) {
        this.customerID = customerID;
        this.totalBalance = totalBalance;
    }

    public PaymentAccount() {
    }

      public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(int totalBalance) {
        this.totalBalance = totalBalance;
    }
}
