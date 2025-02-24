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
    
    public void iButtonCompactTable() {{
        clickElement(ibtnCompactTable);
        } 
    }
}