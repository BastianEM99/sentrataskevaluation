package pages;


public class FuncSentraTask extends FirstPage {


    //xPath's//
    private String btnMore = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yxmbwk']//*[name()='svg']";
    private String btnTreeline = "//button[@aria-label='open drawer']//*[name()='svg']";
    private String btnCompactTable = "//input[@type='checkbox']";
    private String ibtnCompactTable = "//input[@type='checkbox']";
    private String btnTasks = "//div[@id=':r4:']";
    private String btnTaskPage1 = "//*[@id=\":r6:\"]/li[1]";
    private String btnTaskPage2 = "//*[@id=\":r6:\"]/li[2]";
    private String btnTaskPage3 = "//*[@id=\":r6:\"]/li[3]";
    private String btnExit = "//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-yb0lig']";
    private String addEmail = "//input[@id='email']";
    private String addPass = "//input[@id='password']";
    private String submitButton = "//button[@type='submit']";

    private String url = "http://192.168.80.43:10500";
    private String correo = "smartinez@sentra.cl";
    private String password = "smart2025";



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

    //clic al botón " < " 
    public void ButtonMore() {{
        clickElement(btnMore);
        } 
    }
    //clic al botón " ☰ " 
    public void ButtonTreeline() {{
        clickElement(btnTreeline);
        } 
    }
    //clic al botón "Tabla Compacta" 
    public void ButtonCompactTable() {{
        clickElement(btnCompactTable);
        } 
    }
    //clic al botón "Tabla Compacta" nuevamente
    public void iButtonCompactTable() {{
        clickElement(ibtnCompactTable);
        } 
    }
    //clic al botón "Tareas por Paginas" 
    public void ButtonTasks() {{
        clickElement(btnTasks);
        } 
    }
    //clic al botón "Tareas por Pagina, Opcion 1"
    public void ButtonPage1() {{
        clickElement(btnTaskPage1);
        } 
    }
    //clic al botón "Tareas por Pagina, Opcion 2"
    public void ButtonPage2() {{
        clickElement(btnTaskPage2);
        } 
    }
    //clic al botón "Tareas por Pagina, Opcion 3"
    public void ButtonPage3() {{
        clickElement(btnTaskPage3);
        } 
    }
    //Hace clic al Botón "salir"
    public void ButtonExit() {{
        clickElement(btnExit);
        }
    }
    
    
}