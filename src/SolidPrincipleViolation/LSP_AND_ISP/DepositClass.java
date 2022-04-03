package SolidPrincipleViolation.LSP_AND_ISP;
/*
violation of liskov substitution principle it states that
derived classes must be completely substitutable for their
base classes.
 */
public class DepositClass implements BankTransactionCLass{
    @Override
    public void cash(int amount) {
        // WRITE CODE
    }

    @Override
    public void upi(int amount) {
        // IT IS NOT USED BY THIS FUNTION.
    }

    @Override
    public void check(int amount) {
        // WRITE CODE
    }
}
