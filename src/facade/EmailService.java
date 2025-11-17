package facade;

public class EmailService {
    public void sendEmail(String user, String message) {
        System.out.println("[Email] Sending to " + user + ": " + message);
    }
}