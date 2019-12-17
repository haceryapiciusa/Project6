import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Project6 {

public static void main(String[] args) throws InterruptedException {
    System.setProperty( "webdriver.chrome.driver", "/Users/haceryapici/Desktop/Selenyum/chromedriver" );
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.techlistic.com/p/selenium-practice-form.html" );
    WebElement name = driver.findElement(By.name("firstname"));
    name.sendKeys("Daulet");
    WebElement lastname = driver.findElement(By.name("lastname"));
    lastname.sendKeys("Saurbekow");

    List<WebElement> gender = driver.findElements( By.id( "sex-0" ) );
    WebElement firstone = gender.get(0);// [0, 1, 2].click
    firstone.click();
    WebElement experiance = driver.findElement(By.id("exp-1"));
    experiance.click();
   //12/16/2019
    WebElement date = driver.findElement(By.id("datepicker"));
    date.sendKeys("12/16/2019");
    WebElement profession = driver.findElement(By.id("profession-0"));
    profession.click();
    WebElement profession2 = driver.findElement(By.id("profession-1"));
    profession2.click();
    WebElement click2 = driver.findElement(By.id("tool-1"));
    click2.click();
    WebElement click3 = driver.findElement(By.id("tool-2"));
    click3.click();
    WebElement select=driver.findElement(By.id("continents"));
    Select dropdown=new Select(select);

    List<WebElement>options=dropdown.getOptions();
    for(WebElement element:options){
        if(element.getText().equals("North America"))
            dropdown.selectByVisibleText("North America");
    }

    Select dropdown1 = new Select(driver.findElement(By.id("selenium_commands")));
    List<WebElement> commands = dropdown1.getOptions();
    for (WebElement command:commands) {
        command.click();
    }


//    commands.getOptions();
//    commands.selectByVisibleText("Browser Commands");
//    commands.selectByVisibleText("Navigation Commands");
//    commands.selectByVisibleText("Switch Commands");
//    commands.selectByVisibleText("Wait Commands");
//    commands.selectByVisibleText("WebElement Commands");

    WebElement submit = driver.findElement(By.id("submit"));
    submit.click();

    Thread.sleep(3000);
    driver.quit();

}

}
