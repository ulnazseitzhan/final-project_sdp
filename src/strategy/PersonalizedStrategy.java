package strategy;
public class PersonalizedStrategy implements RecommendationStrategy {

    private final String message;

    public PersonalizedStrategy() {
        this.message = "Personalized course recommendation for ";
    }

    public PersonalizedStrategy(String message) {
        this.message = message;
    }

    @Override
    public String recommendCourse(String username) {
        return message + username;
    }
}