package pages;

public class LoginPage extends FirstPage{

    // URL //
    private String url = "http://192.168.80.43:10500";

    //xPath's//
    private String sendEmail = "//input[@id='email']";
    private String sendPass = "//input[@id='password']";
    private String btnsendLogin = "//button[@type='submit']";

    //Navegar a URL, escribe email y contraseña//
    public void login(String user, String password){
        navigateTo(url);
        write(sendEmail, user);  
        write(sendPass, password);    }
        
    //Escribe el email del usuario 
    public void SendEmail() {
        write(sendEmail,"Test");
    }
    //Escribe la contraseña del usuario
    public void SendPassword() {
        write(sendPass,"Test11");
    }
    //click en el botón ingresar 
    public void ButtonSendLogin() {
        clickElement(btnsendLogin);
    }
}
