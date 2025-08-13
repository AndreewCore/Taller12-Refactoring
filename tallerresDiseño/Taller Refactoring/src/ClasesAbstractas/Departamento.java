package ClasesAbstractas;

public abstract class Departamento {
    protected String nombre;

    public abstract double aplicarBono(double salario);
    public String getNombre() { return nombre; }
}
