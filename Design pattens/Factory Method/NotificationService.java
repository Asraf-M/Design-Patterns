import java.util.Locale;


interface INotification {
    void notifyUser(String msg);
}


class SMSNotification implements INotification {
    @Override
    public void notifyUser(String msg) {
        System.out.println("Sending " + msg + " from SMSNotification");
    }
}

class EmailNotification implements INotification {
    @Override
    public void notifyUser(String msg) {
        System.out.println("Sending " + msg + " from EmailNotification");
    }
}

class PushNotification implements INotification {
    @Override
    public void notifyUser(String msg) {
        System.out.println("Sending " + msg + " from PushNotification");
    }
}



class NotificationFactory {

    public static final String SMS = "SMS";
    public static final String EMAIL = "EMAIL";
    public static final String PUSH = "PUSH";

    public INotification createNotification(String type) {

        if (type == null || type.isEmpty()) {
            return null;
        } else {
            switch (type.toUpperCase(Locale.ROOT)) {
                case SMS:
                    return new SMSNotification();
                case EMAIL:
                    return new EmailNotification();
                case PUSH:
                    return new PushNotification();
                default:
                    throw new IllegalArgumentException("Unknown Notification Type received");
            }
        }
    }
}


public class NotificationService {
    public static void main(String[] args) {        
        try {
            
            NotificationFactory notificationFactory = new NotificationFactory();
            INotification smsNotification = notificationFactory.createNotification("SMS");
            smsNotification.notifyUser("Hello");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
