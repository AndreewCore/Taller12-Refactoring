public class Empleado  {
    private String nombre;
    private double salarioBase;
    private int horasTrabajadas;
    private String departamento;
    private String genero; // Campo movido hacia arriba

    public Empleado() {}

    public Empleado(String nombre, double salarioBase, int horasTrabajadas, double tarifaHora, String departamento, String genero) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
        this.genero = genero;
    }

    public double calcularSalario() {
        validarDatos();
        double salarioTotal = calcularSalarioConHorasExtra();
        return aplicarBonoDepartamento(salarioTotal);
    }

    private void validarDatos() {
        if (salarioBase <= 0) {
            throw new IllegalArgumentException("El salario debe ser mayor a 0");
        }
        if (horasTrabajadas < 0) {
            throw new IllegalArgumentException("Las horas trabajadas deben ser mayor o igual a 0");
        }
    }

    private double calcularSalarioConHorasExtra() {
        double salario = salarioBase;
        if (horasTrabajadas > 40) {
            salario += (horasTrabajadas - 40) * 50;
        }
        return salario;
    }

    private double aplicarBonoDepartamento(double salario) {
        switch (departamento) {
            case "Sistemas":
                return salario + 20;
            case "Contabilidad":
                return salario + 10;
            default:
                return salario;
        }
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void imprimirDetalles() {
        imprimirDetallesBasicos();
        imprimirDetallesEspecificos();
    }
    protected void imprimirDetallesBasicos() {
        System.out.println("=== DETALLES DEL EMPLEADO ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Género: " + genero);
        System.out.println("Salario Base: $" + String.format("%.2f", salarioBase));
        System.out.println("Horas Trabajadas: " + horasTrabajadas);
        System.out.println("Departamento: " + departamento);
    }
    protected abstract void imprimirDetallesEspecificos();

    
}

