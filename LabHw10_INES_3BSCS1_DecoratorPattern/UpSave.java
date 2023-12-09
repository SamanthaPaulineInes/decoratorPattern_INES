package LabHw10_INES_3BSCS1_DecoratorPattern;
public class UpSave implements BankAccountDecorator
{
    private BankAccount bankAccount;
    @Override
    public String showAccountType()
    {
        return "UpSave";
    }
    @Override
    public Double getInterestRate()
    {
        return 0.04;
    }
    @Override
    public Double getBalance()
    {
        return bankAccount.getBalance();
    }
    @Override
    public String showBenefits()
    {
        return bankAccount.showBenefits() + ", With Insurance";
    }
    @Override
    public Double computeBalanceWithInterest()
    {
        return bankAccount.getBalance() * (1 + getInterestRate());
    }
    @Override
    public String showInfo()
    {
        return bankAccount.showInfo();
    }
    @Override
    public void setBankAccount(BankAccount bankAccount)
    {
        this.bankAccount = bankAccount;
    }
    public UpSave(BankAccount bankAccount)
    {
        this.bankAccount = bankAccount;
    }
}
