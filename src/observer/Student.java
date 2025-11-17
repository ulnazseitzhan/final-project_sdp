package observer;

import facade.NotificationFacade;

public class Student implements Observer {

    private String name;
    private NotificationFacade notificationFacade;

    public Student(String name, NotificationFacade notificationFacade) {
        this.name = name;
        this.notificationFacade = notificationFacade;
    }

    @Override
    public void update(String message) {
        notificationFacade.notifyAllChannels(name, message);
    }
}