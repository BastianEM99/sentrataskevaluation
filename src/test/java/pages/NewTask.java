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
    

    //click al botón Home
    public void ButtonHome() {{
        clickElement(btnHome);
        }      
    }
    //click en botón Nueva tarea 
    public void ButtonNewTask() {{
        clickElement(btnNewtask);
        }  
    }  
    //click en botón Cancelar
    public void ButtonCancelTask() {{
        clickElement(btnCanceltask);
        } 
    }  
    //agregar nueva tarea en campo Titulo
    public void SendTitle() {{     
        write(sendtitle,"Nueva Tarea");
        }
    }
    //agregar una descripcion
    public void SendDescription() {{
        write(senddescription,"Nueva Descripción");
        }  
    } 
    //agregar una fecha de vencimiento 
    public void SendExpiredDate() {{
        write(sendexpdate,"28-02-20250010:10:10");
        }  
    }  
    //agregar una prioridad
    public void SendPriority() {{
           write(sendpriority,"3");
        }  
    } 
    //click al botón Crear Tarea
    public void ButtonCreateNewTask() {{
            clickElement(btnCreatetask);
        }  
    }  
}
