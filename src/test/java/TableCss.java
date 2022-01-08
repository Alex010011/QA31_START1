import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TableCss {

    WebDriver wd;

    @BeforeMethod

    public void preCondition(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");

    }

    @Test
    public void tableTest(){

        //find element
        wd.findElement(By.cssSelector("table"));

        // tr9
        wd.findElement(By.cssSelector("tr:nth-child(9)"));

        //Maria Anders
        wd.findElement(By.cssSelector("tr:nth-child(2) td:nth-child(2)"));
        //last column
      //  wd.findElements(By.cssSelector(""));


        //th elements
       // wd.findElements(By.cssSelector(""));

        //Centro comercial Moctezuma Francisco Chang Mexico - one element
       // wd.findElement(By.cssSelector(""));

        //Giovanni Rovelli
      //  wd.findElement(By.cssSelector(""));

        //first column
      //  wd.findElements(By.cssSelector(""));

    }
}
