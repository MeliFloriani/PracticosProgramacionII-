import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Direccion direccion = new Direccion("Libertad", 123, "Mendoza", "C5511");

        Editorial editorial = new Editorial("Caricaticos", "https://planetaCaricaticos.com");

        Genero genero = new Genero("Ciencia ficcion", "Ficcion basada en ciencia imaginada");

        Autor autor1 = new Autor("Ismael", "argentina");
        autor1.setFechaNacimiento(LocalDate.of(1920, 1, 2));

        Autor autor2 = new Autor("Marina", "chilena");
        autor2.setFechaNacimiento(LocalDate.of(1917, 12, 16));

        Libro libro = new Libro("Vision al futuro", "CF1585");
        libro.setGenero(genero);
        libro.setEditorial(editorial);
        libro.setAutores(Arrays.asList(autor1, autor2));

        Ejemplar ejemplar1 = new Ejemplar();
        ejemplar1.setCodigo("LIB001");
        ejemplar1.setEstado(EstadoEjemplar.DISPONIBLE);
        ejemplar1.setPublicacion(libro);

        Ejemplar ejemplar2 = new Ejemplar();
        ejemplar2.setCodigo("LIB002");
        ejemplar2.setEstado(EstadoEjemplar.DISPONIBLE);
        ejemplar2.setPublicacion(libro);

        libro.setEjemplares(Arrays.asList(ejemplar1, ejemplar2));

        Revista revista = new Revista();
        revista.setTitulo("Explora Ciencia");
        revista.setVolumen(5);
        revista.setNumero(2);
        revista.setGenero(genero);

        Ejemplar ejemplarRevista = new Ejemplar();
        ejemplarRevista.setCodigo("REV001");
        ejemplarRevista.setEstado(EstadoEjemplar.DISPONIBLE);
        ejemplarRevista.setPublicacion(revista);

        revista.setEjemplares(List.of(ejemplarRevista));

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.setPublicaciones(Arrays.asList(libro, revista));

        Usuario usuario = new Usuario("Maria", "Lopez", "45869248", "2615895544");

        Prestamo prestamo = new Prestamo();
        prestamo.setFechaPrestamo(new Date());
        prestamo.agregarLineaPrestamo(ejemplar1);

        usuario.setPrestamos(List.of(prestamo));


        biblioteca.setUsuarios(List.of(usuario));

        System.out.println("Biblioteca creada con libro y revista registrados.");
        System.out.println("Usuario registrado con un préstamo:");
        usuario.mostrarHistorialPrestamos();
    }
}
