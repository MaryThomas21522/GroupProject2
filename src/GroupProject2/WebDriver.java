package GroupProject2;

public interface WebDriver {

    void open();
    void close();
    String getTitle();
}

interface RemoteWebDriver extends WebDriver{
    void navigate();
}

interface TakesScreenshot extends RemoteWebDriver{
    void getScreenshot();
}

class ChromeDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Opening Chrome browser.");
    }

    @Override
    public void close() {
        System.out.println("Closing Chrome browser.");
    }

    @Override
    public String getTitle() {
        return "Title";
    }

    @Override
    public void navigate() {
        System.out.println("Navigating to this URL in Chrome browser.");
    }
}

class FireFoxDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Opening FireFox browser.");
    }

    @Override
    public void close() {
        System.out.println("Closing FireFox browser.");
    }

    @Override
    public String getTitle() {
        return "Title";
    }

    @Override
    public void navigate() {
        System.out.println("Navigating to this URL in FireFox browser.");
    }
}

class SafariDriver implements RemoteWebDriver{

    @Override
    public void open(){
        System.out.println("Opening Safari browser.");
    }

    @Override
    public void close(){
        System.out.println("Closing Safari browser.");
    }

    @Override
    public String getTitle() {
        return "Title";
    }

    @Override
    public void navigate() {
        System.out.println("Navigating to this URL in Safari browser.");
    }
}

/*
    Provide Implementation for the diagram below. Then create a test class in which you need to create
    Objects of ChromeDriver, FirefoxDrive and SafariDriver classes and see which methods available to them.
 */

