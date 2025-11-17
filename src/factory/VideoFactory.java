package factory;

public class VideoFactory extends ContentFactory {
    @Override
    public Content createContent() {
        return new VideoContent();
    }
}