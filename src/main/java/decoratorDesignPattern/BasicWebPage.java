package decoratorDesignPattern;

public class BasicWebPage implements WebPage {
    private String html;
    private String css;
    private String scripts;

    @Override
    public void display() {
        /*
        * Actual Rendering goes here
        * */
        System.out.println("Displaying Page.");
    }
}
