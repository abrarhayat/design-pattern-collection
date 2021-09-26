package decoratorDesignPattern;

public class AuthorizedWebPage extends WebPageDecorator {

    public AuthorizedWebPage(WebPage webPage) {
        super(webPage);
    }

    public void authorizeUser() {
        System.out.println("Authorizing user.");
    }

    public void display() {
        super.display();
        authorizeUser();
    }
}
