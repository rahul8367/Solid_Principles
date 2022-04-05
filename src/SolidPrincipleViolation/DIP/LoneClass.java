package SolidPrincipleViolation.DIP;
/*
Violation of dependency inversion principle it states that
the high level modules should not depend on low level modules directly
it must use abstraction in between them to loosly coupling.
 */
public class LoneClass {
    private OneMonthV rate1;
    public LoneClass(OneMonthV rate){

        this.rate1=rate;
    }
    public void rate(int amount){
        rate1.rateOfIntrest(amount);
    }
    public static void main(String[] args) {
        OneMonthV rate1=new OneMonthV();
        LoneClass lone=new LoneClass(rate1);
        lone.rate(100);
      // hear one-month plan is direct coupled.
    }


}
