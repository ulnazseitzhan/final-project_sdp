package decorator;

import strategy.RecommendationStrategy;
public abstract class RecommendationDecorator implements RecommendationStrategy {
    protected RecommendationStrategy wrappee;

    public RecommendationDecorator(RecommendationStrategy wrappee) {
        this.wrappee = wrappee;
    }
}