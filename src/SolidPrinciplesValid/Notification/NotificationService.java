package SolidPrinciplesValid.Notification;
/*
open-closed principle it states that open for extension
closed for modification,here we can implement other medium also with
out changing the original implementation.
 */
public interface NotificationService {
    public void sendOTP(String number);
    public void sendInoOfTransactions(String number);
}
