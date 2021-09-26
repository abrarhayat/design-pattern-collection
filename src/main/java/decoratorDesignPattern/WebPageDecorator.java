package decoratorDesignPattern;

public abstract class WebPageDecorator implements WebPage {
    private final WebPage webPage;

    public WebPageDecorator(WebPage webPage) {
        this.webPage = webPage;
    }

    @Override
    public void display() {
        this.webPage.display();
    }
}
