package factory;

public class QuizFactory extends ContentFactory {
    @Override
    public Content createContent() {
        return new QuizContent();
    }
}