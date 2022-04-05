package SolidPrinciplesValid;
import SolidPrinciplesValid.Lone.*;
import java.util.Scanner;

/*
single responsibility it states that every java class must perform a single functionality.
 */
public class BankServices {
    LonePlan obj;
    public BankServices(LonePlan obj){
    //
        this.obj=obj;
    }
    public void getPlans(int amount){
        obj.plans(amount);
    }

    public void printService(String userid,String bankComPassword){
    System.out.println("the pass book will be printed.");
    }


    public static void main(String[] args) {
        //ReprentationFlow OBJ=new ReprentationFlow();
       // OBJ.flow();
        //hear we taking amount to deposit/withdraw
        Scanner KeyBoard=new Scanner(System.in);
        System.out.println("enter amount");
        int amount=KeyBoard.nextInt();
        KeyBoard.nextLine();
        // declaring the object of loneplan
        LonePlan obj=new OneYear();
        BankServices value=new BankServices(obj);
        value.getPlans(amount);

    }
}
