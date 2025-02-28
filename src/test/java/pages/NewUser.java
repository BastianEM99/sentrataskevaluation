package pages;

public class NewUser extends FirstPage {
    
    //xPath's//
    private String btnNewUser = "//button[@type='button']";
    private String btnNewuserCancel = "//button[contains(.,'Cancelar')]";
    private String addName = "//input[@id='firstname']";
    private String addlastName = "//input[@id='lastname']";
    private String addEmail = "(//input[@id='email'])[2]";
    private String addPass = "(//input[@id='password'])[2]";
    private String addrepeatPass = "//input[@id='repeat_password']";
    private String btnaddnewUser = "//button[contains(.,'Registrar Usuario')]";
    private String submitButton = "//button[@type='submit']";
    private String home = "//span[normalize-space()='Home']";
    private String profile = "//span[normalize-space()='Perfil']";
    private String exit = "//span[contains(.,'Salir')]";

    //variables//
    private String url = "http://192.168.80.43:10500";
    private String nombre = "Test";
    private String apellido = "Test11";
    private String correo = "elolabastiantest@gmail.com";
    private String password = "Sentra.2025";
    private String repetirpasword = "Sentra.2025";


    //Navega a la url
    public void navigateToUrl() {
        driver.manage().window().maximize();
        navigateTo(url);

    }

    //Click en botón "Nuevo Usuario" y "Cancelar"
    public void navigateToNewUser() {
        clickElement(btnNewUser);
        clickElement(btnNewuserCancel);
        clickElement(btnNewUser);
    }

    //llenar formulario de nuevo usuario
    public void formNewUser(){
        write(addName, nombre);  
         write(addlastName, apellido);
         write(addEmail, correo);
         write(addPass, password);
         write(addrepeatPass, repetirpasword);
    }

    //Click en botón "Registrar Usuario"
    public void ButtonnewUser() {
        clickElement(btnaddnewUser);
    }  

    //El usuario ha sido registrado//


    //Ingresa Email y Contraseña//
    public void login(){
        navigateTo(url);
        write(addEmail, correo);  
        write(addPass, password);    
    }

    //selecciona botones y los recorre//
    public void recoBtns(){
        clickElement(submitButton);
        clickElement(home);
        clickElement(profile);
        clickElement(exit);
    }
}

