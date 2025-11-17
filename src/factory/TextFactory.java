package factory;

public class TextFactory extends ContentFactory {
    @Override
    public Content createContent() {
        return new TextContent();
    }
}