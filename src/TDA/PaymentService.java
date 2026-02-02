package TDA;

public class PaymentService{

    public void standardCustomer(int amount, int customerId)
    {
        PaymentAccount paymentAccount = AccountsRepository.findAccountByCustomerId(customerId);

        paymentAccount.standardCharge(amount);
        System.out.println("Saldo po operacji: " + paymentAccount.getTotalBalance());
    }

    public void premiumCustomer(int amount, int customerId)
    {
        PaymentAccount paymentAccount = AccountsRepository.findAccountByCustomerId(customerId);
        paymentAccount.premiumCharge(amount);
        System.out.println("Saldo po operacji: " + paymentAccount.getTotalBalance());
    }
}

