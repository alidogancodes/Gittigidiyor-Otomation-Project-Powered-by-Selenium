import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class MethodsPool {

    String homePageUrl = "https://www.gittigidiyor.com";
    private WebDriver driver;
    private By userName = By.id("L-UserNameField");
    private By password = By.id("L-PasswordField");
    private String priceValue;

    public MethodsPool(WebDriver driver){
        this.driver = driver;
    }


    public void homePage(){
        WebElement login = driver.findElement(By.xpath("//div[@title='Giriþ Yap']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(login).perform();
        WebDriverWait wait = new WebDriverWait(driver , 2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-cy='header-user-menu']/div[2]/div[1]"))).click();
        
    }
    
    public void correctPage() {
        Assert.assertEquals("GittiGidiyor - Türkiye'nin Öncü Alýþveriþ Sitesi",driver.getTitle()); 
    }
    
    public void login(String userNameText, String passwordText){
        WebElement userNameSpace = driver.findElement(userName);
        WebElement passwordSpace = driver.findElement(password);

        userNameSpace.click();
        userNameSpace.sendKeys(userNameText);
        passwordSpace.click();
        passwordSpace.sendKeys(passwordText);
        driver.findElement(By.id("gg-login-enter")).click();
        Assert.assertEquals("GittiGidiyor - Türkiye'nin Öncü Alýþveriþ Sitesi",driver.getTitle());
    }
    

    public void searchComputer(String text){
        WebElement searchTextBox = driver.findElement(By.xpath("//input[@placeholder='Keþfetmeye Bak']"));
        searchTextBox.click();
        searchTextBox.sendKeys(text);
        driver.findElement(By.xpath("//button[@class='qjixn8-0 sc-1bydi5r-0 hKfdXF']")).click();
    }

    public void goToPageTwo(){
        WebElement pageTwo = driver.findElement(By.xpath("//*[@id='best-match-right']/div[5]/ul/li[2]/a"));
        Actions actions = new Actions(driver);
        actions.click(pageTwo).perform();
    }

    public void selectRandomComputer(){
        Random randomNumber = new Random(); //instance of random class
        int upperbound = 49;
        int int_random = randomNumber.nextInt(upperbound);
        int_random = int_random + 1;

        WebElement select = driver.findElement(By.xpath("//*[@product-index='" + int_random + "']"));
        Actions actions = new Actions(driver);
        actions.click(select).perform();
    }

    public void addToBasket(){
        WebElement addBasket = driver.findElement(By.id("add-to-basket"));
        Actions actions = new Actions(driver);
        actions.click(addBasket).perform();
    }

    public void priceValue(){
        WebElement price = driver.findElement(By.id("sp-price-lowPrice"));
        priceValue = price.getText();
        System.out.println("Choosen Computer Price = " + priceValue);
    }

    public void pathBasket(){
        WebElement basket = driver.findElement(By.xpath("//span[@class='basket-title']"));
        Actions actions = new Actions(driver);
        actions.click(basket).perform();
    }
    
    public void priceCheck(){
    Assert.assertEquals(price,basket);
    }
    
    public void increaseBasketValue(){
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/form/div/div[2]/div[2]/div[1]/div/div[6]/div[2]/div[2]/div[1]/div[4]/div/div[2]/select"));
        Select selected = new Select(element);
        selected.selectByVisibleText("2");
    }

    public void clearBasket(){
        driver.findElement(By.xpath("//a[@title='Sil']")).click();
    }
}
