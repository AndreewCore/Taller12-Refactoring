package ClasesAbstractas;

public class DepartamentoGenerico extends Departamento {
    public DepartamentoGenerico(String nombre) { this.nombre = nombre; }

    @Override
    public double aplicarBono(double salario) {
        return salario; // Sin bono
    }
}
