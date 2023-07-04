import java.util.Scanner;
class Empleados {
    private String[] listaNombres;
    private int[] listaEdades;
    private double[] listaSalarios;
    private String[] listaNombresDespedidos;
    private int[] listaEdadesDespedidos;
    private double[] listaSalariosDespedidos;
    public Empleados() {
        listaNombres = new String[15];
        listaEdades = new int[15];
        listaSalarios = new double[15];
        listaNombresDespedidos = new String[15];
        listaEdadesDespedidos = new int[15];
        listaSalariosDespedidos = new double[15];
        nombreEmpleados();
        edadEmpleados();
        salarioEmpleados();
    }
    private void nombreEmpleados() {
        listaNombres[0] = "Ardeen Zanicchi Chinge";
        listaNombres[1] = "Lindsay Mularkey Lemoir";
        listaNombres[2] = "Murvyn Arnolds Shawell";
        listaNombres[3] = "Juanita Matura Burnsell";
        listaNombres[4] = "Evita Berceros Etherton";
        listaNombres[5] = "Hermina Kynastone Hotchkin";
        listaNombres[6] = "King Havvock Dyke";
        listaNombres[7] = "Elisa Klugel Ryce";
        listaNombres[8] = "Ethe Eakley Boatright";
        listaNombres[9] = "Gannie Frayling O'Fergus";
    }
    private void edadEmpleados() {
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
    private void salarioEmpleados() {
        listaSalarios[0] = 50000.0;
        listaSalarios[1] = 60000.0;
        listaSalarios[2] = 55000.0;
        listaSalarios[3] = 45000.0;
        listaSalarios[4] = 40000.0;
        listaSalarios[5] = 70000.0;
        listaSalarios[6] = 45000.0;
        listaSalarios[7] = 55000.0;
        listaSalarios[8] = 60000.0;
        listaSalarios[9] = 50000.0;
    }
    public void listarEmpleados() {
        for (int i = 0; i < listaNombres.length; i++) {
            if (listaNombres[i] != null) {
                System.out.println("Nombre: " + listaNombres[i] + ", Edad: " + listaEdades[i] + ", Salario: " + listaSalarios[i]);
            }
        }
    }
    public void contratarEmpleado(String nombre, int edad, double salario) {
        for (int i = 0; i < listaNombres.length; i++) {
            if (listaNombres[i] == null) {
                listaNombres[i] = nombre;
                listaEdades[i] = edad;
                listaSalarios[i] = salario;
                break;
            }
        }
    }
    public void despedirEmpleado(String nombre) {
        for (int i = 0; i < listaNombres.length; i++) {
            if (listaNombres[i] != null && listaNombres[i].equalsIgnoreCase(nombre)) {
                listaNombresDespedidos[i] = listaNombres[i];
                listaEdadesDespedidos[i] = listaEdades[i];
                listaSalariosDespedidos[i] = listaSalarios[i];
                listaNombres[i] = null;
                listaEdades[i] = 0;
                listaSalarios[i] = 0;
                break;
            }
        }
    }
    public void modificarSalario(String nombre, double porcentaje) {
        for (int i = 0; i < listaNombres.length; i++) {
            if (listaNombres[i] != null && listaNombres[i].equalsIgnoreCase(nombre)) {
                double aumento = listaSalarios[i] * (porcentaje / 100);
                listaSalarios[i] += aumento;
                break;
            }
        }
    }
    public void imprimirListaEmpleadosDespedidos() {
        System.out.println("Lista de empleados despedidos:");
        for (int i = 0; i < listaNombresDespedidos.length; i++) {
            if (listaNombresDespedidos[i] != null) {
                System.out.println("Nombre: " + listaNombresDespedidos[i] + ", Edad: " + listaEdadesDespedidos[i] + ", Salario: " + listaSalariosDespedidos[i]);
            }
        }
    }
}



