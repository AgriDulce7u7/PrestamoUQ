package co.edu.uniquindio.PrestamoUQ;

import co.edu.uniquindio.PrestamoUQ.Model.PrestamoUQ;
import co.edu.uniquindio.PrestamoUQ.Model.Cliente;
import co.edu.uniquindio.PrestamoUQ.Util.CapturaDatosUtil;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PrestamoUQ prestamoUQ = inializarDatosPrueba();

        /** Funciones CRUD
         * */
        //Create
        crearCliente("Mariana", "Lopez", 18, "1094568023", prestamoUQ);
        crearCliente("Rosalva", "Gonzales", 45, "1123564605", prestamoUQ);
        crearCliente("Carlos", "Monroy", 21, "1000256235", prestamoUQ);
        crearCliente("Antonio", "Carvajal", 30, "1020123556", prestamoUQ);

        //Read
        mostrarInformacionCliente(prestamoUQ);
        System.out.println("Clientes creados  correctamente.");

        //Update
        actualizarCliente(prestamoUQ, "1094568023", "Ana", "Cruz", 20);

        //Delete
        eliminarCliente(prestamoUQ, "1000256235");
        System.out.println("-----> Informacion luego de eliminar");
        mostrarInformacionCliente(prestamoUQ);

        //Capturar de datos de forma dinamica
        int valor = CapturaDatosUtil.leerEnteroVentana("Ingrese la cedula del cliente: ");
        System.out.println("Valor obtenido es: "+valor);

        /**
         * Metodo para mostrar menú
         * */
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {

            System.out.println("1. Crear Cliente ");
            System.out.println("2. Leer Cliente ");
            System.out.println("3. Actualizar Cliente ");
            System.out.println("4. Eliminar Cliente ");
            System.out.println("5. Salir ");

            try {

                System.out.println("Escribe una de las opciones: ");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        Main.crearCliente("Mariana", "Lopez", 18, "1094568023", prestamoUQ);
                        Main.crearCliente("Rosalva", "Gonzales", 45, "1123564605", prestamoUQ);
                        Main.crearCliente("Carlos", "Monroy", 21, "1000256235", prestamoUQ);
                        Main.crearCliente("Antonio", "Carvajal", 30, "1020123556", prestamoUQ);
                        System.out.println("Has seleccionado la opcion 1.");
                        break;
                    case 2:
                        Main.mostrarInformacionCliente(prestamoUQ);
                        System.out.println("Has seleccionado la opcion 2.");
                        break;
                    case 3:
                        Main.actualizarCliente(prestamoUQ, "1094568023", "Ana", "Cruz", 20);
                        System.out.println("Has seleccionado la opcion 3.");
                        break;
                    case 4:
                        Main.eliminarCliente(prestamoUQ, "1000256235");
                        System.out.println("Has seleccionado la opcion 4.");
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número.");
                sn.next();
            }
        }
    }

    /**
     * Método para inializar  los datos del prestamo
     * */
    private static PrestamoUQ inializarDatosPrueba() {
        PrestamoUQ prestamoUQ = new PrestamoUQ();
        prestamoUQ.setNombre("Prestamo Rápido");
        System.out.println(prestamoUQ.getNombre());

        return prestamoUQ;
    }

    /**
     * Método para crear clientes
     * */
    private static void crearCliente(String nombre,
                                     String apellido,
                                     int edad,
                                     String cedula,
                                     PrestamoUQ prestamoUQ) {
        prestamoUQ.crearCliente(nombre, apellido, edad, cedula);
    }

    /**
     * Método para leer la lista de clientes
     * */
    private static void mostrarInformacionCliente(PrestamoUQ prestamoUQ) {
        List<Cliente> listaClientes = prestamoUQ.obtenerClientes();
        int tamanioLista = listaClientes.size();
        for(int i=0; i < tamanioLista; i++){
            Cliente cliente = listaClientes.get(i);
            System.out.println(cliente.toString());
        }
    }

    /**
     * Método para actualizar un cliente
     * */
    private static void actualizarCliente(PrestamoUQ prestamoUQ, String cedula, String nuevoNombre, String nuevosApellido, int nuevaEdad){ prestamoUQ.actualizarCliente(cedula, nuevoNombre,nuevosApellido, nuevaEdad);
    }

    /**
     * Método para  eliminar un cliente
     * */
    private static void eliminarCliente(PrestamoUQ prestamoUQ, String cedula) {
        prestamoUQ.eliminarCliente(cedula);
    }
}