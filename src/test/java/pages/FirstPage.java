package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FirstPage extends BasePage { 
    
    private String url = "http://192.168.80.43:10500";
    
    public FirstPage() {
        super(driver);
    }
   
    public void NavigatetoSentraTask() {
        navigateTo(url);
        driver.manage().window();
    }

    public String obtenerText(String locator) {
        WebElement div = driver.findElement(By.xpath(locator));
        return div.getText();
    }

}
