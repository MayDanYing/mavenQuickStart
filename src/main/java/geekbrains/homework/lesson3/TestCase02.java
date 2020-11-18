package geekbrains.homework.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestCase02 {
    public static void main(String[] args) throws InterruptedException {

        // Тест-кейс №6 Успешное воспроизведение аудио-файлов из рубрики "Подкасты"

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); //ожидание

        // 1. Перейти на сайт meduza.io
        driver.get("https://meduza.io/");

        // 2. Перейти на вкладку "Подкасты" в шапке главной страницы сайта.
        WebElement linkToPodcasts = driver.findElement(By.cssSelector("a[href*='/podcasts']"));
        linkToPodcasts.click();

        // 3. Выбрать первую по списку страницу из данной рубрики, содержащую аудиофайл с подкастом.
        WebElement article = driver.findElement(By.cssSelector("a[href='/podcasts/meduza-v-kurse']"));
        article.click();

        // 4.Открываем страницу
        WebElement articleOne = driver.findElement(By.cssSelector( "a[href='/episodes/2020/11/13/delo-kalvi-stalo-dlya-rossiyskogo-biznesa-chem-to-vrode-dela-golunova-kazhetsya-ono-blizitsya-k-kontsu-no-lish-dva-goda-spustya-i-s-menee-optimistichnym-finalom']"));
        articleOne.click();

        //5. Нажать на кнопку воспроизведения для воспроизведения аудиофайла.
        WebElement audio = driver.findElement(By.cssSelector("button[class*='PlayButton-root PlayButton-isInAudioPanel']"));
        audio.click();

        Thread.sleep(5000); // остановимся, послушаем аудиозапись
        driver.quit();
    }
}
