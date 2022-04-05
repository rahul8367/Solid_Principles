package SolidPrinciplesValid;
import SolidPrinciplesValid.Lone.*;
import SolidPrinciplesValid.Notification.NotificationHandler;
import SolidPrinciplesValid.Notification.NotificationService;

import java.util.Scanner;
public class ReprentationFlow {
    public void flow(){
       /* Scanner KeyBoard=new Scanner(System.in);
        System.out.println("select the opions\n1)lone\n2)notification\n3)bank withdraw and deposit\n4)passbook print");
        int select=KeyBoard.nextInt();
        KeyBoard.nextLine();
        if(select==1){
            LonePlan OBJ;
            System.out.println("ENTER THE PLAN 1 OR 6 MONTHS OR 1 YEAR LIKE \none\nsix\noneyear");
            String plan=KeyBoard.nextLine();
            OBJ= LoneServiceHandler.getPlan(plan);
            OBJ.plans();
        }
        else if(select==2){
            NotificationService OBJ,OBJ2;
            OBJ= NotificationHandler.getNotification("whatsapp");
            OBJ2= NotificationHandler.getNotification("mobile");
            System.out.println("ENTER THE INPUT AS (yes) FOR MESSAGE SERVICES FOR MOBILE\nENTER THE INPUT AS (yes_w) FOR MESSAGE SERVICES FOR WHATSAPP\nENTER THE INPUT AS (both) FOR MESSAGE SERVICES FOR MOBILE AND WHATSAPP ");
            String plan=KeyBoard.nextLine();
            System.out.println("enter the your number ");
            String number=KeyBoard.nextLine();
            if("yes".equalsIgnoreCase(plan)){
                OBJ.sendOTP(number);
            }
            else if("yes_w".equalsIgnoreCase(plan)){
                OBJ2.sendOTP(number);
            }
            else if("both".equalsIgnoreCase(plan)) {
                OBJ.sendOTP(number);
                OBJ2.sendOTP(number);
            }
            else
                System.out.println("invalid input");

        }
        else if(select==3){
            System.out.println("not impilimented");

        }
        else if(select==4){
            BankServices OBJ=new BankServices();
            System.out.println("ENTER THE USER ID AND PASSWORD");
            String userid=KeyBoard.nextLine();
            String bankComPassword=KeyBoard.nextLine();
            OBJ.printService(userid,bankComPassword);

        }
        else
            System.out.println("incorrect input");*/
    }

}
