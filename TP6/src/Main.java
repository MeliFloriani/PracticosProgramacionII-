//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empresa emp = new Empresa();

        emp.agregarEmpleado(new EmpleadoSalarioFijo("123", "Ana", "López", 2021, 45000));
        emp.agregarEmpleado(new EmpleadoAComision("123", "Pepe", "Gómez", 2021, 30000, 100, 500));
        emp.agregarEmpleado(new EmpleadoSalarioFijo("123", "Luis", "Gámez", 2019, 50000));
        emp.agregarEmpleado(new EmpleadoAComision("123", "Leo", "Torres", 2017, 30000, 200, 100));
        emp.agregarEmpleado(new EmpleadoSalarioFijo("123", "María", "Pérez", 2014, 100000));
        emp.mostrarSalarios();

        System.out.println("Empleado con más clientes: " +
                emp.empleadoConMasClientes().nombreCompleto());
    }
}