import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteFuncionario {

    @Test
    public void testaFuncionario() {
        Funcionario funcionario = new Funcionario("Leonardo", "08662040918", 2500.50);

        Assertions.assertEquals("Leonardo",funcionario.getNome());
        Assertions.assertEquals("08662040918",funcionario.getCpf());
        Assertions.assertEquals(2500.50,funcionario.getSalario());
        Assertions.assertEquals(250.05,funcionario.getBonificacao());
    }

    @Test
    public void testaFuncionarioTipoGerente() {
        Gerente gerente = new Gerente("Leonardo", "08662040918", 2500.50, 123);

        Assertions.assertEquals("Leonardo",gerente.getNome());
        Assertions.assertEquals("08662040918",gerente.getCpf());
        Assertions.assertEquals(2500.50,gerente.getSalario());
        Assertions.assertEquals(2500.50,gerente.getBonificacao());
    }

    @Test
    public void testaAutenticacaoGerente() {
        Gerente gerente = new Gerente("Leonardo", "08662040918", 2500.50, 123);

        Assertions.assertTrue(gerente.autentica(123));
        Assertions.assertFalse(gerente.autentica(321));
    }

}
