import java.text.SimpleDateFormat;
import java.util.List;

public class Usuario {

    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private List<Prestamo> prestamos;

    public Usuario(String nombre, String apellido, String dni, String telefono, List<Prestamo> prestamos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.prestamos = prestamos;
    }

    public void mostrarHistorialPrestamos() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        if (prestamos == null || prestamos.isEmpty()) {
            System.out.println("No hay préstamos registrados para " + nombre + " " + apellido);
            return;
        }

        for (Prestamo prestamo : prestamos) {
            System.out.println("Fecha de préstamo: " + formato.format(prestamo.getFechaPrestamo()));
            for (LineaPrestamo linea : prestamo.getLineas()) {
                System.out.println("  Ejemplar: " + linea.getEjemplar().getCodigo()
                        + " | Fecha devolución estimada: " + formato.format(linea.getFechaDevolucionEstimada()));
            }
            System.out.println("--------------------------------------------------");
        }
    }

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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }


}
