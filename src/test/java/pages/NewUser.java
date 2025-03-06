package pages;

public class NewUser extends FirstPage {
    
    //xPath's//
    private String btnNewUser = "//button[@type='button']";
    private String btnNewuserCancel = "//button[contains(.,'Cancelar')]";
    private String addName = "//input[@id='firstname']";
    private String addlastName = "//input[@id='lastname']";
    private String addEmail1 = "(//input[@id='email'])[1]";
    private String addEmail = "(//input[@id='email'])[2]";
    private String addPass1 = "(//input[@id='password'])[1]";
    private String addPass = "(//input[@id='password'])[2]";
    private String addrepeatPass = "//input[@id='repeat_password']";
    private String btnaddnewUser = "//button[normalize-space()=\"Registrar Usuario\"]";
    private String submitButton = "//button[@type='submit']";
    //private String home = "//span[normalize-space()='Home']";
    private String home = "//a[@href='/home']";
    private String profile = "//a[@href='/perfil']";
    private String exit = "//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-yb0lig']";

    //variables//
    private String url = "http://192.168.80.43:10500";
    private String nombre = "juan";
    private String apellido = "ito";
    private String correo = "juanito@gmail.com";
    private String password = "juanito123";
    private String repetirpasword = "juanito123";


    //Navega a la url
    public void navigateToUrl() {
        navigateTo(url);
        driver.manage().window();

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
    public void btnnewUser() {
        clickElement(btnaddnewUser);
    }  

    //El usuario ha sido registrado//


    //Ingresa Email y Contraseña//
    public void login(){
        navigateTo(url);
        write(addEmail1, correo);  
        write(addPass1, password);
        clickElement(submitButton);    
    }

    // //selecciona botones y los recorre//
    // public void recoBtns(){
    //     clickElement(home);
    //     clickElement(profile);
    //     clickElement(exit);
    // }
    public void btnCasa(){
        clickElement(home);
    }
    public void btnPerfil(){
        clickElement(profile);
    }
    public void btnSalir(){
        clickElement(exit);
    }

}

