package ClasesAbstractas;

public class DepartamentoContabilidad extends Departamento {
    public DepartamentoContabilidad() {
        this.nombre = "Contabilidad";
    }

    @Override
    public double aplicarBono(double salario) {
        return salario + 10;
    }
}

