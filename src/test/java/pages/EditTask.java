package pages;

public class EditTask extends FirstPage {

    //xPath's//
    private String btnNewTaskselect = "(//td[contains(.,'Nueva Tarea')])[1]"; 
    private String btnEdittask = "(//button[@type='button'])[3]"; 
    private String btnCancelEditedtask = "//button[contains(.,'Cancelar')]"; 
    private String titleEdit ="//input[@id='title']"; 
    private String descriptionEdit = "//textarea[@id='title']";
    private String expdateEdit = "//input[@type='datetime-local']";
    private String priorityEdit= "//input[@type='number']";
    private String btnModifytask = "//button[contains(.,'Modificar Tarea')]";
    

    // Click para seleccionar una nueva tarea
    public void ButtonSelectNewTask() {{
        clickElement(btnNewTaskselect);
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
        write(titleEdit,"Nueva Tarea Editada");   
        }      
    }   
    // editar una descripcion de una tarea //
    public void EditDescription() {{
        write(descriptionEdit,"Nueva Descripción Editada");
        }      
    } 
    // editar fecha vencimiento de una tarea //
    public void EditExpiredDate() {{
    write(expdateEdit,"18-11-20250020:00:00"); 
        } 
    }    
    // editar la prioridad de una tarea //
    public void EditPriority() {{
    write(priorityEdit,"5"); 
        } 
    }   
    // CliK al botón "Modificar Tarea" //
    public void ButtonModifyTask() {{
    clickElement(btnModifytask);
        } 
    } 
}
