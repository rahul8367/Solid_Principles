package SolidPrinciplesValid.Notification;

import SolidPrinciplesValid.Notification.NotificationService;

public class WathsApp implements NotificationService {
    @Override
    public void sendOTP(String number) {
        //write logic hear
        System.out.println("(WHATSAPP)the message services are activated for whatsapp"+number);
    }

    @Override
    public void sendInoOfTransactions(String number) {
        // write logic hear
        System.out.println("TRANSATION OF USER ID AND OTHER DETILES IN WHATSAPP:");
    }
}
