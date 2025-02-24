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
    private String btnaddnewUser = "/html/body/div[2]/div[3]/div/div[2]/button[2]";  

    //Nuevo usuario//
    public void newLogin(String nombre, String apellido, String correo, String password, String repetirpasword){
        write(addName, nombre);  
        write(addlastName, apellido);
        write(addEmail, correo);
        write(addPass, password);
        write(addrepeatPass, repetirpasword);
    }
    //Click en botón crear un nuevo usuario
    public void ButtonNewUser() {
        clickElement(btnNewUser);
    }
    //Click en botón cancelar un nuevo usuario
    public void ButtonNewUserCancel() {
        clickElement(btnNewuserCancel);
    }
    //El usuario registra un nombre //
    public void AddName() {
        write(addName,"bastian99");
    }
    //El usuario registra un apellido //
    public void AddLastName() {
        write(addlastName,"elola99");
    }
    //El usuario registra un email //
    public void AddEmail() {
        write(addEmail,"belola@gmail.cl");
    }
    //El usuario registra una contraseña //
    public void AddPass() {
        write(addPass, "Sentra2025");
    }
    //El usuario repite la contraseña //
    public void AddRepeatPass() {
        write(addrepeatPass, "Sentra2025");
    }
    //Click en botón registrar nuevo usuario
    public void ButtonnewUser() {
        clickElement(btnaddnewUser);
    }  
}

