package observer;

import observer.Observer;
import observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class AssignmentService implements Subject {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }

    public void gradeAssignment(String studentName, int grade) {
        String message = "Your assignment has been graded, " + studentName + ". Grade: " + grade;
        notifyObservers(message);
    }
}