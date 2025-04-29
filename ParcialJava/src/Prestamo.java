import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Prestamo {
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private List<LineaPrestamo> lineas = new ArrayList<>();

    public Prestamo(Date fechaPrestamo, Date fechaDevolucion) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public void agregarLineasPrestamos(Ejemplar ejemplar) {
        LineaPrestamo linea = new LineaPrestamo();
        linea.setEjemplar(ejemplar);

        Calendar cal = Calendar.getInstance();
        cal.setTime(fechaPrestamo != null ? fechaPrestamo : new Date());
        cal.add(Calendar.DATE, 7);
        linea.setFechaDevolucionEstimada(cal.getTime());

        lineas.add(linea);
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public List<LineaPrestamo> getLineas() {
        return lineas;
    }

    public void setLineas(List<LineaPrestamo> lineas) {
        this.lineas = lineas;
    }

}
