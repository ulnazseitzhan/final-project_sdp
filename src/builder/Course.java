package builder;

import factory.Content;
import java.util.List;

public class Course {
    private String title;
    private String description;
    private int difficulty;
    private List<String> modules;
    private List<Content> contents;

    public Course(String title, String description, int difficulty,
                  List<String> modules, List<Content> contents) {
        this.title = title;
        this.description = description;
        this.difficulty = difficulty;
        this.modules = modules;
        this.contents = contents;
    }

    public void addContent(Content content) {
        contents.add(content);
    }

    public void showCourse() {
        System.out.println("=== COURSE INFO ===");
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Difficulty: " + difficulty);
        System.out.println("Modules: " + modules);
        System.out.println("Contents: ");
        contents.forEach(Content::display);
    }
}