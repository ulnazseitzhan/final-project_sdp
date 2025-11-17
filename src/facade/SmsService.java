package facade;

public class SmsService {
    public void sendSms(String user, String message) {
        System.out.println("[SMS] Sending to " + user + ": " + message);
    }
}