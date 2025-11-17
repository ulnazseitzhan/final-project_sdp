package builder;

import factory.Content;
import java.util.ArrayList;
import java.util.List;

public class CourseBuilder {
    private String title;
    private String description;
    private int difficulty;
    private List<String> modules = new ArrayList<>();
    private List<Content> contents = new ArrayList<>();

    public CourseBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public CourseBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public CourseBuilder setDifficulty(int difficulty) {
        this.difficulty = difficulty;
        return this;
    }

    public CourseBuilder addModule(String module) {
        this.modules.add(module);
        return this;
    }

    public CourseBuilder addContent(Content content) {
        this.contents.add(content);
        return this;
    }

    public Course build() {
        return new Course(title, description, difficulty, modules, contents);
    }
}