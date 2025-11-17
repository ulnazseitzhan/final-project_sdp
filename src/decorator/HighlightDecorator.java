package decorator;

// Импортируем интерфейс из другого пакета
import strategy.RecommendationStrategy;
public class HighlightDecorator extends RecommendationDecorator {

    public HighlightDecorator(RecommendationStrategy wrappee) {
        super(wrappee);
    }

    @Override
    public String recommendCourse(String username) {
        return wrappee.recommendCourse(username) + " [HOT]";
    }
}