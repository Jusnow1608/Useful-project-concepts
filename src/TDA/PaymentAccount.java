package TDA;

public class PaymentAccount {
        private int customerID;
        private int totalBalance;

    public PaymentAccount(int customerID, int totalBalance) {
        this.customerID = customerID;
        this.totalBalance = totalBalance;
    }

    public void standardCharge(int amount)
    {
        if (this.totalBalance < amount)
        {
            throw new RuntimeException("Not enough funds.");
        }
        this.totalBalance -= amount;
    }

    public void premiumCharge(int amount)
    {
        if (this.totalBalance < amount)
        {
            throw new RuntimeException("Not enough funds.");
        }
        this.totalBalance += amount;
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
