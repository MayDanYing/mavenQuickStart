package geekbrains.homework.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestCase01 {
    public static void main(String[] args) throws InterruptedException {

        //Тест-кейс №4 Успешный поиск статей по ключевым словам

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); //ожидание

        //1. Перейти на сайт meduza.io
        driver.get("https://meduza.io/");

       // 2. Нажать на значок лупы, расположенный в правом верхнем углу главной страницы
        WebElement searchElement = driver.findElement(By.xpath("//button[@class='Header-item Header-itemSearch']"));
        searchElement.click();

       // 3. Ввести любое слово или сочетание слов(через пробел)(В нашем случае вводим "Джо Байден")
        WebElement searchBox = driver.findElement(By.xpath("//input[@class='Search-field']"));
        searchBox.sendKeys("Джо Байден");
        searchBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000); // остановимся, посмотрим результат

      //  4. Закрыть поисковую строку нажав на крестик в правом верхнем углу страницы */
        searchElement.click();
        driver.quit();
    }
}
