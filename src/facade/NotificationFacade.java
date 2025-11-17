package facade;

public class NotificationFacade {

    private EmailService emailService;
    private PushService pushService;
    private SmsService smsService;

    public NotificationFacade() {
        this.emailService = new EmailService();
        this.pushService = new PushService();
        this.smsService = new SmsService();
    }

    public void notifyAllChannels(String user, String message) {
        emailService.sendEmail(user, message);
        pushService.sendPush(user, message);
        smsService.sendSms(user, message);
    }
}
