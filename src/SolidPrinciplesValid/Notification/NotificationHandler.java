package SolidPrinciplesValid.Notification;

public class NotificationHandler {
    public static NotificationService getNotification(String select){
        if("whatsapp".equalsIgnoreCase(select))
            return new WathsApp();
        else if("mobile".equalsIgnoreCase(select))
            return new Mobile();
        else
            return null;
    }

}
