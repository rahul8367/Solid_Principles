package SolidPrinciplesValid.Transations;


public class WithDraw implements CashTransations, CheckTransations, UPI_Transations {
    @Override
    public void getCash(int amount, String userId) {

    }

    @Override
    public void getCheck(int amount, String userId) {

    }

    @Override
    public void checkUPI_transation(int amount, String userId) {

    }
}
