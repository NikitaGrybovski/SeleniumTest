/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 *
 * @author pupil
 */
public class SeleniumTest {
    private static WebDriver driver;
    public SeleniumTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://localhost:8080/Ptvr16WebLibrary/");
    }
    
    @AfterClass
    public static void tearDownClass() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void seleniumTest() {
        login();
        logoutTest();
        registrationTest();
        login();
        addNewBookTest();
        
    
    }
    public void login(){
    System.out.println("Вход");
        WebElement el = driver.findElement(By.id("showLogin"));
         el.click();
         el = driver.findElement(By.name("login"));
         el.sendKeys("admin");
         el = driver.findElement(By.name("password"));
         el.sendKeys("admin");
         el = driver.findElement(By.id("enter"));
         el.click();
         el = driver.findElement(By.id("info"));
           System.out.println("Ожидается: Вы вошли как admin");
           System.out.println("Выводится: "+el.getText());
         assertEquals("Вы вошли как admin",el.getText());

    
    }
    
   
    
    
    
    private void logoutTest(){
        WebElement el = driver.findElement(By.id("logout"));
        el.click();
        
    }
     public void registrationTest(){
        WebElement el = driver.findElement(By.id("showRegistration"));
         el.click();
         System.out.println("Введите данные пользователя");
         el = driver.findElement(By.name("name"));
         el.sendKeys("TestName");
         el= driver.findElement(By.name("surname"));
         el.sendKeys("TestSurname");
         el= driver.findElement(By.name("email"));
         el.sendKeys("TestEmail");
         el= driver.findElement(By.name("login"));
         el.sendKeys("TestLogin");
         el= driver.findElement(By.name("password1"));
         el.sendKeys("TestPassword");
         el= driver.findElement(By.name("password2"));
         el.sendKeys("TestPassword");
         el= driver.findElement(By.id("enter"));
         el.click();
         System.out.println("Регистрация закончена");
        
         
    
    }
     public void addNewBookTest() {
         System.out.println("Добавление тестовой книги");
         WebElement el = driver.findElement(By.id("showAddNewBook"));
         el.click();
         el = driver.findElement(By.name("name"));
         el.sendKeys("TestBoook");
         el = driver.findElement(By.name("author"));
         el.sendKeys("TestAuthor");
         el = driver.findElement(By.name("isbn"));
         el.sendKeys("TestIsbn");
         el = driver.findElement(By.name("count"));
         el.sendKeys("10");
         el = driver.findElement(By.id("info"));
         assertEquals("Новая книга добавлена", el.getText());
         System.out.println("Книга добавлена");
         el= driver.findElement(By.id("enter"));
         el.click();
         
         
     }
   
}
