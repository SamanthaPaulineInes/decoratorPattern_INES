package LabHw10_INES_3BSCS1_DecoratorPattern;
public interface BankAccount
{
    public String showAccountType();
    public Double getInterestRate();
    public Double getBalance();
    public String showBenefits();
    public Double computeBalanceWithInterest();
    public String showInfo();
}
