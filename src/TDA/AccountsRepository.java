package TDA;

public class AccountsRepository
{
    public static PaymentAccount findAccountByCustomerId(int customerId)
    {
        return new PaymentAccount (customerId, 1200);
    }
}