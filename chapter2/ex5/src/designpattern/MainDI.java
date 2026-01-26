package designpattern;

public class MainDI {
    public static void main(String[] args) {
        NotificationDI notify = new NotificationDI();

        notify.setMessageService(new EmailService());
        notify.send("Hello Email");

        notify.setMessageService(new SMSService());
        notify.send("Hello SMS");
    }
}
