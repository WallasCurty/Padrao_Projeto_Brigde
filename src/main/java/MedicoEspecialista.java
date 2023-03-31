public class MedicoEspecialista extends Cargo{

    private int numHorasTrabalhadas;

    public MedicoEspecialista(float salarioBase){

        super(salarioBase);
    }

    public void setNumHorasTrabalhadas(int numHorasTrabalhadas) {

        this.numHorasTrabalhadas = numHorasTrabalhadas;
    }

    public float calcularSalario() {
        return this.salarioBase * this.numHorasTrabalhadas * (50 + this.formacao.percentualAumentoHora());
    }
}
