package co.edu.uniquindio.PrestamoUQ.Model;

import java.util.ArrayList;
import java.util.List;

public class PrestamoUQ {
    private String nombre;

    /* Array para crear una lista  de clientes */
    List<Cliente> listaClientes = new ArrayList<>();

    /* Constructor Vacío */
    public PrestamoUQ() {
    }

    /* Getters and Setters */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    /**
     * Método para crear un cliente
     * @param nombre
     * @param apellido
     * @param edad
     * @param cedula
     * @return boolean
     */
    public boolean crearCliente(String nombre, String apellido, int edad, String cedula){
        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setEdad(edad);
        cliente.setCedula(cedula);
        getListaClientes().add(cliente);

        return true;
    }

    /**
     * Método para obtener la lista de todos los clientes
     * @return List<Cliente>
     */
    public List<Cliente> obtenerClientes() {
        return getListaClientes();
    }

    /**
     * Método para actualizar un cliente por medio de la cedula
     * */
    public void actualizarCliente(String cedula, String nuevoNombre, String nuevosApellido, int nuevaEdad) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getCedula().equals(cedula)) {
                cliente.setNombre(nuevoNombre);
                cliente.setApellido(nuevosApellido);
                cliente.setEdad(nuevaEdad);
                System.out.println("Cliente actualizado exitosamente :"+'\n'+cliente.toString());
                return;
            }
        }
    }

    /**
     * Método para eliminar un cliente por medio de la cedula
     * */
    public void eliminarCliente(String cedula) {
        int tamanioLista = getListaClientes().size();
        for (int i=0; i < tamanioLista; i++){
            Cliente cliente = getListaClientes().get(i);
            if(cliente.getCedula().equalsIgnoreCase(cedula)){
                getListaClientes().remove(i);
                break;
            }
        }
    }

    /**
     * Métdo para leer el préstamo
     * */
    @Override
    public String toString() {
        return "PrestamoUq{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
