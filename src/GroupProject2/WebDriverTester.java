package GroupProject2;

public class WebDriverTester {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        FireFoxDriver fireFoxDriver = new FireFoxDriver();
        SafariDriver safariDriver = new SafariDriver();
        System.out.println("Chrome Browser:");
        chromeDriver.open();
        chromeDriver.close();
        chromeDriver.getTitle();
        chromeDriver.navigate();
        System.out.println();
        System.out.println("Firefox Browser:");
        fireFoxDriver.open();
        fireFoxDriver.close();
        fireFoxDriver.getTitle();
        fireFoxDriver.navigate();
        System.out.println();
        System.out.println("Safari Browser:");
        safariDriver.open();
        safariDriver.close();
        safariDriver.getTitle();
        safariDriver.navigate();
    }
}

