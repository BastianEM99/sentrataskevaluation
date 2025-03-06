package pages;


public class ValidateTable extends BasePage {

    
    // Variables
private String xpathTable = "//*[@id=\"root\"]/div/main/div[2]/div/div/div[1]/table";
private String cEmail = "smartinez@sentra.cl";
private String cPassword = "smart2025";

    //xPath's//
private String email = "//input[@id='email']";
private String pass = "//input[@id='password']";
private String loginbtn = "//button[@type='submit']";
private String home = "//span[normalize-space()='Home']";
private String exit = "//span[contains(.,'Salir')]";    
    
private String url = "http://192.168.80.43:10500";
        
public ValidateTable() {
    super(driver);

}

//navegar url
public void NavigatetoSentraTask() {
    navigateTo(url);
    driver.manage().window();
}

//ingresar emial y password
public void LoginEmailPassword() {
    write(email, cEmail);
    write(pass, cPassword);
}

//click en el botón ingresar
public void ClickButtonLogin() {
    clickElement(loginbtn);
}

//click en el botón home
public void ClickButtonHome() {
    clickElement(home);
}

//chequear si existe la tabla
public boolean CheckTable() {
    return isTablePresent(xpathTable);
}

//click en el botón salir
public void ClickButtonSalir() {
    clickElement(exit);

}

}