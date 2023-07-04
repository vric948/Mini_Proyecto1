import java.util.Scanner;

public class Empleados {
    private String[] listaNombres;
    private int[] listaEdades;
    private String[] listaNombresDespedidos;
    private int[] listaEdadesDespedidos;

    public void nombreEmpleados() {

        listaNombres = new String[15];
        listaNombres[0] = "Ardeen Zanicchi Chinge";
        listaNombres[1] = "Lindsay Mularkey Lemoir";
        listaNombres[2] = "Murvyn Arnolds Shawell";
        listaNombres[3] = "Juanita Matura Burnsell";
        listaNombres[4] = "Evita Berceros Etherton";
        listaNombres[5] = "Hermina Kynastone Hotchkin";
        listaNombres[6] = "King Havvock Dyke";
        listaNombres[7] = "Elisa Klugel Ryce";
        listaNombres[8] = "Ethe Eakley Boatright";
        listaNombres[9] = "Gannie Frayling Fergus";
    }

    public void edadEmpleados() {
        listaEdades = new int[15];
        listaEdades[0] = 35;
        listaEdades[1] = 51;
        listaEdades[2] = 52;
        listaEdades[3] = 19;
        listaEdades[4] = 27;
        listaEdades[5] = 61;
        listaEdades[6] = 23;
        listaEdades[7] = 47;
        listaEdades[8] = 46;
        listaEdades[9] = 51;
    }

    public void imprimirListaEmpleados() {
        for (int i = 0; i < listaNombres.length; i++) {
            System.out.println("Nombre: " + listaNombres[i] + ", Edad: " + listaEdades[i]);
        }
    }

    public void registrarEmpleados() {
        Scanner input = new Scanner(System.in);
        int indice = 10;
        String respuesta = "";

        while (indice < listaNombres.length) {
            System.out.print("¿Desea ingresar un nuevo empleado? (s/n): ");
            respuesta = input.nextLine();

            if (respuesta.equalsIgnoreCase("s")) {
                System.out.print("Ingrese el nombre completo del empleado: ");
                listaNombres[indice] = input.nextLine();
                System.out.print("Ingrese la edad del empleado: ");
                listaEdades[indice] = input.nextInt();
                input.nextLine();
                indice++;
            } else if (respuesta.equalsIgnoreCase("n")) {
                break;
            } else {
                System.out.println("Respuesta no válida. Por favor, ingrese 's' o 'n'.");
            }
        }
    }
    public void nombresEmpleadosDepesdidos() {
        listaNombresDespedidos = new String[15];
        listaNombresDespedidos[0] = "Victor Ibarra";
    }
    public void edadesEmpleadosDespedidos() {
        listaEdadesDespedidos = new int[15];
        listaEdadesDespedidos[0] = 28;

    }
    public void transferirEmpleadoDespedido() {
        Scanner input = new Scanner(System.in);
        String respuesta;

        do {
            System.out.print("Ingrese el nombre que ha sido despedido: ");
            String nombreEmpleado = input.nextLine();

            int indiceEmpleado = -1;
            for (int i = 0; i < listaNombres.length; i++) {
                if (listaNombres[i].equalsIgnoreCase(nombreEmpleado)) {
                    indiceEmpleado = i;
                    break;
                }
            }

            if (indiceEmpleado != -1) {
                if (listaNombresDespedidos == null) {
                    listaNombresDespedidos = new String[1];
                    listaEdadesDespedidos = new int[1];
                } else {
                    if (listaNombresDespedidos.length == listaEdadesDespedidos.length) {
                        System.out.println("No hay espacio disponible en la lista de empleados despedidos");
                        break;
                    }
                    String[] tempNombresDespedidos = new String[listaNombresDespedidos.length + 1];
                    int[] tempEdadesDespedidos = new int[listaEdadesDespedidos.length + 1];
                    System.arraycopy(listaNombresDespedidos, 0, tempNombresDespedidos, 0, listaNombresDespedidos.length);
                    System.arraycopy(listaEdadesDespedidos, 0, tempEdadesDespedidos, 0, listaEdadesDespedidos.length);
                    listaNombresDespedidos = tempNombresDespedidos;
                    listaEdadesDespedidos = tempEdadesDespedidos;
                }

                // Transferir empleado
                listaNombresDespedidos[listaNombresDespedidos.length - 1] = listaNombres[indiceEmpleado];
                listaEdadesDespedidos[listaEdadesDespedidos.length - 1] = listaEdades[indiceEmpleado];

                System.out.println("Los datos del empleado despedido ha sido transferidos");

                System.out.print("¿Desea transferir otro empleado despedido? (s/n): ");
                respuesta = input.nextLine();
            } else {
                System.out.println("Error: No se encontró ningún empleado con ese nombre");
                respuesta = "n";
            }
        } while (respuesta.equalsIgnoreCase("s"));
    }
}