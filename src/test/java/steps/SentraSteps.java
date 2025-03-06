package steps; 
import io.cucumber.java.en.*;
import pages.FuncSentraTask;
import pages.EditProfile;
import pages.EditTask;
import pages.EmptyPass;
import pages.NewTask;
import pages.NewUser;
import pages.LoginPage;
import pages.OrderTasks;
import pages.ValidateTable;
import pages.FirstPage;


import org.testng.asserts.SoftAssert;

public class SentraSteps {
    SoftAssert soft = new SoftAssert();
    
    FirstPage firstPage = new FirstPage();
    LoginPage loginpage = new LoginPage();
    NewUser newuser = new NewUser();
    NewTask newtask = new NewTask();
    EditTask edittask = new EditTask();
    EditProfile editprofile = new EditProfile();
    FuncSentraTask funcsentratask = new FuncSentraTask();
    OrderTasks ordertask = new OrderTasks();
    ValidateTable valid = new ValidateTable();
    EmptyPass emptyp = new EmptyPass();


    //LOGIN//

    
    //Navegar a login principal Sentra//
    @Given("As a user I navigate to the Sentra application")
    public void NavigatetoSentraTask() {
        try { Thread.sleep(2000); // 2 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        firstPage.NavigatetoSentraTask();
    }

    //Completa el campo email y contraseña en login de usuario
    @When("I fill in the fields with user {string}, password {string}")
    public void Login(String user, String password) {
        loginpage.login(user,password);
        soft.assertEquals(user, "elolabastiantest@gmail.com");
        soft.assertEquals(password, "Sentra2025");
        soft.assertAll();
    }

   //click en el botón ingresar desde el login de usuario//
    @Then("I click on the login button")
    public void ButtonSendLogin() {
        try { Thread.sleep(2000); // 2 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        loginpage.ButtonSendLogin();
    }      


    //Escribir email del usuario desde el login de usuario//
    @Then("I will write an email in the email field")
    public void SendEmail() {
        loginpage.SendEmail();
    }   

   //Escribir contraseña del usuario desde el login de usuario//
    @Then("I will write a password in the password field")
    public void SendPassword() {
        loginpage.SendPassword();
    }   
    
    //Hace click al Botón "salir" del aplicativo//
    @Then("I log out from sentratask")
    public void ButtonExit() {
        try { Thread.sleep(2000); // 2 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        funcsentratask.ButtonExit();
    
    }

     //REGISTRAR USUARIO


     @Given("I am on the login page to create a new user")
     public void navigateToUrl() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
         // Navegar a la página principal (supuesto método en la clase PaginaPrincipal)
         newuser.navigateToUrl();
     }

     @When("I press the Create new user button, then cancel and then create new user")
     public void navigateToNewUser() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        newuser.navigateToNewUser();
     }
     @Then("I complete the form with the new user data")
     public void formNewUser() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        newuser.formNewUser();
     }
     @When("I press the Register user button")
     public void ButtonnewUser() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        newuser.btnnewUser();
     }
     @When("I enter the registered email and password")
     public void login() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        newuser.login();
     }
  
    @Then("i press the button home")
        public void btnCasa(){
            try { Thread.sleep(1000); // 1 segundo de espera
            } catch (InterruptedException e) {e.printStackTrace();}
            newuser.btnCasa();
    }
     
    @Then("i press the button profile")
        public void btnPerfil(){
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
                newuser.btnPerfil();        
        
    }

    @Then("i press the button exit")
        public void btnSalir(){
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
                newuser.btnSalir(); 

    }

    //EDITAR PEFIL//



    @Given("I access the login page")
    public void iinavigateToUrl() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        editprofile.navigateToUrl();
    }
    @When("I access with email and password")
    public void iilogin() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        editprofile.login();
    }
    @Then("I click the Login button")
    public void iIngresar() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        editprofile.Ingresar();
    }
    @Then("I press the Home button")
    public void iButtonHome() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        editprofile.ButtonHome();
    }
    @Then("I press the Profile button")
    public void ButtonProfile() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        editprofile.ButtonProfile();
    }
    @Then("I press the Edit User button")
    public void ButtonDataUserEdit() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        editprofile.ButtonDataUserEdit();
    }
    @Then("I press the Cancel Form User button")
    public void ButtonDataUserCancel() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        editprofile.ButtonDataUserCancel();
    }
    @Then("I press the Edit User button again")
    public void iButtonDataUserEdit() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        editprofile.iButtonDataUserEdit();
    }
    @When("I make changes to the form fields")
    public void editForm() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        editprofile.editForm();
    }
    @Then("I press the Modify User button")
    public void ButtonUserModify() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        editprofile.ButtonUserModify();
    }
    @When("I am redirected to the next screen, I press the Change Password button")
    public void ButtonPassChange() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        editprofile.ButtonPassChange();
    }
    @Then("I press the Cancel Form button")
    public void ButtonCancelPassChange() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        editprofile.ButtonCancelPassChange();
    }
    @Then("I press the Change Password Main button")
    public void iButtonPassChange() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        editprofile.iButtonPassChange();
    }
    @When("I change the password")
    public void changePass() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        editprofile.changePass();
    }
    @Then("I press the Save Password Change button")
    public void iiButtonPassChange(){
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        editprofile.iiButtonPassChange();
    }
    @Then("I click the Logout button and it takes me to the login screen")
    public void Exit() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        editprofile.Exit();
    }
    @When("I enter the email and password again")
    public void newlogin() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        editprofile.newlogin();
    }
    @Then("I click the Login button again")
    public void newIngresar() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        editprofile.newIngresar();
    }





    //CREAR TAREA



    @Given("I enter the main page")
    public void inavigateToUrl() {
        // Navegar a la página principal (supuesto método en la clase PaginaPrincipal)
        newtask.navigateToUrl();
    }
    @When("I fill in the fields with the email and password")
    public void ilogin() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        newtask.login();
    }
    @Then("I click the login button")
    public void Ingresar() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        newtask.Ingresar();
    }
    @Then("I click the Home button")
    public void ButtonHome() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        newtask.ButtonHome();
    }
    @Then("I click the New Task button")
    public void ButtonNewTask() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        newtask.ButtonNewTask();
    }
    @Then("I click the cancel button")
    public void ButtonCancelTask() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        newtask.ButtonCancelTask();
    }
    @Then("I click the new task button")
    public void iButtonNewTask() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        newtask.iButtonNewTask();
    }
    @When("I complete the form fields")
    public void formTask() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        newtask.formTask();
    }
    @Then("I click the Create Task button")
    public void ButtonCreateTask() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        newtask.ButtonCreateTask();
    }
    @Then("I click the Logout button and leave the page")
    public void ExitTask() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        newtask.Exit();
    }




    //EDITAR TAREAS

    @When("I fill in the fields with the email and password with modified credentials")
    public void iiilogin() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        edittask.login();
    }
    @Then("I click on the login button with modified credentials")
    public void iiiIngresar() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        edittask.Ingresar();
    }

    
    //Hace clic al botón "Tareas"//
    @When("^I enter a task$")
    public void ButtonSelectNewTask() {
        try { Thread.sleep(2000); // 2 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        edittask.ButtonSelectNewTask();
    }
    //Hace clic al botón "Editar tarea"//
    @When("^I click on the edit task button$")
    public void ButtonEditTask() {
        try { Thread.sleep(2000); // 2 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        edittask.ButtonEditTask();
    }
    
    //Hace clic al botón "Cancelar" desde "editar tarea"//
    @Then("^I click on the cancel button located in edit task$")
    public void ButtonCancelEditedTask() {
        try { Thread.sleep(2000); // 2 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        edittask.ButtonCancelEditedTask();
    }
  
    //Método para editar el campo título//
    @Then("^I will edit the title field$")
    public void EditTitle() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        edittask.EditTitle();
    }
    
    //Método para editar el campo descripción//
    @Then("^I will edit the description field$")
    public void EditDescription() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        edittask.EditDescription();
    }
   
    //Método para editar el campo fecha de vencimiento//
    @Then("^I will edit the due date field$")
    public void EditExpiredDate() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        edittask.EditExpiredDate();
    }
    
    //Método para editar el campo prioridad//
    @Then("^I will edit the priority field$")
    public void EditPriority() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        edittask.EditPriority();
    }
   
    //Hace clic al botón "Modificar tarea"//
    @Then("^I click on the modify task button$")
    public void ButtonModifyTask() {
        try { Thread.sleep(2000); // 2 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        edittask.ButtonModifyTask();
    }


    // ORDER

    //Hace clic al botón "Ordenar titulos Ascendente"//
    @When("^I click on the Title column to sort in ascending order$")
    public void ButtonOrderTittleAsc() {
        try { Thread.sleep(2000); // 2 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
            ordertask.ButtonOrderTittleAsc();
    }
    
    //Hace clic al botón "Ordenar titulos descendente"//
    @Then("^I click on the Title column to sort in descending order$")
    public void ButtonOrderTittleDesc() {
        try { Thread.sleep(2000); // 2 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
            ordertask.ButtonOrderTittleDesc();
    }

    //Hace clic al botón "Ordenar prioridad ascendente"//
    @When("^I click on the Priority column to sort in ascending order$")
    public void ButtonOrderPritorityAsc() {
        try { Thread.sleep(2000); // 2 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
            ordertask.ButtonOrderPritorityAsc();
    }
    
    //Hace clic al botón "Ordenar prioridad descendente"//
    @Then("^I click on the Priority column to sort in descending order$")
    public void ButtonOrderPritorityDesc() {
        try { Thread.sleep(2000); // 2 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
            ordertask.ButtonOrderPritorityDesc();
    }

    //Hace clic al botón "Ordenar fecha de vencimiento ascendente"//
    @When("^I click on the Due Date column to sort in ascending order$")
    public void ButtonOrderExpiredDateAsc() {
        try { Thread.sleep(2000); // 2 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
            ordertask.ButtonOrderExpiredDateAsc();
    }
    
    //Hace clic al botón "Ordenar fecha de vencimiento descendente"//
    @Then("^I click on the Due Date column to sort in descending order$")
    public void ButtonOrderExpiredDateDesc() {
        try { Thread.sleep(2000); // 2 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
            ordertask.ButtonOrderExpiredDateDesc();
    }

    //Funciones de la pagina
    
    //Hace clic al botón "Colapsar"//
    @Then("^I click on the more button in sentraTask$")
    public void ButtonMore() {
        try { Thread.sleep(2000); // 2 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
            funcsentratask.ButtonMore();
    }
    
    //Hace clic al botón "Treeline"//
    @Then("^I click on the treeline button to show sentraTask view$")
    public void ButtonTreeline() {
        try { Thread.sleep(2000); // 2 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
            funcsentratask.ButtonTreeline();
    }
    
    //Hace clic al botón "Compact table"//
    @Then("^I click on the compact table button$")
    public void ButtonCompactTable() {
        try { Thread.sleep(2000); // 2 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        funcsentratask.ButtonCompactTable();
    }
    
    //Hace clic al botón "Compact table" nuevamente//
    @Then("^I click on the compact table button again$")
    public void iButtonCompactTable() {
        try { Thread.sleep(2000); // 2 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        funcsentratask.iButtonCompactTable();
    }
    
    //Hace clic al botón "Tareas por pagina"//
    @Then("^I click on the tasks per page button$")
    public void ButtonTasks() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        funcsentratask.ButtonTasks();
    }
    
    //Hace clic al botón "Tareas por pagina" seleccionando la opción 5//
    @Then("^I click on the tasks per page button selecting the option 5$")
    public void ButtonPage1() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        funcsentratask.ButtonPage1();
    }
    
    //Hace clic al botón "Tareas por pagina" seleccionando la opción 10//
    @Then("^I click on the tasks per page button selecting the option 10$")
    public void ButtonPage2() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        funcsentratask.ButtonPage2();
    }
  
    //Hace clic al botón "Tareas por pagina" seleccionando la opción 20//
    @Then("^I click on the tasks per page button selecting the option 20$")
    public void ButtonPage3() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        funcsentratask.ButtonPage3();
    }

    //Validar tabla

    //Validar si existe la tabla
    @Then ("^views the task table$")
    public void ViewTable() {
        
        boolean isPresente = valid.CheckTable();
        soft.assertTrue(isPresente, "No se encuentra la tabla");
        soft.assertAll();
    }

    //Selecciona el botón de salir
    @Then ("selects logout")
    public void SelectedExit() {
        try { Thread.sleep(2000); // 2 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        valid.ClickButtonSalir();
    }




        //ERROR PASS 

    @Given("I enter the main page of Sentra Task")
    public void iiinavigateToUrl() {try { Thread.sleep(1000); // 1 segundo de espera
    } catch (InterruptedException e) {e.printStackTrace();}
        emptyp.navigateToUrl();
    }
    @When("I go to create a new user")
    public void NewUser() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        emptyp.NewUser();
    }
    @Then("I complete the form, except for repeating the password")
    public void iformNewUser() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        emptyp.formNewUser();
    }
    @Then("I select the register user button and an error is displayed")
    public void iButtonnewUser() {
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        emptyp.ButtonnewUser();
        
    }
    @Then("the message {string} should appear")
    public void error(String mensajeEsperado) throws InterruptedException {
        emptyp.error();
        soft.assertEquals("Contraseña no coinciden", mensajeEsperado);
        Thread.sleep(3000);
    }
    @Then("I select the cancel button and return to the login")
    public void ButtonCancel(){
        try { Thread.sleep(1000); // 1 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        emptyp.ButtonCancel();
    }



}

    