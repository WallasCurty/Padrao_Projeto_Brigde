public class Medico extends Cargo{

    public Medico(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {

        return this.salarioBase;
    }
}
