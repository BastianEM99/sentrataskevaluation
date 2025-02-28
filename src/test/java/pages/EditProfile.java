package pages;

import org.testng.asserts.SoftAssert;

public class EditProfile extends FirstPage{

    SoftAssert soft = new SoftAssert();

    //xPath's//
    private String addEmail = "(//input[@id='email'])[2]";
    private String addPass = "(//input[@id='password'])[2]";
    private String btnProfile = "//span[normalize-space()='Perfil']";
    private String btnDataUserEdit = "//button[contains(.,'Editar Datos Usuario')]";
    private String btnDataUserCancel = "//button[contains(.,'Cancelar')]"; 
    private String Editname = "//*[@id='firstname']";
    private String EditlastName = "//input[@id='lastname']";
    private String Editemail = "//input[@id='email']";
    private String btnUserModify = "//button[contains(.,'Modificar Usuario')]";
    private String btnPassChange = "//button[contains(.,'Cambiar Contraseña')]";
    private String btnCancelPassChange = "//button[contains(.,'Cancelar')]";
    private String campwritepass = "//input[@id='password']";
    private String camprepeatpass = "//input[@id='repeat_password']";
    private String ibtnPassChange = "(//button[contains(.,'Cambiar Contraseña')])[2]";
    private String submitButton = "//button[@type='submit']";
    private String btnHome = "//span[normalize-space()='Home']";
    private String exit = "//span[contains(.,'Salir')]";

    //variables//
    private String url = "http://192.168.80.43:10500";
    private String correo = "elolabastiantest@gmail.com";
    private String password = "Sentra.2025";
    private String newnombre = "Simon";
    private String newapellido = "Martinez";
    private String newemail = "Smartinez@sentra.cl";
    private String newpass = "smart2025";
    private String newpassrepeat = "smart2025";




    //Navega a la url
    public void navigateToUrl() {
        driver.manage().window().maximize();
        navigateTo(url);

    }

    //Ingresa Email y Contraseña//
    public void login(){
        navigateTo(url);
        write(addEmail, correo);  
        write(addPass, password);    
    }
    //Click en botón "Ingresar"
    public void Ingresar(){
        clickElement(submitButton);
    }

    //click al botón "Home"
    public void ButtonHome() {
        clickElement(btnHome);        
    }

    //click al botón "Perfil" 
    public void ButtonProfile() {
        clickElement(btnProfile);
                  
    } 

    //click al botón "Editar datos usuario"
    public void ButtonDataUserEdit() {
        clickElement(btnDataUserEdit);      
    }

    //click al botón "Cancelar"
    public void ButtonDataUserCancel() {
        clickElement(btnDataUserCancel);       
    }

    //click al botón "Editar datos usuario"
    public void iButtonDataUserEdit() {
        clickElement(btnDataUserEdit);
    }

    //se editan los campos del form
    public void editForm(){
        write(Editname, newnombre);  
        write(EditlastName, newapellido);
        write(Editemail, newemail);
    }

    //click al botón "Modificar user"                
    public void ButtonUserModify() {{
            clickElement(btnUserModify);
        } 
    }    
     //click al btn cambiar contraseña
    public void ButtonPassChange() {
        clickElement(btnPassChange);
        
    }
    //click al botón "Cancelar" 
    public void ButtonCancelPassChange() {
        clickElement(btnCancelPassChange);
        
    }

    //click al btn cambiar contraseña
    public void iButtonPassChange() {
        clickElement(btnPassChange);
        
    }

    //se editan los campos en el formulario contraseña
    public void changePass(){
        write(campwritepass, newpass);
        write(camprepeatpass, newpassrepeat);
        soft.assertEquals(newpass, newpassrepeat);
    }
    
    //click al btn cambiar contraseña
    public void iiButtonPassChange() {
        clickElement(ibtnPassChange);
        
    }

     //selecciona boton salir
     public void Exit(){
        clickElement(exit);
    }

}
