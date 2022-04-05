package SolidPrinciplesValid.Transations;
/*
liskov substitution principle it states that
derived classes must be completely substitutable for their
base classes,hear derived classes must be replaced by the base class.
 */
/*
Interface segregation principle it states that the implementation
of classes use only tha methods that are regurired.we should not force the client
 to use the methods that they do not want to use
 */

public class Deposit implements CheckTransations, CashTransations {
    @Override
    public void getCheck(int amount, String userId) {

    }

    @Override
    public void getCash(int amount, String userId) {

    }
}
