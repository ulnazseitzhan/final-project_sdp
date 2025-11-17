package facade;

public class PushService {
    public void sendPush(String user, String message) {
        System.out.println("[Push] Sending to " + user + ": " + message);
    }
}