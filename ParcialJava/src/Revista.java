import java.util.List;

public class Revista extends Publicacion {
    private String codigo;
    private EstadoEjemplar estado;
    private Publicacion publicacion;
    private boolean estaDisponible;

    public Revista(String titulo, Genero genero, List<Ejemplar> ejemplares, String codigo, EstadoEjemplar estado, Publicacion publicacion, boolean estaDisponible) {
        super(titulo, genero, ejemplares);
        this.codigo = codigo;
        this.estado = estado;
        this.publicacion = publicacion;
        this.estaDisponible = estaDisponible;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public EstadoEjemplar getEstado() {
        return estado;
    }

    public void setEstado(EstadoEjemplar estado) {
        this.estado = estado;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public void setEstaDisponible(boolean estaDisponible) {
        this.estaDisponible = estaDisponible;
    }

    public boolean isEstaDisponible() {
        return estaDisponible;
    }
}
