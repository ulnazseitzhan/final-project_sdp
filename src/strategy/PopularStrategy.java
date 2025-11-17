package strategy;

public class PopularStrategy implements RecommendationStrategy {

    private final String message;

    public PopularStrategy() {
        this.message = "Popular course recommendation for ";
    }

    public PopularStrategy(String message) {
        this.message = message;
    }

    @Override
    public String recommendCourse(String username) {
        return message + username;
    }
}