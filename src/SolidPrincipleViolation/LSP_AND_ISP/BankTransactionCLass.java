package SolidPrincipleViolation.LSP_AND_ISP;
/*
Violation of interface segregation principle it states that the implementation
of classes use only tha methods that are regurired.we should not force the client
 to use the methods that they do not want to use
 */
public interface BankTransactionCLass {
    public void cash(int amount);
    public void upi(int amount);
    public void check(int amount);
}
