import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class PhoneBookTests {

    WebDriver wd;

    @BeforeMethod
    public void openSite(){

        wd = new ChromeDriver();
       // wd.get("url");//with history
        wd.manage().window().maximize();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");//without history;
    }

    @Test
    public void phoneBookStart(){

       WebElement element = wd.findElement(By.tagName("a"));
       element.click();
       element.clear();
       element.sendKeys("Hello");

       List<WebElement> list = wd.findElements(By.tagName("a"));

       WebElement elId = wd.findElement(By.id("root"));
       WebElement elClass = wd.findElement(By.className("container"));
       WebElement elName = wd.findElement(By.name("NameEx"));
       WebElement elLink = wd.findElement(By.linkText("HOME"));
       WebElement elPlink = wd.findElement(By.partialLinkText("HOM"));

    }

    @Test

    public void fillFormLogin(){

        List <WebElement> list = wd.findElements(By.tagName("input"));
        WebElement inputEmail = list.get(0);
        WebElement inputPass = list.get(1);

        inputEmail.click();
        inputEmail.clear();
        inputEmail.sendKeys("noa@gmail.com");

        inputPass.click();
        inputPass.clear();
        inputPass.sendKeys("Nnoa12345$");

        WebElement buttonLogin = wd.findElement(By.tagName("button"));
        buttonLogin.click();
    }

    @Test

    public void fillRegistrationTest(){

        List <WebElement> list = wd.findElements(By.tagName("input"));
        WebElement inputEmail = list.get(0);
        WebElement inputPass = list.get(1);

        inputEmail.click();
        inputEmail.clear();
        inputEmail.sendKeys("noa101100@gmail.com");

        inputPass.click();
        inputPass.clear();
        inputPass.sendKeys("Nnoa12345$");

        List <WebElement> buttons = wd.findElements(By.tagName("button"));
        WebElement buttonReg = buttons.get(1);
        buttonReg.click();

    }

    @AfterMethod
    public void close(){

       // wd.quit();//closing all tabs
       // wd.close();//focus on page
    }
}
