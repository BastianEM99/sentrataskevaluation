# CREADO POR BASTIAN ELOLA MORENO
# SentraTaskTest

Este proyecto contiene pruebas automatizadas para la aplicación Sentra. A continuación se presenta una breve descripción de los archivos y sus funcionalidades.

## Archivos de Características

### /build/resources/test/SentraTask.feature
Este archivo contiene los escenarios de características escritos en lenguaje Gherkin para probar varias funcionalidades dentro de la aplicación Sentra. Los escenarios incluyen:
- Crear un nuevo usuario
- Inicio de sesión de usuario
- Crear una nueva tarea
- Editar una tarea
- Modificar el perfil del usuario
- Cambiar la contraseña
- Probar funcionalidades de la interfaz de usuario
- Ordenar tareas
- Verificar la existencia de una tabla de tareas
- Manejar errores al crear un usuario
- Cerrar sesión

## Archivos Java

### /src/test/java/pages/BasePage.java
Este archivo contiene la clase `BasePage` que proporciona métodos comunes para interactuar con elementos web, como hacer clic en elementos, escribir texto y seleccionar de listas desplegables. También maneja la configuración y navegación del navegador.

### /src/test/java/pages/FirstPage.java
Este archivo contiene la clase `FirstPage` que extiende `BasePage`. Incluye métodos para navegar a la aplicación Sentra y maximizar la ventana del navegador.

### /src/test/java/pages/LoginPage.java
Este archivo contiene la clase `LoginPage` que extiende `FirstPage`. Incluye métodos para navegar a la página de inicio de sesión, ingresar el correo electrónico y la contraseña, y hacer clic en el botón de inicio de sesión.

### /src/test/java/pages/NewUser.java
Este archivo contiene la clase `NewUser` que extiende `FirstPage`. Incluye métodos para crear un nuevo usuario, completar los detalles del usuario y hacer clic en los botones para crear o cancelar un nuevo usuario.

### /src/test/java/pages/NewTask.java
Este archivo contiene la clase `NewTask` que extiende `FirstPage`. Incluye métodos para crear una nueva tarea, completar los detalles de la tarea y hacer clic en los botones para crear o cancelar una nueva tarea.

### /src/test/java/pages/EditTask.java
Este archivo contiene la clase `EditTask` que extiende `FirstPage`. Incluye métodos para seleccionar y editar una tarea existente, modificar los detalles de la tarea y hacer clic en los botones para guardar o cancelar los cambios.

### /src/test/java/pages/EditProfile.java
Este archivo contiene la clase `EditProfile` que extiende `FirstPage`. Incluye métodos para navegar a la página de perfil, editar los detalles del usuario, cambiar la contraseña y hacer clic en los botones para guardar o cancelar los cambios.

### /src/test/java/pages/OrderTasks.java
Este archivo contiene la clase `OrderTasks` que extiende `FirstPage`. Incluye métodos para ordenar tareas por prioridad, título y fecha de vencimiento en orden ascendente o descendente.

### /src/test/java/pages/FuncSentraTask.java
Este archivo contiene la clase `FuncSentraTask` que extiende `FirstPage`. Incluye métodos para interactuar con varios elementos de la interfaz de usuario, como colapsar vistas, navegar por páginas y cerrar sesión.

### /src/test/java/pages/ValidateTable.java
Este archivo contiene la clase `ValidateTable` que extiende `BasePage`. Incluye métodos para verificar la existencia de una tabla de tareas en la aplicación Sentra, así como para navegar, iniciar sesión y cerrar sesión.

### /src/test/java/steps/SentraSteps.java
Este archivo contiene la clase `SentraSteps` que define los pasos de Cucumber para los escenarios de prueba. Incluye métodos para interactuar con las páginas y realizar acciones específicas en la aplicación Sentra.

### /src/test/java/runner/TestRunner.java
Este archivo contiene la clase `TestRunner` que configura y ejecuta las pruebas de Cucumber. Incluye opciones para especificar la ubicación de los archivos de características y los pasos, así como para generar informes de resultados.

## Cómo Ejecutar las Pruebas

1. Asegúrese de tener Java
2. Clone el repositorio en su máquina local.
3. Navegue al directorio del proyecto.
4. Ejecute las pruebas usando el siguiente comando:
   ```sh
   gradle test
   ```

## Dependencias

- Selenium WebDriver
- WebDriverManager

## Licencia

Este proyecto está licenciado bajo la Licencia MIT.
