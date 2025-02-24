package steps; 
import io.cucumber.java.en.*;
import pages.FuncSentraTask;
import pages.EditProfile;
import pages.EditTask;
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

     //Registrar nuevo usuario
    @Then("I fill in the new user fields with name {string}, last name {string}, email {string}, password {string}, repeat password {string}")
    public void newLogin(String nombre,String apellido,String correo,String password,String repetirpasword) {
        newuser.newLogin(nombre, apellido,correo,password,repetirpasword);
    }
    //Hace click al botón "REGISTRAR USUARIO"
    @Then("I click on the register user button")
    public void ButtonnewUser() {
        try { Thread.sleep(2000); // 2 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        newuser.ButtonnewUser();
    }
    //Iniciar Sesion//
    //Completa el campo email y contraseña en login de usuario
    @When("I fill in the fields with user {string}, password {string}")
    public void Login(String user, String password) {
        loginpage.login(user,password);
        soft.assertEquals(user, "belola@gmail.cl");
        soft.assertEquals(password, "Sentra2025");
        soft.assertAll();
    }
    //Navegar a login principal Sentra//
    @Given("As a user I navigate to the Sentra application")
    public void NavigatetoSentraTask() {
        try { Thread.sleep(2000); // 2 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        firstPage.NavigatetoSentraTask();
    }

   //click en el botón ingresar desde el login de usuario//
    @Then("I click on the login button")
    public void ButtonSendLogin() {
        try { Thread.sleep(2000); // 2 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        loginpage.ButtonSendLogin();
    }   

    //click en botón crear un nuevo usuario desde el login de usuario//
    @When("^I click on the create new user button$")
    public void ButtonNewUser() {
        try { Thread.sleep(2000); // 2 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        newuser.ButtonNewUser();
    }

    //click en botón cancelar un nuevo usuario desde el login de usuario //
    @Then("^I click on the cancel button within register user$")
    public void ButtonNewUserCancel() {
        try { Thread.sleep(2000); // 2 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        newuser.ButtonNewUserCancel();
    } 

    // El usuario registra un nombre //
    @Then("^I will register the name$")
    public void AddName() {
        newuser.AddName();
    } 
     
    // El usuario registra un apellido //
    @Then("^I will register the last name$")
    public void AddLastName() {
        newuser.AddLastName();
    }    
    // El usuario registra un email //
    @Then("^I will register the email$")
    public void AddEmail() {
        newuser.AddEmail();
    } 
   
    // El usuario registra una password //
    @Then("^I will register a password$")
    public void AddPass() {
        newuser.AddPass();
    } 

    // El usuario repíte la password //
    @Then("^I will repeat the password$")
    public void AddRepeatPass() {
        newuser.AddRepeatPass();
    } 

    //Escribir email del usuario desde el login de usuario//
    @Then("^I will write an email in the email field$")
    public void SendEmail() {
        loginpage.SendEmail();
    }   

   //Escribir contraseña del usuario desde el login de usuario//
    @Then("^I will write a password in the password field$")
    public void SendPassword() {
        loginpage.SendPassword();
    }   
    
    //Hace click al Botón "salir" del aplicativo//
    @Then("^I log out from sentratask$")
    public void ButtonExit() {
        try { Thread.sleep(2000); // 2 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        funcsentratask.ButtonExit();
    }

    //Editar Perfil (LoginEditarPerfil)  //
    //Hace clic al botón PERFIL ubicado//
    @When("^As a user I go to Profile$")
    public void ButtonProfile() {
        try { Thread.sleep(2000); // 2 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        editprofile.ButtonProfile();
    }

    //Hace clic al botón "editar datos usuario"//
    @Then("^From Profile I click on Edit user data$")
    public void ButtonDataUserEdit() {
        try { Thread.sleep(2000); // 2 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        editprofile.ButtonDataUserEdit();
    }
    
    //Hace clic al botón "cancelar" desde "editar datos usuario"//
    @Then("^I click on the cancel button within user data modification$")
    public void ButtonDataUserCancel() {
        try { Thread.sleep(2000); // 2 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        editprofile.ButtonDataUserCancel();
    }
    
    //Método para modificar nombre del usuario//
    @Then("^I will edit the name field in profile$")
    public void EditName() {
        editprofile.EditName();
    }
    
    //Método para modificar nombre del apellido//
    @Then("^I will edit the last name field in profile$")
    public void EditLastName() {
        editprofile.EditLastName();
    }
    
    //Método para modificar nombre del email//
    @Then("^I will edit the email field in profile$")
    public void EditarEmail() {
        editprofile.EditEmail();
    }
    
    //Hace clic al botón "Modificar usuario" desde "editar datos usuario"//
    @Then("^I click on the modify user button$")
    public void ButtonUserModify() {
        try { Thread.sleep(2000); // 2 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        editprofile.ButtonUserModify();
    }
     
    //Hace clic al botón "Cambiar contraseña" desde "editar datos usuario"//
    @Then("^From Profile I click on change password$")
    public void ButtonPassChange() {
        try { Thread.sleep(2000); // 2 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        editprofile.ButtonPassChange();
    }
   
    //Hace clic al botón "Cancelar" desde "cambiar contraseña"//
    @Then("^I click on the cancel button within change password$")
    public void ButtonCancelPassChange() {
        try { Thread.sleep(2000); // 2 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        editprofile.ButtonCancelPassChange();
    }
    
    //Método para escribir contraseña en el campo "Escribe tu contraseña"//
    @Then("^I will write in the field Write your password$")
    public void campWritePass() {
        editprofile.campWritePass();
    }
    
    //Método para escribir contraseña en el campo "Repite tu contraseña"//
    @Then("^I will write in the field Repeat your password$")
    public void campRepeatPass() {
        editprofile.campRepeatPass();
    }
    
    //Hace clic al botón "Cambiar contraseña"
    @Then("^I click on the change password button$")
    public void iButtonPassChange() {
        try { Thread.sleep(2000); // 2 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        editprofile.iButtonPassChange();
    }
    
    //Hace clic para Crear Tarea//
    @When("^I click on create new task$")
    public void ButtonNewTask() {
        try { Thread.sleep(2000); // 2 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        newtask.ButtonNewTask();
    }
     
    //Hace clic al botón "Cancelar" desde "crear tarea"//
    @Then("^I click on the cancel button of a new task$")
    public void ButtonCancelTask() {
        try { Thread.sleep(2000); // 2 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        newtask.ButtonCancelTask();
    }
    
    //Escribe en el campo título//
    @Then("^I will write in the title field$")
    public void SendTitle() {
        newtask.SendTitle();
    }
    
    //Escribe en el campo descripción//
    @Then("^I will write a description$")
    public void SendDescription() {
        newtask.SendDescription();
    }
 
    //Escribe en el campo fecha de vencimiento//
    @Then("^I will register a due date$")
    public void SendExpiredDate() {
        newtask.SendExpiredDate();
    }
    
    //Escribe en el campo prioridad//
    @Then("^I will set a priority$")
    public void SendPriority() {
        newtask.SendPriority();
    }
  
    //Hace clic al botón "Crear tarea"//
    @Then("^I click on the create task button$")
    public void ButtonCreateNewTask() {
        try { Thread.sleep(2000); // 2 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        newtask.ButtonCreateNewTask();
    }
  
    //Hace clic al botón "Home"//
    @When("As a user I go to Home")
    public void ButtonHome() {
        try { Thread.sleep(2000); // 2 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        newtask.ButtonHome();
    }
    
    //Hace clic al botón "Tareas"//
    @When("^I enter a created task$")
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
        edittask.EditTitle();
    }
    
    //Método para editar el campo descripción//
    @Then("^I will edit the description field$")
    public void EditDescription() {
        edittask.EditDescription();
    }
   
    //Método para editar el campo fecha de vencimiento//
    @Then("^I will edit the due date field$")
    public void EditExpiredDate() {
        edittask.EditExpiredDate();
    }
    
    //Método para editar el campo prioridad//
    @Then("^I will edit the priority field$")
    public void EditPriority() {
        edittask.EditPriority();
    }
   
    //Hace clic al botón "Modificar tarea"//
    @Then("^I click on the modify task button$")
    public void ButtonModifyTask() {
        try { Thread.sleep(2000); // 2 segundo de espera
        } catch (InterruptedException e) {e.printStackTrace();}
        edittask.ButtonModifyTask();
    }

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
        funcsentratask.ButtonTasks();
    }
    
    //Hace clic al botón "Tareas por pagina" seleccionando la opción 5//
    @Then("^I click on the tasks per page button selecting the option 5$")
    public void ButtonPage1() {
        funcsentratask.ButtonPage1();
    }
    
    //Hace clic al botón "Tareas por pagina" seleccionando la opción 10//
    @Then("^I click on the tasks per page button selecting the option 10$")
    public void ButtonPage2() {
        funcsentratask.ButtonPage2();
    }
  
    //Hace clic al botón "Tareas por pagina" seleccionando la opción 20//
    @Then("^I click on the tasks per page button selecting the option 20$")
    public void ButtonPage3() {
        funcsentratask.ButtonPage3();
    }

    //Valida la informacion de login
    @Given("^user correctly enters their data$")
    public void userCorrectlyEntersTheirData() {
        valid.LoginEmailPassword();
    }

    //Selecciona el botón de login
    @When("^selects the login button$")
    public void Selectedloggin() {
        valid.ClickButtonLogin();
    }

    //Selecciona el botón de home
    @Then("^selects the home button within the application$")
    public void SelectedHome() {
        valid.ClickButtonHome();
    }

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



}

    