package pages;

public class NewTask extends FirstPage {
    
    //xPath's//
    private String btnHome = "//span[normalize-space()='Home']";
    private String btnNewtask = "//button[normalize-space()='Nueva Tarea']";
    private String btnCanceltask = "//button[contains(.,'Cancelar')]"; 
    private String sendtitle ="//input[@id='title']";  
    private String senddescription ="//textarea[@id='title']";
    private String sendexpdate ="//input[@type='datetime-local']";
    private String sendpriority ="//input[@type='number']";
    private String btnCreatetask = "//button[contains(.,'Crear Tarea')]"; 
    private String addEmail = "(//input[@id='email'])[2]";
    private String addPass = "(//input[@id='password'])[2]";
    private String submitButton = "//button[@type='submit']";
    private String exit = "//span[contains(.,'Salir')]";
    private String perfil ="//span[normalize-space()='Përfil']";


    //variables//
    private String url = "http://192.168.80.43:10500";
    private String title = "Nueva Tarea";
    private String description = "Nueva Descripción";
    private String expdate = "28-02-20250010:10:10";
    private String priority = "3";
    private String correo = "elolabastiantest@gmail.com";
    private String password = "Sentra.2025";
    
    

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
    
    //click al botón Home
    public void ButtonHome() {
        clickElement(btnHome);
             
    }
    //click en botón Nueva tarea 
    public void ButtonNewTask() {
        clickElement(btnNewtask);
          
    }  
    //click en botón Cancelar
    public void ButtonCancelTask() {
        clickElement(btnCanceltask);
        
    } 

    //click en botón Nueva tarea 
    public void iButtonNewTask() {
        clickElement(btnNewtask);
        
    }

    //llenar formulario de nueva tarea
    public void formTask(){
        write(sendtitle, title);  
        write(senddescription, description);
        write(sendexpdate, expdate);
        write(sendpriority, priority);
    }

    //Click en botón "Crear Tarea"
    public void ButtonCreateTask() {
        clickElement(btnCreatetask);
    }

    public void Perfilamiento(){
        clickElement(perfil);
    }

    //selecciona boton salir
    public void Exit(){
        clickElement(exit);
    }
} 
    

