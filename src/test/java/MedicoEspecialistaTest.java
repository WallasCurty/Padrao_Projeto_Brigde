import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedicoEspecialistaTest {

    @Test
    void deveRetornarSalarioMedicoEspecialistaComClinecoGeral() {
        Formacao formacao = new ClinicoGeral();
        Medico medico = new Medico(20000.0f);
        medico.setFormacao(formacao);
        assertEquals(21000.0f, medico.calcularSalario(), 0.05f);
    }

    @Test
    void deveRetornarSalarioMedicoComOrtopedia() {
        Formacao formacao = new Ortopedista();
        Medico medico = new Medico(20000.0f);
        medico.setFormacao(formacao);
        assertEquals(21400.0f, medico.calcularSalario(), 0.07f);
    }

    @Test
    void deveRetornarSalarioMedicoComGinecologia() {
        Formacao formacao = new Ginecologista();
        Medico medico = new Medico(20000.0f);
        medico.setFormacao(formacao);
        assertEquals(21600.0f, medico.calcularSalario(), 0.08f);
    }

    @Test
    void deveRetornarSalarioMedicoComCardiologia() {
        Formacao formacao = new Cardiologista();
        Medico medico = new Medico(20000.0f);
        medico.setFormacao(formacao);
        assertEquals(21800.0f, medico.calcularSalario(), 0.09f);
    }
}
