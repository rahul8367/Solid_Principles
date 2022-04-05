package SolidPrinciplesValid.Notification;

public class NotificationHandler {
    public static NotificationService getNotification(String select){
        if("whatsapp".equalsIgnoreCase(select))
            return new WathsAppNotificationService();
        else if("mobile".equalsIgnoreCase(select))
            return new MobileNotificationService();
        else
            return null;
    }

}
