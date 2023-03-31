import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedicoTest {

    @Test
    void deveRetornarSalarioMedicoComClinecoGeral() {
        Formacao formacao = new ClinicoGeral();
        Medico medico = new Medico(10000.0f);
        medico.setFormacao(formacao);
        assertEquals(11000.0f, medico.calcularSalario(), 0.05f);
    }

    @Test
    void deveRetornarSalarioMedicoComOrtopedia() {
        Formacao formacao = new Ortopedista();
        Medico medico = new Medico(10000.0f);
        medico.setFormacao(formacao);
        assertEquals(11400.0f, medico.calcularSalario(), 0.07f);
    }

    @Test
    void deveRetornarSalarioMedicoComGinecologia() {
        Formacao formacao = new Ginecologista();
        Medico medico = new Medico(10000.0f);
        medico.setFormacao(formacao);
        assertEquals(11600.0f, medico.calcularSalario(), 0.08f);
    }

    @Test
    void deveRetornarSalarioMedicoComCardiologia() {
        Formacao formacao = new Cardiologista();
        Medico medico = new Medico(10000.0f);
        medico.setFormacao(formacao);
        assertEquals(11800.0f, medico.calcularSalario(), 0.09f);
    }
}
