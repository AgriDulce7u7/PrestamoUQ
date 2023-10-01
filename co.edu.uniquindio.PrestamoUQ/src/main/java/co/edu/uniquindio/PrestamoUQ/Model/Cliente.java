package co.edu.uniquindio.PrestamoUQ.Model;

public class Cliente {
    private String nombre;
    private String apellido;
    private String cedula;
    private int edad;
    PrestamoUQ ownedByPrestamoUQ;

    /* Constructor Vacío */
    public Cliente() {
    }

    /* Constructor */
    public Cliente(String nombre, String apellido, String cedula, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
    }

    /* Getters and Setters */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /* Función para poder leer el cliente */
    @Override
    public String toString() {
        return "Cliente {" +
                "nombre: '" + nombre + '\'' +
                ", apellido: '" + apellido + '\'' +
                ", cedula: '" + cedula + '\'' +
                ", edad: " + edad +
                '}';
    }
}
