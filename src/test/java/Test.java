import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String []arg) {
        String projectPath = System.getProperty("user.dir");
        System.out.println(projectPath);

        System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver.exe");

        // System Property for Chrome Driver
        // Instantiate a ChromeDriver class.

        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://google.com");
        //driver.get("hhtps://google.com");
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
        driver.quit();
    }
}
