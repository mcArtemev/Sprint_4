package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPageElements {
    private WebDriver driver;
    //Блок "Вопросы о важном"
    private By faqAccordeon = By.className("accordion");
    //Заголовок элемента аккордеона
    private By faqHeader;
    //Выпадающий текст элемента аккордеона
    private By faqDropdownText;
    //Кнопка "Заказать" в шапке
    private By orderButtonTop = By.xpath(".//div[contains(@class, 'Header_Nav')]/button[contains(text(), 'Заказать')]");
    //Кнопка "Заказать" у блока "Как это работает"
    private By orderButtonMiddle = By.xpath(".//div[contains(@class,'Home_FinishButton')]/button[contains(text(), 'Заказать')]");

    public MainPageElements(WebDriver driver){
        this.driver = driver;
    }

    //Нажать кн "Заказать" в шапке
    public void clickOrderButtonTop(){
        driver.findElement(orderButtonTop).click();
    }

    //Нажать кн "Заказать" у блока "Как это работает"
    public void clickOrderButtonMiddle(){
        driver.findElement(orderButtonMiddle).click();
    }

    //Скролл до кн "Заказать" у блока "Как это работает"
    public void scrollToOrderButtonMiddle(){
        WebElement element = driver.findElement(orderButtonMiddle);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    //Скролл до блока "Вопросы о важном"
    public void scrollToFaqAccordeon(){
        WebElement element = driver.findElement(faqAccordeon);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    //Получить элемент "Заголовок" аккордеона "Вопросы о важном"
    public By getFaqHeader(int item){
        faqHeader = By.id("accordion__heading-" + item);
        return faqHeader;
    }

    //Получить элемент "Выпадающий текст" элемента аккордеона "Вопросы о важном"
    public By getFaqDropdownText(int item){
        faqDropdownText = By.id("accordion__panel-" + item);
        return faqDropdownText;
    }

}