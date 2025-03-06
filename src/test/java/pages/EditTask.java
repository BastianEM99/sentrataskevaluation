package pages;

public class EditTask extends FirstPage {

    //variables
    private final String correo = "smartinez@sentra.cl";
    private final String password = "smart2025";
    private final String editnewtask = "Nueva Tarea Editada";
    private final String editdesc = "Nueva Descripción Editada";
    private final String editexpdate = "18-11-20250020:00:00";
    private final String editpriority = "5";

    //xPath's//
    private String btnHome = "//span[normalize-space()='Home']";
    private String btnSelectTaskOnTable = "//tbody/a[1]/td[3]"; 
    private String btnEdittask = "//button[normalize-space()='Editar Tarea']"; 
    private String btnCancelEditedtask = "//button[contains(.,'Cancelar')]"; 
    private String titleEdit ="//input[@id='title']"; 
    private String descriptionEdit = "//textarea[@id='title']";
    private String expdateEdit = "//input[@type='datetime-local']";
    private String priorityEdit= "//input[@type='number']";
    private String btnModifytask = "//button[contains(.,'Modificar Tarea')]";
    private String addEmail = "//input[@id='email']";
    private String addPass = "//input[@id='password']";
    private String submitButton = "//button[@type='submit']";
    
     //variables//
     private String url = "http://192.168.80.43:10500";

    //Navega a la url
    public void navigateToUrl() {
        navigateTo(url);
        driver.manage().window();

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

    // Click para seleccionar una nueva tarea
    public void ButtonSelectNewTask() {{
        clickElement(btnSelectTaskOnTable);
        }  
    } 
    // Click al botón "Editar Tarea"
    public void ButtonEditTask() {{
        clickElement(btnEdittask);
        }      
    }  
    // Click al botón "Cancelar"    
    public void ButtonCancelEditedTask() {{
        clickElement(btnCancelEditedtask);
        }      
    }   
    // editar el titulo de una tarea //
    public void EditTitle() {{
        write(titleEdit,editnewtask);   
        }      
    }   
    // editar una descripcion de una tarea //
    public void EditDescription() {{
        write(descriptionEdit,editdesc);
        }      
    } 
    // editar fecha vencimiento de una tarea //
    public void EditExpiredDate() {{
    write(expdateEdit,editexpdate); 
        } 
    }    
    // editar la prioridad de una tarea //
    public void EditPriority() {{
    write(priorityEdit,editpriority); 
        } 
    }   
    // CliK al botón "Modificar Tarea" //
    public void ButtonModifyTask() {{
    clickElement(btnModifytask);
        } 
    } 
}
