package strategy;

public class NewestStrategy implements RecommendationStrategy {

    private final String message;

    public NewestStrategy() {
        this.message = "Newest course recommendation for ";
    }

    public NewestStrategy(String message) {
        this.message = message;
    }

    @Override
    public String recommendCourse(String username) {
        return message + username;
    }
}