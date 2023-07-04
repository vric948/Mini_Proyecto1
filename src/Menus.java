import java.util.Scanner;

class Menus {
    Scanner input = new Scanner(System.in);
    int opcion;
    Empleados empleados = new Empleados();

    public void menuBienvenida() {
        System.out.println("Bienvenido, seleccione a continuación una de las opciones:");
        System.out.println("1. Ingresar a la lista de empleados");
        System.out.println("2. Sección de contratación");
        System.out.println("3. Sección de terminación de contrato");
        System.out.println("4. Sección de modificación de sueldo");
        System.out.println("0. Salir del programa");
        System.out.println();

        opcion = Integer.parseInt(input.nextLine());

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
        System.out.println("A continuación se muestra la lista de empleados actuales\n");
        empleados.listarEmpleados();
        System.out.println("Si desea regresar al menú principal ingrese: 1");
        System.out.println("Si desea salir del programa, ingrese cualquier otro número");

        opcion = input.nextInt();
        input.nextLine();

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
        System.out.println("Ingrese el nombre del empleado:");
        String nombre = input.nextLine();

        System.out.println("Ingrese la edad del empleado:");
        while (!input.hasNextInt()) {
            System.out.println("Edad inválida. Ingrese un número entero:");
            input.next();
        }
        int edad = input.nextInt();
        input.nextLine();

        System.out.println("Ingrese el salario del empleado:");
        while (!input.hasNextDouble()) {
            System.out.println("Salario inválido. Ingrese un número con decimal:");
            input.next();
        }
        double salario = input.nextDouble();
        input.nextLine();

        empleados.contratarEmpleado(nombre, edad, salario);

        System.out.println("El empleado ha quedado resgistrado");

        menuBienvenida();
    }
    public void menuDespedir() {
        System.out.println("Ingrese el nombre del empleado:");
        String nombre = input.nextLine();

        empleados.despedirEmpleado(nombre);

        System.out.println("El empleado ha sido movido a la lista de despedidos");

        menuBienvenida();
    }
    public void menuModificarSalario() {
        System.out.println("Ingrese el nombre del empleado:");
        String nombre = input.nextLine();
        System.out.println("Ingrese el porcentaje de sueldo que quier aumentar:");
        double porcentaje = input.nextDouble();
        input.nextLine();

        empleados.modificarSalario(nombre, porcentaje);

        System.out.println("El salario ha sido modificado");
        menuBienvenida();
    }
}
