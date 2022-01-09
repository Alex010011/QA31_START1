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
        wd.findElement(By.xpath("//table"));

        // tr9
        wd.findElement(By.cssSelector("tr:last-child"));
        wd.findElement(By.xpath("//tr[9]"));

        //Maria Anders
        wd.findElement(By.cssSelector("tr:nth-child(2) td:nth-child(2)"));
        wd.findElement(By.xpath("//tr[2]/td[2]"));
        wd.findElement(By.xpath("//td[text()='Maria Anders']"));

        //last column

        wd.findElements(By.cssSelector("td:last-child"));
        wd.findElements(By.xpath("//td[last()]"));

        //th elements
        wd.findElements(By.cssSelector("th"));
        wd.findElements(By.xpath("//th"));

        //Centro comercial Moctezuma Francisco Chang Mexico - one element
        wd.findElement(By.cssSelector("tr:nth-child(4)"));
        wd.findElement(By.xpath("//tr[4]"));

        //Giovanni Rovelli
        wd.findElement(By.cssSelector("tr:last-child td:nth-child(2)"));
        wd.findElement(By.xpath("//tr[last()]/td[2]"));

        //first column
         wd.findElements(By.cssSelector("td:first-child"));
         wd.findElements(By.xpath("//td[1]"));

    }
}
