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
       wd.findElement(By.cssSelector("a"));
       element.click();
       element.clear();
       element.sendKeys("Hello");

       List<WebElement> list = wd.findElements(By.tagName("a"));

       WebElement elId = wd.findElement(By.id("root"));
       wd.findElement(By.cssSelector("#root"));

       wd.findElement(By.xpath("//*[@id='root']"));

       WebElement elClass = wd.findElement(By.className("container"));
       wd.findElement(By.cssSelector(".container"));

       wd.findElement(By.xpath("//*[@class='container'"));

       WebElement elName = wd.findElement(By.name("NameEx"));
       wd.findElement(By.xpath("//*[@name = 'nameEx']"));
       wd.findElement(By.xpath("[name ='nameEx']"));


       WebElement elLink = wd.findElement(By.linkText("HOME"));
       WebElement elPlink = wd.findElement(By.partialLinkText("HOM"));
       wd.findElement(By.cssSelector("[href='/home']"));
       wd.findElement(By.cssSelector("a[href='/home'"));
       wd.findElement(By.xpath("//*[@href ='/home']"));

    }

    @Test

    public void fillFormLogin(){

        List <WebElement> list = wd.findElements(By.tagName("input"));
        WebElement inputEmail = list.get(0);
        WebElement inputPass = list.get(1);

        wd.findElement(By.cssSelector("[placeholder='Email']"));
        wd.findElement(By.cssSelector("[placeholder='Password']"));

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
