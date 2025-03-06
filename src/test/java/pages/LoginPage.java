package pages;

public class LoginPage extends FirstPage{

    // URL //
    private final String URL = "http://192.168.80.43:10500";

    //xPath's//
    private String sendEmail = "//input[@id='email']";
    private String sendPass = "//input[@id='password']";
    private String btnsendLogin = "//button[@type='submit']";

    //variables
    private final String CORREO = "juanito@gmail.com";
    private final String PASS = "juanito123";

    //Navegar a URL, escribe email y contraseña//
    public void login(String user, String password){
        navigateTo(URL);
        write(sendEmail, user);  
        write(sendPass, password);    }
        
    //Escribe el email del usuario 
    public void SendEmail() {
        write(sendEmail,CORREO);
    }
    //Escribe la contraseña del usuario
    public void SendPassword() {
        write(sendPass,PASS);
    }
    //click en el botón ingresar 
    public void ButtonSendLogin() {
        clickElement(btnsendLogin);
    }
}
