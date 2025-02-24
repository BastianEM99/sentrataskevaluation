package pages;

public class EditProfile extends FirstPage{

    //xPath's//
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


    //click al botón "Perfil" 
    public void ButtonProfile() {{
        clickElement(btnProfile);
        }          
    } 
    //click al botón "Editar datos usuario"
    public void ButtonDataUserEdit() {{
        clickElement(btnDataUserEdit);
        }  
    }
    //click al botón "Cancelar"
    public void ButtonDataUserCancel() {{
        clickElement(btnDataUserCancel);
        } 
    }   
    //modificar nombre
    public void EditName() {{
        write(Editname,"BastianA"); 
        }       
    }
    //modificar apellido
    public void EditLastName() {{
        write(EditlastName,"ElolaM"); 
        }       
    }
    //modificar email 
    public void EditEmail() {{
        write(Editemail,"belola@gmail.cl"); 
        }       
    }  
    //click al botón "Modificar user"                
    public void ButtonUserModify() {{
            clickElement(btnUserModify);
        } 
    }    
     //click al btn cambiar contraseña
    public void ButtonPassChange() {{
        clickElement(btnPassChange);
        } 
    }
    //click al botón "Cancelar" 
    public void ButtonCancelPassChange() {{
        clickElement(btnCancelPassChange);
        } 
    }
    //escribir contraseña en modal
    public void campWritePass() {{
        write(campwritepass,"Sentra2025");
        } 
    }
    //repetir la contraseña
    public void campRepeatPass() {{
        write(camprepeatpass,"Sentra2025");
        } 
    }
    //click al btn cambiar contraseña
    public void iButtonPassChange() {{
        clickElement(ibtnPassChange);
        } 
    }

}
