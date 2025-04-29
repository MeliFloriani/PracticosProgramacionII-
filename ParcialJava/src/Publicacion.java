import java.util.List;
import java.util.stream.Collectors;

public class Publicacion {

    private String titulo;
    private Genero genero;
    private List<Ejemplar> ejemplares;

    public Publicacion(String titulo, Genero genero) {
        this.titulo = titulo;
        this.genero = genero;
    }

    public List<Ejemplar> getEjemplarDisponible() {
        return ejemplares.stream()
                .filter(Ejemplar::estaDisponible)
                .collect(Collectors.toList());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(List<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }

    public List<Ejemplar> getEjemplaresDisponibles() {
        return ejemplares.stream()
                .filter(Ejemplar::isEstaDisponible)
                .toList();
    }

}
