package ClasesAbstractas;

public class DepartamentoSistemas extends Departamento {
    public DepartamentoSistemas() {
        this.nombre = "Sistemas";
    }

    @Override
    public double aplicarBono(double salario) {
        return salario + 20;
    }
}

