package decorator;

// Добавляем импорт класса стратегии
import strategy.RecommendationStrategy;
public class BonusContentDecorator extends RecommendationDecorator {

    public BonusContentDecorator(RecommendationStrategy wrappee) {
        super(wrappee);
    }

    @Override
    public String recommendCourse(String username) {
        return wrappee.recommendCourse(username) + " + Bonus content!";
    }
}