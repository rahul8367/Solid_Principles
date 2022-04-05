package SolidPrincipleViolation.SRP;
/*
violation os single responsibility it states that every java class must perform a single functionality.
 */
public class BankServiceCLASS {
    public void deposit(int amount,String number ){
        //deposit the amount
    }
    public void withDraw(int amount,String number){
        //withdraw the amount
    }
    public void loneInf(String lonetype){
        if("one year".equalsIgnoreCase(lonetype)){
            //write code
        }
        else if("one month".equalsIgnoreCase(lonetype)){
            //do some thing
        }
    }
    public void notification(String number){
        // write code
    }
}
