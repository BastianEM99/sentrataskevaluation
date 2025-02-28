package pages;

public class EmptyPass extends FirstPage {
    
    //variables//
    private String nameError = "Empty Password";
    private String lastnameError = "Empty Password";
    private String emailError = "sentra@sentra.cl";
    private String passError = "Sentrasentra";
    private String url = "http://192.168.80.43:10500";

    //xpaths//
    private String btnNewUser = "//button[@type='button']";
    private String btnNewuserCancel = "//button[contains(.,'Cancelar')]";
    private String addName = "//input[@id='firstname']";
    private String addlastName = "//input[@id='lastname']";
    private String addEmail = "(//input[@id='email'])[2]";
    private String addPass = "(//input[@id='password'])[2]";
    private String btnaddnewUser = "//button[contains(.,'Registrar Usuario')]";

    //Navega a la url
    public void navigateToUrl() {
        driver.manage().window().maximize();
        navigateTo(url);

    }

    //Click en botón "Nuevo Usuario" y "Cancelar"
    public void NewUser() {
        clickElement(btnNewUser);
        clickElement(btnNewuserCancel);
        clickElement(btnNewUser);
    }

    //llenar formulario de nuevo usuario
    public void formNewUser(){
        write(addName, nameError);  
         write(addlastName, lastnameError);
         write(addEmail, emailError);
         write(addPass, passError);
    }

    //Click en botón "Registrar Usuario"
    public void ButtonnewUser() {
        clickElement(btnaddnewUser);
    }

    //mensaje de error//
    public String error() {
        String message = obtenerText("//div[contains(@class,'MuiAlert-message css-1xsto0d')]");
        return message;
    }

    //seleccionar boton cancelar
    public void ButtonCancel() {
        clickElement(btnNewuserCancel);
    }
}
