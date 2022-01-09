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
       wd.findElement(By.xpath("//a"));
       element.click();
       element.clear();
       element.sendKeys("Hello");

       List<WebElement> list = wd.findElements(By.tagName("a"));

       WebElement elId = wd.findElement(By.id("root"));
       wd.findElement(By.cssSelector("#root"));

       wd.findElement(By.xpath("//*[@id='root']"));

       WebElement elClass = wd.findElement(By.className("container"));
       wd.findElement(By.cssSelector(".container"));

       wd.findElement(By.xpath("//*[@class='container']"));

       WebElement elName = wd.findElement(By.name("NameEx"));
       wd.findElement(By.cssSelector("[name='nameEx']"));
       wd.findElement(By.xpath("//*[@name = 'nameEx']"));

       WebElement elLink = wd.findElement(By.linkText("HOME"));
       WebElement elPlink = wd.findElement(By.partialLinkText("HOM"));

       wd.findElement(By.cssSelector("[href='/home']"));
       wd.findElement(By.xpath("//*[@href = '/home']"));
       wd.findElement(By.cssSelector("a[href='/home'"));
       wd.findElement(By.xpath("//a[@href ='/home']"));

       wd.findElement(By.xpath("//*[text()='PHONEBOOK']"));
       wd.findElement(By.xpath("//h1[text()='PHONEBOOK']"));
       wd.findElement(By.xpath("//a[text()='HOME']"));
       wd.findElement(By.xpath("//*[text()=' Login']"));
       wd.findElement(By.xpath("//button[text()=' Login']"));
       wd.findElement(By.xpath("//*[@placeholder='Password']"));
       wd.findElement(By.xpath("//*[contains(@placeholder,'word')]"));
       wd.findElement(By.xpath("//*[starts-with(@placeholder,'Pass')]"));
       wd.findElement(By.xpath("//*[@id='root' and @class='container')]"));
       wd.findElement(By.xpath("//*[@id='root' or @class='container')]"));
        wd.findElement(By.xpath("//*[@class='container')][2]"));

        //  xPath: //button[last()] - find last element from many, //button[1] - find first element
        wd.findElements(By.xpath("//h1/ancestor::*"));//returns all parents
        wd.findElement(By.xpath("//h1/ancestor::div[1]"));//
        wd.findElements(By.xpath("//h1/ancestor-or-self::*"));//returns all parents himself
        wd.findElement(By.xpath("//input[1]/following-sibling::*"));//returns children of the same floor down
        wd.findElement(By.xpath("//input[1]/following-sibling::button[2]"));
        wd.findElement(By.xpath("//input[1]/preceding-sibling::*"));//returns children of the same floor up
        wd.findElement(By.xpath("//input[1]/preceding-sibling::input[1]"));
        wd.findElement(By.xpath("//button[2]/parent::*"));//returns parent

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
    public void loginCss(){

        click(By.cssSelector("[placeholder='Email']"));
        type(By.cssSelector("[placeholder='Email']"),"noa@gmail.com");

        click(By.cssSelector("[placeholder='Password']"));
        type(By.cssSelector("[placeholder='Password']"), "Nnoa12345$");

        click(By.cssSelector("div button:first-of-type"));
    }

    @Test
    public void loginXPath(){

        click(By.xpath("//*[@placeholder='Email']"));
        type(By.xpath("//*[@placeholder='Email']"), "noa@gmail.com");

        click(By.xpath("//*[@placeholder='Password']"));
        type(By.xpath("//*[@placeholder='Password']"), "Nnoa12345$");

        click(By.xpath("//*[text()=' Login']"));

    }

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        wd.findElement(locator).click();
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
