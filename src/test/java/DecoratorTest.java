import decoratorDesignPattern.AuthenticatedWebPage;
import decoratorDesignPattern.AuthorizedWebPage;
import decoratorDesignPattern.BasicWebPage;
import org.junit.jupiter.api.Test;

public class DecoratorTest {
    @Test
    public void testDecorator() {
        BasicWebPage basicWebPage = new BasicWebPage();
        basicWebPage.display();

        AuthenticatedWebPage authenticatedWebPage = new AuthenticatedWebPage(basicWebPage);
        authenticatedWebPage.display();

        AuthorizedWebPage authorizedWebPage = new AuthorizedWebPage(authenticatedWebPage);
        authorizedWebPage.display();
    }
}
