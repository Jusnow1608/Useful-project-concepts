package TDA;

public class PaymentService{

    public void standardCustomer(int amount, int customerId)
    {
        PaymentAccount paymentAccount = AccountsRepository.findAccountByCustomerId(customerId);

        if (paymentAccount.totalBalance < amount)
        {
            throw new RuntimeException("Not enough funds.");
        }

        paymentAccount.totalBalance -= amount;
        System.out.println("Saldo po operacji: " + paymentAccount.totalBalance);
    }

    public void premiumCustomer(int amount, int customerId)
    {
        PaymentAccount paymentAccount = AccountsRepository.findAccountByCustomerId(customerId);

        if (paymentAccount.totalBalance < amount)
        {
            throw new RuntimeException("Not enough funds.");
        }

        paymentAccount.totalBalance += amount;
        System.out.println("Saldo po operacji: " + paymentAccount.totalBalance);
    }
}

