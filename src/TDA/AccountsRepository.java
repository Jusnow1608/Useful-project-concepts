package TDA;

public class AccountsRepository
{
    public static PaymentAccount findAccountByCustomerId(int customerId)
    {
        PaymentAccount paymentAccount = new PaymentAccount();
        paymentAccount.customerID = customerId;
        paymentAccount.totalBalance = 200;

        return paymentAccount;
    }
}