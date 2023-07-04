import java.util.Scanner;

public class Menus {
    Scanner input = new Scanner(System.in);
    int opcion;
    public void menuBienvenida() {
        System.out.println("Bienvenido, seleccione a continuacion una de las opciones:");
        System.out.println("Si desea ingresar a la lista de empleados ingrese: 1");
        System.out.println("Si desea ingresar a la seccion de contratacion ingrese: 2");
        System.out.println("Si desea ingresar a la sección de terminacion de contrato ingrese: 3");
        System.out.println("Si desea ingresar a la seccion de modificacion de sueldo ingrese: 4");
        System.out.println("Si desea salir del programa puede ingresar cualquier otro caracter/numero");
        System.out.println();

        opcion = input.nextInt();

        switch (opcion) {
            case 1:
                menuListaEmpleados();
                break;
            case 2:
                menuContrataciones();
                break;
            case 3:
                menuDespedir();
                break;
            case 4:
                menuModificarSalario();
                break;
            default:
                System.out.println("Hasta luego");
                break;
        }
    }
    public void menuListaEmpleados() {
        Empleados listaEmplados = new Empleados();
        System.out.println("A continuacion se muestra la lista de empleados actuales");
        listaEmplados.nombreEmpleados();

        System.out.println("Si desea regresar al menu principal ingrese: 1");
        System.out.println("Si desea salir del programa, ingrese cualquier otro caracter/numero");

        opcion = input.nextInt();

        switch (opcion) {
            case 1:
                menuBienvenida();
                break;
            default:
                System.out.println("Hasta luego");
                break;
        }
    }
    public void menuContrataciones() {
        System.out.println("Si desea registrar un nuevo empleado contratado ingrese: 1");
        System.out.println("Si desea regresar al menu principal ingrese: 2");
        System.out.println("Si desea salir del programa puede ingresar cualquier otro caracter/numero");

        opcion = input.nextInt();

        switch (opcion) {
            case 1:
                subMenuContrataciones();
                break;
            case 2:
                menuBienvenida();
                break;
            default: System.out.println("Hasta luego");
            break;
        }
    }
    public void subMenuContrataciones() {
        System.out.println("Ingrese el nombre del empleado");
        System.out.println("Ingrese la edad del empleado");
        System.out.println("Ingrese el salario del empleado");

        opcion = input.nextInt();

        switch (opcion) {
        }
    }
    public void menuDespedir() {
        Empleados empleados1 = new Empleados(); // Crear una instancia de Empleados
        empleados1.nombreEmpleados();
        empleados1.edadEmpleados();

        System.out.println("Para ver la lista de empleados despedidos ingrese: 1");
        System.out.println("Si desea registrar un nuevo empleado despedido ingrese: 2");
        System.out.println("Si desea salir del programa puede ingresar cualquier otro caracter numero");


        opcion = input.nextInt();
        input.nextLine();

        switch (opcion) {
            case 1:

                break;
            case 2:
                empleados1.transferirEmpleadoDespedido();
                break;
            default:
                System.out.println("Hasta luego");
        }
    }
    public void subMenuDespedir() {
        System.out.println("Seleccione al empleado por su numero de idetificacion en la lista");
        System.out.println("¿Esta seguro que quiere registar al empleado" + "como despedido?");
        System.out.println("Empleado despedido");
        System.out.println("Para ver la lista de empleados despedidos ingrese: 1");
        System.out.println("Para registrar otro empleado despedido ingrese 2");
        System.out.println("Si desea dalir del programa puede ingresar cualquier otro caracter numero");
        opcion = input.nextInt();

        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            default: System.out.println("Hasta luego");
        }
    }
    public void menuModificarSalario() {


        opcion = input.nextInt();

        switch (opcion) {

        }
    }
}

