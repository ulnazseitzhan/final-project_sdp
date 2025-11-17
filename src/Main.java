import builder.*;
import factory.*;
import strategy.*;
import decorator.*;
import observer.*;
import facade.*;

public class Main {
    public static void main(String[] args) {

        // 1) BUILDER + FACTORY

        CourseBuilder builder = new CourseBuilder()
                .setTitle("Java Masterclass")
                .setDescription("Full Java Course")
                .setDifficulty(4)
                .addModule("Intro")
                .addModule("OOP");

        builder.addContent(new VideoFactory().createContent());
        builder.addContent(new TextFactory().createContent());
        builder.addContent(new QuizFactory().createContent());

        Course course = builder.build();
        course.showCourse();


        // 2) STRATEGY + DECORATOR

        RecommendationStrategy strategy =
                new HighlightDecorator(
                        new PopularStrategy()
                );

        System.out.println(strategy.recommendCourse("Alice"));


        // 3) OBSERVER + FACADE

        NotificationFacade facade = new NotificationFacade();

        AssignmentService assignmentService = new AssignmentService();

        Student alice = new Student("Alice", facade);
        Student bob = new Student("Bob", facade);

        assignmentService.addObserver(alice);
        assignmentService.addObserver(bob);

        assignmentService.gradeAssignment("Alice", 95);
    }
}
