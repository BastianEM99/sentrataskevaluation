package pages;

public class OrderTasks extends FirstPage{

    //xPath's//
    private String btnOrderPritorityAsc = "//span[contains(.,'Prioridad')]";
    private String btnOrderPritorityDesc = "//span[contains(.,'Prioridad')]";
    private String btnOrderTittleAsc = "//span[contains(.,'Títulosorted ascending')]";
    private String btnOrderTittleDesc = "//span[contains(.,'Títulosorted descending')]";
    private String btnOrderExpiredDateAsc = "(//span[@class='MuiButtonBase-root MuiTableSortLabel-root css-7fdmwy'])[3]";
    private String btnOrderExpiredDateDesc = "(//span[@role='button'])[3]";


    private String url = "http://192.168.80.43:10500";



    //Navega a la url
    public void navigateToUrl() {
        driver.manage().window().maximize();
        navigateTo(url);

    }

    //click al botón "Prioridad" Ascemndente
    public void ButtonOrderPritorityAsc() {{
        clickElement(btnOrderPritorityAsc);
        } 
    }

    //click al botón "Prioridad" Descendente
    public void ButtonOrderPritorityDesc() {{
        clickElement(btnOrderPritorityDesc);
        } 
    }

    //click al botón "Título" Ascedente
    public void ButtonOrderTittleAsc() {{
        clickElement(btnOrderTittleAsc);
        } 
    }
    //click al botón "Título" descendente
    public void ButtonOrderTittleDesc() {{
        clickElement(btnOrderTittleDesc);
        } 
    }
    
    //click al botón "Fecha Vencimiento" ascendente
    public void ButtonOrderExpiredDateAsc() {{
        clickElement(btnOrderExpiredDateAsc);
        } 
    }
    //click al boton "Fecha Vencimiento" descendente
    public void ButtonOrderExpiredDateDesc() {{
        clickElement(btnOrderExpiredDateDesc);
        }  
    }

}
