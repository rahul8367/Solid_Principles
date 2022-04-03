package SolidPrinciplesValid.Transations;


public class WithDraw implements BankTransationsByCASH, BankTransationsByCHECK, BankTransationsByUPI {
    @Override
    public void cash(int amount, String userId) {

    }

    @Override
    public void check(int amount, String userId) {

    }

    @Override
    public void upi(int amount, String userId) {

    }
}
