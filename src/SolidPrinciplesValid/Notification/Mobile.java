package SolidPrinciplesValid.Notification;

import SolidPrinciplesValid.Notification.NotificationService;

public class Mobile implements NotificationService {
    @Override
    public void sendOTP(String number) {
        //write logic here
        System.out.println("the message services are activated for mobile"+number);
    }

    @Override
    public void sendInoOfTransactions(String number) {
        // write logic here
        System.out.println("TRANSATION OF USER ID AND OTHER DETILES :");
    }
}
