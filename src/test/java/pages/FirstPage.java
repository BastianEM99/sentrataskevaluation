package pages;

public class FirstPage extends BasePage { 
    
    private String url = "http://192.168.80.43:10500/home";
    
    public FirstPage() {
        super(driver);
    }
   
    public void NavigatetoSentraTask() {
        driver.manage().window().maximize();
        navigateTo(url);
    }
}
