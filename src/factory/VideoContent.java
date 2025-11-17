package factory;

public class VideoContent implements Content {
    @Override
    public void display() {
        System.out.println("Video Lesson: Watching video content...");
    }
}